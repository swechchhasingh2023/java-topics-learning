//package com.servletjspmaven.dao;
//
//import com.servletjspmaven.model.Alien;
//
//public class AlienDao {
//	public Alien getAlien(int aid) 
//	{
//		Alien a = new Alien();
//		a.setAid(101);
//		a.setAname("swe");
//		a.setTech("java");
//		return a;
//	}
//}

package com.servletjspmaven.dao;
import java.sql.*;


import com.servletjspmaven.model.Alien;

public class AlienDao {
	public Alien getAlien(int aid) 
	{
		Alien a = new Alien();
	
//		a.setAid(101);
//		a.setAname("swe");
//		a.setTech("java");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/demotable","root", "India#639232");
			Statement st = con.createStatement();
			ResultSet rs= st.executeQuery("select * from alien where aid=" + aid);
			System.out.println("DEBUG: Looking for aid = " + aid);
			if(rs.next())
			{
				a.setAid(rs.getInt("aid"));
				a.setAname(rs.getString("aname"));
				a.setTech(rs.getString("tech"));
			}	
		}catch(Exception e) {
			System.out.println(e);
		}
		return a;
	}
}
