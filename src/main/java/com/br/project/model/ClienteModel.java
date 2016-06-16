package com.br.project.model;

import java.io.Serializable;

import org.hibernate.Session;
import com.br.project.bean.ClienteBean;
import com.br.project.connection.HibernateUtils;

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
}
