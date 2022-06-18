package com.stevedutch.assignment7;

import com.coderscampus.arraylist.*;

public class CustomListApplication {

	public static void main(String[] args) {

		CustomList<String> myCustomList = new CustomArrayList<>();

		for (int j = 0; j < 10; j++) {
			String elem = "element " + String.valueOf(j);
			myCustomList.add(elem);
		}
		
		myCustomList.remove(9);
		myCustomList.add(9, "added element no. 1");
		myCustomList.add(7, "added element no. 2");
		myCustomList.add(7, "added element no. 3");

		myCustomList.remove(5);
		myCustomList.remove(18);
		System.out.println("size = " + String.valueOf(myCustomList.getSize()));

		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}

	}

}
