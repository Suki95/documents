package com.cg.mps.dao;

import java.util.ArrayList;
import com.cg.mps.dto.Mobile;
import com.cg.mps.exception.MobileException;

public interface MobileDao 
{
	public ArrayList<Mobile> getAllMob() throws MobileException;
	public int deleteMob(int mobId) throws MobileException;
	public ArrayList<Mobile> searchMob(int minRange) throws MobileException;
	public int addMob(Mobile mob) throws MobileException;
}
