package com.stevedutch.assignment7;

import com.coderscampus.arraylist.CustomList;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {

	Object[] items = new Object[10];

	private int size = 0;
	
	
	@Override
	public boolean add(T item) {
		if (size == items.length) {
			items = Arrays.copyOf(items, items.length * 2);
		}
		items[size] = item;
		size++;
		return true;
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		T buffer = null;
		if (index > items.length) {
			throw new IndexOutOfBoundsException(
					"Ooops... here's the Index out Of Bounds because your index is too big for the array ");
		}
		if (size == items.length) {
			items = Arrays.copyOf(items, items.length * 2);
		}
		for (int i = index; i < items.length - 1; i++) {
			buffer = (T) items[i];
			items[i] = item;
			item = buffer;

		}
		size++;

		return true;
	}

	@Override
	public int getSize() {
		/*
		 * OutOfBoundsException when arrays.length = 10 int i = 0; while (items[i] !=
		 * null) { i++; } return i;
		 */
		
		 /*
		  * wrong solution, because it returns the array length instead of the the number
		 * of actual elements stored 
		 * return items.length;
		 */
		
		// should work now, 'cause i should have fixed size in add + remove
		return size;
	}

	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		if (index > items.length) {
			throw new IndexOutOfBoundsException(
					"Ooops... Index out Of Bounds because your index isn't part of the array ;)---");
		}

		return (T) items[index];
	}

	public T remove(int index) throws IndexOutOfBoundsException {
		if (index > items.length-1) {
			throw new IndexOutOfBoundsException("Ooops...your removal lead into Index out Of Bounds or so ;)---");
		}
		if (index >= size) {
			throw new IndexOutOfBoundsException("Ooops...your chosen index was out of bounds");
		}
		T removed = (T) items[index];
		if (index == items.length - 1) {
			items[index] = null;
			size--;
			return removed;
		}
		items[index] = items[index + 1];
		for (int i = index; i < items.length - 1; i++) {

			items[i] = items[i + 1];

		}
		// if array is full, the last element has to be set equal to null
		// doing it anyway is cheaper than testing if this is the case(?)
		items[items.length - 1] = null;
		size--;
		return removed;
	}

}
