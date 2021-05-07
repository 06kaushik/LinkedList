package com.linkedList;


import java.util.LinkedList;

public class LinkedListUtil {
	
	public static  void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(20);
	        list.add(26);
		list.add(50);
		
		list.forEach(System.out::println);
		
	}
}