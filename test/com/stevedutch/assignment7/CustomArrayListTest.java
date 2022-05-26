package com.stevedutch.assignment7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.jupiter.api.Test;

import com.coderscampus.arraylist.CustomList;

class CustomArrayListTest {
//	private static final Object exspectedlResult = null;
	//TODO check Generic statt String
	
	@Test
	void testAdd() {
		CustomList<String> sut = new CustomArrayList<>();
		sut.add("a first test");
		
		boolean exspectedResult = sut.add("2nd String");
	
		assertEquals("2nd String", sut.get(1));
		assertEquals(true, exspectedResult);
	}
	
	@Test
	void testAddTwoArguments() {
		CustomList<String> sut = new CustomArrayList<>();
		sut.add("a first test");
		sut.add("2nd String");
		sut.add("third");
			
		boolean exspectedBoolResult = sut.add(2, "new three");
		String exspectedtResult = sut.get(2);
		
		assertEquals("new three", exspectedtResult);
		assertEquals(true, exspectedBoolResult);
	}
	
	@Test
	void should_throw_exception_twoArgumentAdd() {
			CustomList<String> sut = new CustomArrayList<>();
			IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () -> {
	            sut.add(99, "an index to make the function throw");
	        });
			
			   assertEquals("Ooops... here's the Index out Of Bounds :O ", exception.getMessage());
	}

	@Test
	void testGetSize() {
		CustomList<String> sut = new CustomArrayList<>();
		sut.add("a first test");
		sut.add("2nd String");
		
		int exspectedResult = sut.getSize();
		
		assertEquals(10, exspectedResult);
	}
	
	@Test
	void testGet() {
		CustomList<String> sut = new CustomArrayList<>();
		sut.add("a first test");
		sut.add("2nd String");
		sut.add("third");

		String exspectedtResult = sut.get(0);
		assertEquals("a first test", exspectedtResult);
	
		IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            sut.get(99);
        });
		   assertEquals("Ooops... Index out Of Bounds or so ;)---", exception.getMessage());
	}
	
	// Testing:  T remove(int index) throws IndexOutOfBoundsException
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
		sut.add("four");

		sut.remove(1);
		
		String exspectedtResult = sut.get(1);
		String exspectedtResultTwo = sut.get(2);
		
		
		assertEquals("third", exspectedtResult);
		assertEquals("four", exspectedtResultTwo);
		
	}
	@Test
	void should_throw_IndexOutOfBoundsException() {
		CustomList<String> sut = new CustomArrayList<>();
		IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            sut.remove(99);
        });
		   assertEquals("Ooops...your removal lead into Index out Of Bounds or so ;)---", exception.getMessage());
	}

}
