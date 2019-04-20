package com.collections.sets;

import java.util.HashSet;

public class hshset {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(19);
		for(int i: hs) {
			System.out.println(i);
		}
	}

}
