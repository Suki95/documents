package com.cg.mps.ui;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import com.cg.mps.dto.Customer;
import com.cg.mps.dto.Mobile;
import com.cg.mps.exception.CustomerException;
import com.cg.mps.exception.MobileException;
import com.cg.mps.service.AllService;
import com.cg.mps.service.AllServiceImp;

public class TestCustMPSClient 
{
	static AllService allService=null;
	private static Scanner sc;
	static int purID=1501;
	public static void main(String[] args) throws MobileException
	{
		sc = new Scanner(System.in);
		allService=new AllServiceImp();
		System.out.println("******* Welcome to EMS *******");
		int choice=0;
		while(true)
		{
			System.out.println("What do you want to do?");
			System.out.println("\t 1 : Add Customer Details"
					+ "\t 2 : Show All Customer"
					+ "\t 3 : Show All Mobile "
					+ "\t 4 : Delete mob details \t\n"
					+ "\t 5 : Search mobile above a price range"
					+ "\t 6 : Add mobiles "
					+ "\t 7 : Exit");
			System.out.println("Enter your Choice : ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:insertCust();break;
			case 2:dispAllCust();break;
			case 3:displayAllMob();break;
			case 4:deleteMob();break;
			case 5:searchMob();break;
			case 6:insertMob();break;
			default:System.exit(1);
			}
		}
	}
	private static void searchMob() 
	{
		ArrayList<Mobile> mobList;
		try
		{
			System.out.println("Enter the minimun price range: ");
			int minRange=sc.nextInt();
			mobList=allService.searchMob(minRange);
			System.out.println("\tMOBILE ID\tNAME\tPRICE\tQUANTITY");
			for(Mobile ee:mobList)
			{
				System.out.println("\t"+ee.getMobId()+"\t"+ee.getMobName()+"\t"+ee.getPrice()+"\t"+ee.getQuantity());
			}
		}
		catch (MobileException e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteMob() throws MobileException 
	{
		System.out.println("Enter mobile Id no to be deleted");
		int mobId=sc.nextInt();
		allService.deleteMob(mobId);
	}
	private static void displayAllMob() 
	{
		ArrayList<Mobile> mobList;
		try 
		{
			mobList=allService.getAllMob();
			System.out.println("\tMOBILE ID\tNAME\tPRICE\tQUANTITY");
			for(Mobile ee:mobList)
			{
				System.out.println("\t"+ee.getMobId()+"\t"+ee.getMobName()+"\t"+ee.getPrice()+"\t"+ee.getQuantity());
			}
		} 
		catch (MobileException e)
		{
			e.printStackTrace();
		}
	}
	private static void dispAllCust() 
	{
		ArrayList<Customer> custList;
		try 
		{
			custList=allService.getAllCust();
			System.out.println("\tPURCHASE ID\tNAME\tMAIL ID\tPHONE NO\tPURCHASE DATE\tMOBILE ID");
			for(Customer ee:custList)
			{
				System.out.println("\t"+ee.getPurchaseId()+"\t"+ee.getCustName()+"\t"+ee.getCustMailId()+"\t"+ee.getPhoneNum()+"\t"+ee.getPurchaseDate()+"\t"+ee.getMobId());
			}
		} 
		catch (CustomerException e)
		{
			e.printStackTrace();
		}
	}
	private static void insertCust() 
	{
		try
		{
			System.out.println("Enter Mobile Id of the mobile you wanna buy: ");
			int mobileId=sc.nextInt();
			if(allService.validateMobileId(mobileId))
			{
				System.out.println("Enter your name: ");
				String custName=sc.next();
				if(allService.validateCustName(custName))
				{
					System.out.println("Enter Customer Mail Id: ");
					String custMailId=sc.next();
					if(allService.validateMailId(custMailId))
					{
						System.out.println("Enter Customer Phone No.: ");
						String custPhoneNo=sc.next();
						if(allService.validatePhoneNo(custPhoneNo))
						{
							Date custDate=Date.valueOf(LocalDate.now());

							Customer c=new Customer(purID,custName,custMailId,custPhoneNo,custDate,mobileId);
							purID=purID+1;
							int dataInserted=allService.addCust(c);
							if(dataInserted==1)
							{
								allService.updateMob(c);
							}
						}
					}
				}
			}
		}
		catch(CustomerException | MobileException e )
		{
			e.printStackTrace();
		}
	}
	public static void insertMob()
	{
		try 
		{
			System.out.println("Enter Mobile Id of the mobile to be inserted: ");
			int mobileId=sc.nextInt();
			System.out.println("Enter mobile name: ");
			String mobName=sc.next();
			System.out.println("Enter mobile price: ");
			int mobPrice=sc.nextInt();
			System.out.println("Enter mobile quantity: ");
			String mobQuantity=sc.next();
			Mobile mob=new Mobile(mobileId,mobName,mobPrice,mobQuantity);
			int mobInserted=allService.addMob(mob);
			if(mobInserted==1)
			{
				allService.getAllMob();
			}
		} 
		catch (MobileException e) 
		{
			e.printStackTrace();
		}
	}

}
