package com.cookieDome;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String name=req.getParameter("name");
			String pass=req.getParameter("pass");
			System.out.println("账号是"+name);
			System.out.println("密码是"+pass);
			//创建Cookie对象
			Cookie cookie=new Cookie("user",name+","+pass);
			//响应浏览器发生Cookie对象
			resp.addCookie(cookie);
			
			req.getRequestDispatcher("/2.jsp").forward(req, resp);
	}
}
