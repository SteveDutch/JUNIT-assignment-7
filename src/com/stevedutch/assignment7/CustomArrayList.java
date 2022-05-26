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
	public boolean add(int index, T item) throws IndexOutOfBoundsException  {
		if (index > items.length) {
			throw new IndexOutOfBoundsException("Ooops... here's the Index out Of Bounds :O ");
		}
		if (place == items.length) {
			size = size * 2;
			items = Arrays.copyOf(items, size);
		}
		for (int i = index; i < items.length - 1; i++) {
			items[i] = items[i + 1];
		}
		items[index] = item;
		return true;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public T get(int index)  throws IndexOutOfBoundsException {
		if (index > items.length) {
			throw new IndexOutOfBoundsException("Ooops... Index out Of Bounds or so ;)---");
		}
		
		return (T) items[index];
	}

	public T remove(int index) throws IndexOutOfBoundsException {
		if (index > items.length) {
			throw new IndexOutOfBoundsException("Ooops...your removal lead into Index out Of Bounds or so ;)---");
		}
		T removed = (T) items[index];
		items[index] = items[index + 1];
		for (int i = index; i < items.length - 1; i++) {

			items[i] = items[i + 1];

		}
		return removed;
	};

}
