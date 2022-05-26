package com.stevedutch.assignment7;

import com.coderscampus.arraylist.*;

public class CustomListApplication {

	public static void main(String[] args) {

		CustomList<String> myCustomList = new CustomArrayList<>();

		for (int j = 1; j <= 10; j++) {
			String elem = "element " + String.valueOf(j);
			myCustomList.add(elem);
		}

		myCustomList.add("element 11");

		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}
		
		myCustomList.add("Add One");
		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}
		
		myCustomList.add(22, "Add One");
		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}

	}

}
