package com.practice;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(87);
		list.add(56);
		list.add(45);
		list.add(32);
		list.add(110);
		list.add(99);

		System.out.println(list);
		Collections.reverse(list);
		Collections.sort(list);
		System.out.println(list);

	}
}
