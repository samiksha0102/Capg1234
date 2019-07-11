package com.lab;
import java.util.Scanner;
	import java.util.StringTokenizer;

	public class Lab81 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("enter number");
		String s=sc.nextLine();
		StringTokenizer st=new StringTokenizer(s, ",");
		int sum=0;
		while(st.hasMoreTokens())
		{int n = Integer.parseInt(st.nextToken());
		sum+=n;
		}
		System.out.println(sum);
		sc.close();
	}
	}

