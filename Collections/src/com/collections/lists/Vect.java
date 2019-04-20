package com.collections.lists;

import java.util.Vector;

public class Vect {
	
	static Vector<Integer> v = new Vector<Integer>();
	
	public static void main(String[] args) {
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		for(int i: v) {
			System.out.println(i);
		}
	}

}
