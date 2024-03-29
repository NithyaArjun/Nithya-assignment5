package main.java.com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size=0;

	@Override
	public boolean add(T item) {
			if(size == items.length){
			int newSize = items.length*2;	
			items = Arrays.copyOf(items, newSize);
			}
			items[size] = item;
			size++;			
		return true;
	}

	@Override
	public int getSize() {
		
		return size;
	}

	@Override
	public T get(int index) {
		
		return (T) items[index];
	}
	
}
