package com.cg.frs.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.cg.frs.dto.FlatOwner;
import com.cg.frs.dto.FlatRegistrationDTO;





public class FlatRegistrationDAOImpl implements IFlatRegistrationDAO {
	static Map<Integer, FlatOwner> owners = new HashMap<>();
	static {

		owners.put(1, new FlatOwner(1, "vaishali", "67676"));
		owners.put(2, new FlatOwner(2, "megha", "675567"));

		owners.put(3, new FlatOwner(3, "manish", "676786"));

	}
	
	Map<Integer,FlatRegistrationDTO> flatDetails=new HashMap<>();
	
	public ArrayList<FlatRegistrationDTO> getFlatDetails(){

		ArrayList<FlatRegistrationDTO> details=new ArrayList<FlatRegistrationDTO>(flatDetails.values());
		return details;
		}

	@Override
	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat) {
		flatDetails.put(flat.getRegisterId(), flat);
		return flat;
	}

	@Override
	public ArrayList<Integer> getAllOwnerIds() {
		ArrayList<Integer> ownerList=new ArrayList<Integer>(owners.keySet());
		return ownerList;
	}

}
