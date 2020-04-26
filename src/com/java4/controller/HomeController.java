package com.java4.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java4.dao.MessageDao;
import com.java4.dao.MessageDaoImpl;

@WebServlet("/home")
public class HomeController extends HttpServlet {

	public MessageDao messageDao = new MessageDaoImpl();
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("msg", messageDao.getAll().get(0).getMessage());
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
