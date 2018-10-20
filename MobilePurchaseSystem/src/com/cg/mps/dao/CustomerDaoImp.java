package com.cg.mps.dao;

import java.sql.*;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.cg.mps.dto.Customer;
import com.cg.mps.exception.CustomerException;
import com.cg.mps.util.DBUTIL;
import com.cg.mps.dao.CustomerDaoImp;

public class CustomerDaoImp implements CustomerDao
{
	Logger daoLogger=null;
	Connection con=null;
	Statement st=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	static int quant;

	public CustomerDaoImp()
	{
		daoLogger=Logger.getLogger(CustomerDaoImp.class);
		PropertyConfigurator.configure("log4j.properties");
		daoLogger.debug("This is a debug message.");
		daoLogger.warn("This is a warn message.");
		daoLogger.fatal("This is a fatal message.");
	}
	
	@Override
	public ArrayList<Customer> getAllCust() throws CustomerException 
	{
		ArrayList<Customer> custList=null;
		try 
		{
			custList=new ArrayList<Customer>();
			con=DBUTIL.getConn();
			String selectqry="SELECT * FROM purchasedetails";
			st=con.createStatement();
			rs=st.executeQuery(selectqry);
			while(rs.next())
			{
				custList.add(new Customer(rs.getInt("purchaseid"),rs.getString("cname"),rs.getString("mailid"),rs.getString("phoneno"), rs.getDate("purchasedate"),rs.getInt("mobileid")));
			}
		} 
		catch (Exception e) 
		{
			throw new CustomerException(e.getMessage());
		}
		finally
		{
			try
			{
				st.close();
				rs.close();
				con.close();
			}
			catch (SQLException e)
			{
				daoLogger.error(e.getMessage());
				throw new CustomerException(e.getMessage());
			}
		}
		daoLogger.info("All data retrieved:"+custList);
		return custList;
	}

	@Override
	public int addCust(Customer ee) throws CustomerException 
	{
		int data;
		try
		{
			con=DBUTIL.getConn();
			String insertQuery="INSERT INTO purchasedetails VALUES(?,?,?,?,?,?)";
			pst=con.prepareStatement(insertQuery);
			pst.setInt(1, ee.getPurchaseId());
			pst.setString(2, ee.getCustName());
			pst.setString(3, ee.getCustMailId());
			pst.setString(4, ee.getPhoneNum());
			pst.setDate(5,ee.getPurchaseDate());
			pst.setInt(6,ee.getMobId());
			data=pst.executeUpdate();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			throw new CustomerException(e.getMessage());
		}
		
		return data;
	}

	@Override
	public int updateMob(Customer c) throws CustomerException 
	{
		int data;
		try
		{
			con=DBUTIL.getConn();
			String searchQuery="SELECT * FROM mobiles WHERE mobileid=?";
			pst=con.prepareStatement(searchQuery);
			pst.setInt(1, c.getMobId());
			rs=pst.executeQuery();
			while(rs.next())
			{
				quant = Integer.parseInt(rs.getString("quantity"));
				
			}
			quant=quant-1;
			pst.close();
			String quant1=Integer.toString(quant);
			String updateQuery="UPDATE mobiles SET quantity=? WHERE mobileid=?";
			pst=con.prepareStatement(updateQuery);
			pst.setString(1, quant1);
			pst.setInt(2, c.getMobId());
			data=pst.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new CustomerException(e.getMessage());
		}
		return 0;
	}
}
