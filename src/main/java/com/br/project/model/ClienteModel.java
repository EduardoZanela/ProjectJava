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
	        return true;
	    }
	    catch (Exception e) {
	        session.getTransaction().rollback();
	        return false;
	    }
	}
	

	   public boolean listEmployeesScalar( ){
		  Session session = HibernateUtils.getSessionFactory().getCurrentSession();
	      try{
	    	 session.beginTransaction();
	         String sql = "SELECT * FROM EMPLOYEE ORDER BY NOME";
	         SQLQuery query = session.createSQLQuery(sql);
	         query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
	         List data = query.list();
	
	         for(Object object : data)
	         {
	            Map row = (Map)object;
	            System.out.print("First Name: " + row.get("first_name")); 
	            System.out.println(", Salary: " + row.get("salary")); 
	         }
	         session.getTransaction().commit();
	         return true;
	      }catch (Exception e) {
		        session.getTransaction().rollback();
		        return false;
		    }
	   }
}
