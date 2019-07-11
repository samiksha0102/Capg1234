package com.Exceptions;

class ThrowsEx1 {
	public void div(String b, String c) throws Exception {

		int a = Integer.parseInt(b) / Integer.parseInt(c);
		System.out.println(a);

	}
}

public class CalService {
	public static  void main(String[] args) {
		ThrowsEx1 o = new ThrowsEx1();

		try {
			o.div("20", "0");

		} catch (Exception be) {
			System.out.println("error");
			be.printStackTrace();
		}
	}

}
