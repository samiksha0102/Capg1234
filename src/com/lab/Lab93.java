package com.lab;

import java.util.*;
import java.util.Map.Entry;

public class Lab93 {
	static HashMap getSquares(int a[]) {
		HashMap<Integer, Integer> t = new HashMap<Integer, Integer>();

		for (int i : a) {
			if (!t.containsKey(i)) {
				t.put(i, i * i);
			}
		}
		return t;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("enter elements");
		for (int i = 0; i < n; i++)

		{
			a[i] = sc.nextInt();
		}
		HashMap<Integer, Integer> t = getSquares(a);
		System.out.println(t);

	}
}
