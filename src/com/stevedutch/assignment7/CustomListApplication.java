package com.stevedutch.assignment7;

import com.coderscampus.arraylist.*;

/*TODO fix Add(int index, T item) 
  	* BUG 1: überrschreibt, schiebt aber nicht weiter
	* BUG 2: überschreibt, zieht gar einen index zurücK?
	* BUG 3: exception is thrown when last index is removed, 
		der zu entferende index wird mit dem rechts davon überschrieben
*/
public class CustomListApplication {

	public static void main(String[] args) {

		CustomList<String> myCustomList = new CustomArrayList<>();

		for (int j = 0; j < 10; j++) {
			String elem = "element " + String.valueOf(j);
			myCustomList.add(elem);
		}

//		myCustomList.add("element 10");
		
//		myCustomList.add(9, "added element no. 1");
//		myCustomList.add(7, "added element no. 2");
//		
		myCustomList.remove(8);
		
		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}
		

		
//		myCustomList.add("Add One");
//		for (int i = 0; i < myCustomList.getSize(); i++) {
//			System.out.println(myCustomList.get(i));
//		}
//		
//		myCustomList.add(19, "Add Another One");
//		for (int i = 0; i < myCustomList.getSize(); i++) {
//			System.out.println(myCustomList.get(i));
//		}

	}

}
