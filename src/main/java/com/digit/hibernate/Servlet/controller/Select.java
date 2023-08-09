package com.digit.hibernate.Servlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.digit.hibernate.Servlet.model.HibernateManager;
import com.digit.hibernateServlet.bean.AadharDetail;
@WebServlet("/select")

public class Select extends HttpServlet {
	
	private HttpSession session;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HibernateManager hm=new HibernateManager();
		AadharDetail a=hm.select(Integer.parseInt(req.getParameter("adh_no")));
		session = req.getSession(true);
		session.setAttribute("add",a.getAddress() );
		session.setAttribute("city", a.getCity());
		session.setAttribute("dob", a.getDob());
		session.setAttribute("adh", a.getAdh_no());
		session.setAttribute("state", a.getState());
		session.setAttribute("father", a.getFather_name());
		session.setAttribute("name", a.getName());
		
		resp.sendRedirect("/ServletHibernate/ViewAll.jsp");
		
	}

}
