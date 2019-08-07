package com.cg.frs.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.service.FlatRegistrationServiceImpl;
import com.cg.frs.service.IFlatRegistrationService;

public class Client {
	static IFlatRegistrationService service = new FlatRegistrationServiceImpl();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String ch;
			

			System.out.println("  1.Register Flat\n 2.Display Flat Registration Details\n  3.Exit\n ");
			ch = sc.next();

			FlatRegistrationDTO flat;
			switch (ch) {
			case "1":	System.out.println("Existing owner Ids are: \n ");
				ArrayList<Integer> l1 = service.getAllOwnerIds();
			System.out.println(l1);

				System.out.println("Please enter your ownerId from above list:");
				int ownerId = sc.nextInt();

				if (l1.contains(ownerId)) {

					System.out.println("Select flat type(1-1BHK, 2-2BHK) ");
					int p = sc.nextInt();
					String flatType = "";
					if (p == 1) {
						flatType = "1-BHK";
					} else if (p == 2) {
						flatType = "2-BHK";
					}
					System.out.println("Enter flat area in sq ft.:");
					long flatArea = sc.nextLong();
					System.out.println("Enter desired rent amount Rs.:");
					double rentAmount = sc.nextDouble();
					System.out.println("Enter desired deposit amount Rs.:");
					double depositAmount = sc.nextDouble();

					int registerId = (int) (Math.random() * 1000 + 1000);
					 flat = new FlatRegistrationDTO();
                     flat.setRegisterId(registerId);
					flat.setOwnerId(ownerId);
					flat.setFlatType(flatType);
					flat.setFlatArea(flatArea);
					flat.setRentAmount(rentAmount);
					flat.setDepositAmount(depositAmount);
					service.registerFlat(flat);
					System.out.println("Flat successfully registered .Registration id:" +registerId);
				} else {
					System.out.println("owner id not exists");
				}break;

				case "2":
				/*System.out.println("Enter the registration id");
				 registerId = sc.nextInt();
*/
				ArrayList<FlatRegistrationDTO> l2=service.getFlatDetails();
				if (l2.isEmpty()) {
					System.out.println("No records found!");
				}
				for (FlatRegistrationDTO detail : service.getFlatDetails()) {
					System.out.println(detail);
				}
/*
				if (flat != null) {
					System.out.println("Id :" + registerId);
					System.out.println("Flat Type :" + flat.getFlatType());
					System.out.println("Flat Area :" + flat.getFlatArea());
					System.out.println("Rent Amount :" + flat.getRentAmount());
					System.out.println("deposit Amount :" + flat.getDepositAmount());

					System.out.println("\n\n\n");

				}*/break;

			case "3":
				System.exit(0);
			default:
				System.out.println("Enter valid option");
			}

		}
	}
}
