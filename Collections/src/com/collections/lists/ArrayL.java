package com.collections.lists;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayL { 
	static ArrayList<Integer> a = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		a.add(1);
		a.add(2);
		a.add(3);
		
		for(int i: a) {
			System.out.println(i);
			
		}
		
	}

}
