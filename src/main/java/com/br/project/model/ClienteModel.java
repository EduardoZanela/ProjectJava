package com.br.project.model;

import java.io.Serializable;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import com.br.project.bean.ClienteBean;
import com.br.project.connection.HibernateUtils;
import org.hibernate.Criteria;
import java.util.*; 

public class ClienteModel {
	
	private static final long serialVersionUID = 1L;
	
	public boolean gravar(ClienteBean cliente) throws Exception {
	    Session session = HibernateUtils.getSessionFactory().getCurrentSession();
	    try {        	
	        session.beginTransaction();
	        session.save(cliente);
	        session.getTransaction().commit();
	        session.close();
	        return true;
	    }
	    catch (Exception e) {
	        session.getTransaction().rollback();
	        session.close();
	        return false;
	    }	    
	}
	

	   public Map listEmployeesScalar( ){
		  Session session = HibernateUtils.getSessionFactory().getCurrentSession();
	      try{
	    	 Map users = null;
	    	 session.beginTransaction();
	         String sql = "SELECT * FROM EMPLOYEE ORDER BY NOME";
	         SQLQuery query = session.createSQLQuery(sql);
	         query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
	         List data = query.list();
	
	         for(Object object : data)
	         {
	            users = (Map)object;
	            System.out.print("First Name: " + users.get("Nome")); 
	            System.out.println(", Salary: " + users.get("Cidade")); 
	         }
	         session.getTransaction().commit();
	         return users;
	      }catch (Exception e) {
		        session.getTransaction().rollback();		        
		    }
		return null;
	   }
}
