package com.digit.hibernate.Servlet.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.digit.hibernate.Servlet.model.HibernateManager;
import com.digit.hibernateServlet.bean.AadharDetail;

@WebServlet("/Register")
public class Register extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		AadharDetail ad1= new AadharDetail();
		ad1.setAdh_no(Integer.parseInt(req.getParameter("adh_no")));
		ad1.setAddress(req.getParameter("Address"));
		ad1.setCity(req.getParameter("city"));
		ad1.setState(req.getParameter("state"));
		ad1.setName(req.getParameter("name"));
		ad1.setFather_name(req.getParameter("father_name"));
		ad1.setDob(req.getParameter("dob"));
		
		HibernateManager hm= new HibernateManager();
		hm.insert(ad1);
		
		resp.sendRedirect(getServletInfo());
		
	}
}
