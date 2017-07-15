package com.iberrylogin.dao;

import java.sql.*;

public class VerifyLogin {
	public static int validate(String name, String pass,int status) {
        //This program validates the user id and password
    	int flag=0;
    	String query1="select* from userloginpage";
    	String query2="insert into userloginpage values(?,?)";
    	System.out.println(name);
    	System.out.println(pass);
    	String uname=null;
    	String pwd=null;
    	ResultSet rs = null;
    	
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","babulavith@123");
			if(status==0){
				PreparedStatement st=con.prepareStatement(query1);
			
			
		
				rs=(ResultSet) st.executeQuery();
			
			
			
				while(rs.next()){
					System.out.println(rs.getString("username"));
					System.out.println(rs.getString("password"));
					uname=rs.getString("username");
					pwd=rs.getString("password");
					System.out.println(name.equals(uname));
				
				if((name.equals(uname))){
					if((pwd.equals(pass))){
						flag=1;
						break;
					}
					else{
						flag=2;
						break;
					}
				}
			}
			}
			if(status==1){
				PreparedStatement st=con.prepareStatement(query1);
				rs=st.executeQuery();
				while(rs.next()){
					System.out.println(rs.getString("username"));
					if(name.equals(rs.getString("username"))){
						System.out.println("username and password exists");
						flag=1;
						break;
						
					}else{
						PreparedStatement st1=con.prepareStatement(query2);
						st1.setString(1,name);
						st1.setString(2,pass);
						st1.executeUpdate();
						flag=2;
						break;
					}
					
					
				}
				
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
        return flag;
        
        
        /*Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","babulavith@123");
        Statement st = con.createStatement();*/
    }
}