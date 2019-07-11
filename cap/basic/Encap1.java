package com.cap.basic;

public class Encap1 {

public static void main(String[] args) {
	Encap e=new Encap();
	System.out.println(e.getEmpId());
	System.out.println(e.geteSal());
	System.out.println(e.geteName());
System.out.println(e.geteAtmpin());

e.setEmpId(456);

e.seteSal(56778);
e.seteName("samy");
e.seteAtmpin(4567);

System.out.println(e.getEmpId());
System.out.println(e.geteAtmpin()); 
System.out.println(e.geteName());
System.out.println(e.geteSal());	
}

}