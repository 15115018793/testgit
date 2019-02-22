package com.cookieDome;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
			String age=req.getParameter("age");
			String job=req.getParameter("job");
		/*	String jg=null;
			String js=null;
			for(String job1:job){
				if("1".equals(job1)){
					jg=job1;
					
				}
				if("2".equals(job1)){
					 js=job1;
					
				}

			}*/
			resp.setCharacterEncoding("UTF-8");
			resp.setContentType("text/html;charset=UTF-8");
		//获得Cookies对象数组
			Cookie cookie[]=req.getCookies();
			String userVal=null;
		
			
			for(Cookie ck:cookie){
				//判断Cookie是否匹配
				if("user".equals(ck.getName())){
				//获取对应的值
					userVal=ck.getValue();
			}
			
	}
			String name=null;
			String pass=null;
		if(userVal!=null){
			//分割
			String allValus[]=userVal.split(",");
			//取出值
			name=allValus[0];
			pass=allValus[1];
		}

		//输出所有值
		resp.getWriter().println("账号是："+name);
		resp.getWriter().println("密码是："+pass);
		resp.getWriter().println("职位是："+job);
		resp.getWriter().println("年龄是"+age);
		
	
	}
}