package com.cg.mps.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import com.cg.mps.dao.CustomerDao;
import com.cg.mps.dao.CustomerDaoImp;
import com.cg.mps.dao.MobileDao;
import com.cg.mps.dao.MobileDaoImp;
import com.cg.mps.dto.Customer;
import com.cg.mps.dto.Mobile;
import com.cg.mps.exception.CustomerException;
import com.cg.mps.exception.MobileException;
import com.cg.mps.util.DBUTIL;

public class AllServiceImp implements AllService
{
	CustomerDao custDao=null;
	MobileDao mobDao=null;
	public AllServiceImp()
	{
		custDao=new CustomerDaoImp();
		mobDao=new MobileDaoImp();
	}

	@Override
	public ArrayList<Customer> getAllCust() throws CustomerException 
	{
		return custDao.getAllCust();
	}

	@Override
	public int addCust(Customer ee) throws CustomerException 
	{
		return custDao.addCust(ee);
	}

	@Override
	public boolean validateCustName(String custName) throws CustomerException 
	{
		String namePattern="[A-Z][a-z]{1,20}";
		if(Pattern.matches(namePattern, custName))
		{
			return true;
		}
		else
		{
			throw new CustomerException
			("Invalid Customer Name. Should start with capital"
					+ " Only 20 Characters allowed");
		}
	}
	@Override
	public boolean validateMailId(String mailID) throws CustomerException
	{
		String mailIDPattern="^[a-zA-Z0-9_+&*-]+(?:\\."+
				             "[a-zA-Z0-9_+&*-]+)*@"+
				             "(?:[a-zA-Z0-9-]+\\.)+[a-z"+
				             "A-Z]{2,7}$";
		if(Pattern.matches(mailIDPattern, mailID))
		{
			return true;
		}
		else
		{
			throw new CustomerException("Invalid Customer Mail Id. Please enter a valid mail Id. ");
		}
	}
	@Override
	public boolean validateMobileId(int mobileID) throws  MobileException 
	{
		String mobileIDPattern="[0-9]{4}";
		String mId=Integer.toString(mobileID);
		if(Pattern.matches(mobileIDPattern, mId))
		{
		try 
		{
			Connection con;
			con = DBUTIL.getConn();
			String selectqry="SELECT * FROM mobiles WHERE mobileid=?"+mobileID;
		    PreparedStatement pst = con.prepareStatement(selectqry);
		    pst.setInt(1, mobileID);
			ResultSet rs = pst.executeQuery();
			return true;
				
		}
		catch (IOException | SQLException e) 
		{
			e.printStackTrace();
			throw new MobileException("There is no mobile with this MObileID");
		}
		}
		else
		{
			return false;
		}
   }
	@Override
	public boolean validatePhoneNo(String phoneNumber) throws CustomerException 
	{
		String phoneNumPattern="\\d{10}";
		 if(Pattern.matches(phoneNumPattern, phoneNumber))
		{
			return true;
		}
		else
		{
			throw new CustomerException
			("Invalid Customer Mobile Number. Please enter a valid mobile number. Only digits allowed ");
		}
	}
	@Override
	public ArrayList<Mobile> getAllMob() throws MobileException
	{
		return mobDao.getAllMob();
	}
    
	@Override
	public int deleteMob(int mobId) throws MobileException 
	{
		return mobDao.deleteMob(mobId);
	}

	@Override
	public ArrayList<Mobile> searchMob(int minRange) throws MobileException 
	{
		return mobDao.searchMob(minRange);
	}

	@Override
	public int updateMob(Customer c) throws CustomerException
	{
		return custDao.updateMob(c);		
	}

	@Override
	public int addMob(Mobile mob) throws MobileException 
	{
		return mobDao.addMob(mob);
	}
	
}
