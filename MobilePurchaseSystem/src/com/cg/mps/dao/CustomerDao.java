package com.cg.mps.dao;

import java.util.ArrayList;
import com.cg.mps.dto.Customer;
import com.cg.mps.dto.Mobile;
import com.cg.mps.exception.CustomerException;
import com.cg.mps.exception.MobileException;

public interface CustomerDao 
{
	public ArrayList<Customer> getAllCust() throws CustomerException;
	public int addCust(Customer ee) throws CustomerException;
	public int updateMob(Customer c) throws CustomerException;
}
