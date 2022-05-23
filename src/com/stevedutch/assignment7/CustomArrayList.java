package com.stevedutch.assignment7;

import com.coderscampus.arraylist.CustomList;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	
	Object[] items = new Object[10];

	private int place;
	private int size = items.length;

	@Override
	public boolean add(T item) {
		if (place == items.length) {
			size = size * 2;
			items = Arrays.copyOf(items, size);
		}
		items[place] = item;
		place++;
		return true;
	}

	@Override
	public int getSize() {
		return place;
	}

	@Override
	public T get(int index) {
		T output = (T) items[index];
		return output;
	}
	
	public T remove(int index) throws IndexOutOfBoundsException {
		T removed = (T) items[index];
		items[index] = items[index+1];
		for (int i = index; i < items.length-1; i++) {

			items[i] = items[i+1];
			
		}
		return removed ;
	};

}
