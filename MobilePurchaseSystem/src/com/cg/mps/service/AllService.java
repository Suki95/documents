package com.cg.mps.service;

import java.util.ArrayList;
import com.cg.mps.dto.Customer;
import com.cg.mps.dto.Mobile;
import com.cg.mps.exception.CustomerException;
import com.cg.mps.exception.MobileException;

public interface AllService 
{
	public ArrayList<Customer> getAllCust() throws CustomerException;
	public int addCust(Customer ee) throws CustomerException;
	public boolean validateCustName(String custName) throws CustomerException;
	public boolean validateMailId(String mailID) throws CustomerException;
	public boolean validateMobileId(int mobileId) throws MobileException;
	public boolean validatePhoneNo(String phoneNumber) throws CustomerException;public ArrayList<Mobile> getAllMob() throws MobileException;
	public int deleteMob(int mobId) throws MobileException;
	public ArrayList<Mobile> searchMob(int minRange) throws MobileException;
	public int updateMob(Customer c) throws CustomerException;
	public int addMob(Mobile mob) throws MobileException;
}
