package com.slksoft.web.controllers;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.slksoft.entity.Message;
import com.slksoft.entity.User;
import com.slksoft.service.MessageService;

@WebServlet("/compose")
public class ComposeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		User user=(User) req.getSession().getAttribute("user");
		
		if(user!=null)
		{
		req.getRequestDispatcher("/WEB-INF/jsp/compose.jsp")
		.forward(req, resp);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		Message msg=new Message();
		User user=(User) req.getSession().getAttribute("user");
		msg.setMsgFrom(user.getEmail());
		msg.setMsgTo(req.getParameter("msg_to"));
		msg.setSubject(req.getParameter("subject"));
		msg.setCc(req.getParameter("cc"));
		msg.setMsgBody(req.getParameter("msg_body"));
		msg.setSentAt(new Date());
		
		MessageService mser=new MessageService();
		
		mser.init();
		
		mser.addNewMessage(msg);
		
		req.getRequestDispatcher("/WEB-INF/jsp/compose.jsp");

		
	}
}
