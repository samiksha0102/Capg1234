package com.cg.frs.dao;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.cg.frs.dto.FlatOwner;
import com.cg.frs.dto.FlatRegistrationDTO;



class JunitTest {
		private static Map<Integer,FlatRegistrationDTO> flatdetails=new HashMap<Integer,FlatRegistrationDTO >();
		FlatOwner f=new FlatOwner(1,"name","bla");
		
		
		FlatRegistrationDTO flat=new FlatRegistrationDTO(1,1000, "1",25,3000,4000);
		
		@Test
		public FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat)  {
			
			flatdetails.put(flat.getRegisterId(),flat);
			int s=flat.getRegisterId();
			
			int expected=1000;
			
			Assertions.assertEquals(expected, s);
			return flat;
		}

	}


