package main.java.com.coderscampus.arraylist;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		CustomList<String> myCustomList = new CustomArrayList<>();
		System.out.println("Enter the number of  elements to be added to the array");
		Scanner scan = new Scanner(System.in);
		int noOfElements = scan.nextInt();
		System.out.println("Enter the elements to the array");
		for(int i=0; i<=noOfElements; i++) {
			String elements =scan.nextLine();
			myCustomList.add(elements);
		}
		System.out.println("The elements in the array are");
		System.out.println("---------------------");
		for(int i=0; i<=myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}
		scan.close();
	}

}
