package com.cg.ems.util;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUTIL 
{
	static String driver=null;
	static String url=null;
	static String unm=null;
	static String pwd=null;
	public static Connection getConn() throws IOException, SQLException
	{
		Properties myProps=loadDBInfo();
		driver=myProps.getProperty("dbDriver");
		url=myProps.getProperty("dbUrl");
		unm=myProps.getProperty("dbUser");
		pwd=myProps.getProperty("dbPassword");
		Connection con=null;
		if(con==null)
		{
			con=DriverManager.getConnection(url,unm,pwd);
			System.out.println("In DB Util Con is : "+con);
			return con;
		}
		else
		{
			System.out.println("In DB Util Con is: "+con);
			return con;
		}
	}
	public static Properties loadDBInfo() throws IOException
	{
			FileReader fr=new FileReader("dbInfo.properties");
			Properties dbProps = new Properties();
			dbProps.load(fr);
			return dbProps;
    }
}
