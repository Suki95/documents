package com.cg.mps.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import com.cg.mps.dto.Mobile;
import com.cg.mps.exception.CustomerException;
import com.cg.mps.exception.MobileException;
import com.cg.mps.util.DBUTIL;

public class MobileDaoImp implements MobileDao
{
	Logger daoLogger=null;
	Connection con=null;
	Statement st=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	
	@Override
	public ArrayList<Mobile> getAllMob() throws MobileException 
	{
		ArrayList<Mobile> mobList=null;
		try 
		{
			mobList=new ArrayList<Mobile>();
			con=DBUTIL.getConn();
			String selectqry="SELECT * FROM mobiles";
			st=con.createStatement();
			rs=st.executeQuery(selectqry);
			while(rs.next())
			{
				mobList.add(new Mobile(rs.getInt("mobileid"),rs.getString("name"),rs.getInt("price"),rs.getString("quantity")));
			}
		} 
		catch (Exception e) 
		{
			throw new MobileException(e.getMessage());
		}
		return mobList;
	}

	@Override
	public int deleteMob(int mobId) throws MobileException 
	{
		try 
		{
			con=DBUTIL.getConn();
			String deleteqry="DELETE FROM mobiles WHERE mobileid=?"+mobId;
//			String qry="SELECT * FROM mobiles WHERE mobileid=?"+mobId;
//			st=con.createStatement();
//			rs=st.executeQuery(qry);
//			rs.next();
//			System.out.println("Deleted details of mobile are: ");
//			System.out.println("Mobile Id : "+rs.getInt("mobileid")+", Mobile Name : "+rs.getString("name")+", Mobile Price : "+rs.getInt("price")+", Mobile Quantity : "+rs.getString("quantity"));
//			rs.close();
			pst=con.prepareStatement(deleteqry);
			pst.setInt(1, mobId);
			rs=pst.executeQuery();
			rs.close();
		} 
		catch (Exception e) 
		{
			throw new MobileException(e.getMessage());
		}
		return 0;
	}

	@Override
	public ArrayList<Mobile> searchMob(int minRange) throws MobileException 
	{
		ArrayList<Mobile> mobList=null;
		try 
		{
			mobList=new ArrayList<Mobile>();
			con=DBUTIL.getConn();
			String selectqry="SELECT * FROM mobiles WHERE "
					+ "price>=?";
			pst=con.prepareStatement(selectqry);
			pst.setInt(1, minRange);
			rs=pst.executeQuery();
			while(rs.next())
			{
				mobList.add(new Mobile(rs.getInt("MOBILEID"),rs.getString("NAME"),rs.getInt("PRICE"),rs.getString("QUANTITY")));
			}
		} 
		catch (Exception e) 
		{
			throw new MobileException(e.getMessage());
		}
		return mobList;
	}

	@Override
	public int addMob(Mobile mob) throws MobileException
	{
		int data;
		try
		{
			con=DBUTIL.getConn();
			String insertQuery="INSERT INTO mobiles VALUES(?,?,?,?)";
			pst=con.prepareStatement(insertQuery);
			pst.setInt(1, mob.getMobId());
			pst.setString(2, mob.getMobName());
			pst.setInt(3, mob.getPrice());
			pst.setString(4, mob.getQuantity());
			data=pst.executeUpdate();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			throw new MobileException(e.getMessage());
		}
		
		return data;
	}
}
