package com.stevedutch.assignment7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.coderscampus.arraylist.CustomList;

class CustomArrayListTest {
	//TODO check Generic statt String
	
	
	@Test
	void should_return_T() {
		CustomList <String> sut = new CustomArrayList<>(); 
		
		sut.add("a first test");
		sut.add("2nd String");
		sut.add("third");
		String exspectedResult = sut.remove(1);
		
		assertEquals("2nd String", exspectedResult);
		
	}
	
	@Test
	void should_remove_item_and_shuffle_leftsided_items_leftwards() {
		CustomList <String> sut = new CustomArrayList<>(); 
		
		sut.add("a first test");
		sut.add("2nd String");
		sut.add("third");

		sut.remove(1);
		
		String exspectedtResult = sut.get(1);
		
		assertEquals("third", exspectedtResult);
		
	}
	@Test
	void should_throw_IndexOutOfBoundsException() {
		
		assertThrows(IndexOutOfBoundsException.class, new Executable() {
			
			@Override
			public void execute() throws Throwable {
				CustomList <String> sut = new CustomArrayList<>(); 
				sut.add("a first test");
				sut.add("2nd String");
				sut.add("third");
				
				sut.remove(26);
			}
		});
	}
	
	

}
