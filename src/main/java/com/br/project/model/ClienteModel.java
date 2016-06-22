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
	        return false;
	    }	    
	}
	

	   public List listaClientesOrdenado(String order){
		  Session session = HibernateUtils.getSessionFactory().getCurrentSession();
	      try{
	    	 session.beginTransaction();
	    	 List lista= session.createQuery("FROM ClienteBean ORDER BY "+order).list();
	         System.out.println("Lista: "+lista);
	         session.getTransaction().commit();
	         return lista;
	      }catch (Exception e) {
	    	  System.out.println("aas"+e);
		        session.getTransaction().rollback();		        
		    }
		return null;
	   }
}
