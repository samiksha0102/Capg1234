package com.cg.frs.service;

import java.util.ArrayList;

import com.cg.frs.dao.FlatRegistrationDAOImpl;
import com.cg.frs.dao.IFlatRegistrationDAO;
import com.cg.frs.dto.FlatRegistrationDTO;

public class FlatRegistrationServiceImpl implements IFlatRegistrationService {
	
IFlatRegistrationDAO dao=new FlatRegistrationDAOImpl();	

	@Override
	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat) {
		 flat=dao.registerFlat(flat);
		return flat;
	}

	@Override
	public ArrayList<Integer> getAllOwnerIds() {
		ArrayList<Integer> ownerId = dao.getAllOwnerIds();
		return ownerId;
	}

	
	public ArrayList<FlatRegistrationDTO> getFlatDetails() {
		ArrayList<FlatRegistrationDTO> details = dao.getFlatDetails();
		return details;
	}

}
