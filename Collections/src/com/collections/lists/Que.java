package com.collections.lists;

import java.util.Queue;

public class Que {
	public static void main(String args[]) {
		java.util.Queue<String> q = new java.util.LinkedList<String>();
		q.offer("SS");
		q.offer("mdmd");
		q.offer("lk");
		q.remove();
		for(String i: q) {
			System.out.println(i);
		}
	}

}
