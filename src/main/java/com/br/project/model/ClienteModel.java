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
	    	System.out.println("Nome Gravar: "+cliente.getNome());
	        session.beginTransaction();
	        session.save(cliente);
	        session.getTransaction().commit();
	        return true;
	    }
	    catch (Exception e) {
	        session.getTransaction().rollback();
	        session.close();
	        return false;
	    }	    
	}
	

	   public List listalfabetica( ){
		  Session session = HibernateUtils.getSessionFactory().getCurrentSession();
	      try{
	    	 Map users = null;
	    	 session.beginTransaction();
	         String sql = "SELECT * FROM USUARIO ORDER BY NOME";
	         SQLQuery query = session.createSQLQuery(sql);
	         query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
	         List data = query.list();
	         System.out.println("Retorno: "+data);
	         session.getTransaction().commit();
	         return data;
	      }catch (Exception e) {
		        session.getTransaction().rollback();		        
		    }
		return null;
	   }
	   
	   public List listcidade( ){
			  Session session = HibernateUtils.getSessionFactory().getCurrentSession();
		      try{
		    	 Map users = null;
		    	 session.beginTransaction();
		         String sql = "SELECT * FROM USUARIO ORDER BY CIDADE";
		         SQLQuery query = session.createSQLQuery(sql);
		         query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		         List data = query.list();
		         System.out.println("Retorno: "+data);
		         session.getTransaction().commit();
		         return data;
		      }catch (Exception e) {
			        session.getTransaction().rollback();		        
			    }
			return null;
		}
	   public List listpais( ){
			  Session session = HibernateUtils.getSessionFactory().getCurrentSession();
		      try{
		    	 Map users = null;
		    	 session.beginTransaction();
		         String sql = "SELECT * FROM USUARIO ORDER BY PAIS";
		         SQLQuery query = session.createSQLQuery(sql);
		         query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		         List data = query.list();
		         System.out.println("Retorno: "+data);
		         session.getTransaction().commit();
		         return data;
		      }catch (Exception e) {
			        session.getTransaction().rollback();		        
			    }
			return null;
		   }
}
