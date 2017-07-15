package com.iberrylogin.servlets;

import java.io.IOException;
import java.sql.Statement;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iberrylogin.dao.VerifyLogin;
import com.iberrylogin.pojo.User;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   /* public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
*/
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String name = null;
		String pwd = null;
		
		String uname = request.getParameter("username");
		String passwd = request.getParameter("password");
		int flag=0;
		int status=0;
		
		flag=VerifyLogin.validate(uname,passwd,status);
	
		
		/*PrintWriter pw = response.getWriter();*/
		
		/*System.out.println(name);
		System.out.println(pwd);
		System.out.println(uname);
		System.out.println(passwd);
		System.out.println(name.equals(uname));*/
		
		if(flag==1){
			RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
			rd.include(request, response);
			
		}else if(flag==2){
			RequestDispatcher rd=request.getRequestDispatcher("Wrong.jsp");
			rd.include(request, response);
		}
		else{
			RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
			rd.include(request, response);
		}
		
		
		
		}
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}

