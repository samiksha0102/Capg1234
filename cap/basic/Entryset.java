package com.cap.basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Entryset {
		static HashMap getSquares(int a[]) {
				HashMap<Integer,Integer> t=new HashMap<Integer,Integer>();
						
						for (int i:a)
						{t.put(i, i*i);
						}
								return t;
						}
						
				public static void main(String[] args) {
					Scanner sc=new Scanner(System.in);
					System.out.println("enter size");
					int n=sc.nextInt();
					int[] a=new int[n];
					System.out.println("enter elements");
					for(int i=0;i<n;i++)
						
					{a[i]=sc.nextInt();
			        	}
					HashMap<Integer,Integer> t=getSquares( a);
					t.keySet();
					Set s=t.entrySet();
					//Iterator<Integer> it=t.keySet().iterator();
					Iterator it1=s.iterator();
					while(it1.hasNext())
					{Entry e=(Entry) it1.next();
						//Integer key=it.next();
					
					//System.out.println(key+" = "+t.get(key));
					System.out.println(e.getKey()+" = "+e.getValue());
					}
				}
			}


