package com.digit.hibernate.Servlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.digit.hibernate.Servlet.model.HibernateManager;
import com.digit.hibernateServlet.bean.AadharDetail;
@WebServlet("/delete")
public class Delete extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AadharDetail ad= new AadharDetail();
		
		int add=ad.setAdh_no(Integer.parseInt(req.getParameter("adh_no")));
		System.out.println(add);
		HibernateManager hm= new HibernateManager();
		hm.delete(add);
	}

}
