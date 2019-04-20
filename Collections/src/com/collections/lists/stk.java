package com.collections.lists;

import java.util.Stack;

public class stk {
	public static void main(String args[]) {
		Stack stt = new Stack();
		stt.add(1);
		stt.add(2);
		stt.add(3);
		stt.pop();
		for(Object i: stt) {
			System.out.println(i);
		}
	}

}
