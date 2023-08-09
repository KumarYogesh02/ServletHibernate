package com.digit.hibernate.Servlet.model;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

import com.digit.hibernateServlet.bean.AadharDetail;







public class HibernateManager {
	private Session session;
	private Query q;
	private List li;
	
	public HibernateManager() {
		Configuration confi = new Configuration().configure("hibernate.cfg.xml");
		ServiceRegistryBuilder sr=new ServiceRegistryBuilder().applySettings(confi.getProperties());
		SessionFactory sessionFactory = confi.buildSessionFactory(sr.buildServiceRegistry());
		session= sessionFactory.openSession();
		System.out.println("Connected to pf.....");
	}

	public void insert(AadharDetail ad) {
		
		Transaction tran= session.beginTransaction();
		session.save(ad);
		tran.commit();
		System.out.println("object saved");
		
	}
	public void update(int adh_no, String name) {
		Transaction tran= session.beginTransaction();
		AadharDetail ad1=(AadharDetail) session.get(AadharDetail.class, adh_no);
		ad1.setName(name);
//		System.out.println(ad1.getName());
		session.update(ad1);
		tran.commit();
		System.out.println("update success");
		
		
	}
	public AadharDetail select(int id) {
		Transaction tr=session.beginTransaction();
		q = session.createQuery("From AadharDetail where adh_no=:adh_no");
		q.setParameter("adh_no", id);
		li = q.list();
		Iterator itr= li.iterator();
		AadharDetail a=null;
		while(itr.hasNext()) {
			 a =(AadharDetail) itr.next();
			
		}
		tr.commit();
		return a;
		
	}
	public void delete(int adh_no) {
		Transaction tran= session.beginTransaction();
		AadharDetail ad1=(AadharDetail) session.get(AadharDetail.class, adh_no);
		session.delete(ad1);
		tran.commit();
		System.out.println("delete success");
	}
//	public void specificread(int adh_no) {
//		Transaction tran= session.beginTransaction();
//		AadharDetail c= (AadharDetail) session.get(AadharDetail.class, adh_no);
//		li=((Query) c).list();
//		Iterator itr=li.iterator();
//		while(itr.hasNext()) {
//			c.setAddress();
//		}
//		tran.commit();
//	}
}
