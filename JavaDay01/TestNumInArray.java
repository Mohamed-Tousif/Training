package com.sonata;
public class TestNumInArray {
	public static void main(String[] args) {    
		int array[] = {1, 2, 3, 4, 5, 6};
		int num = 5;
		boolean Found = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				Found = true;
				break;
			}

		}

		if (Found) {
			System.out.println("Number " + num + " is found in the  array");
		} else {
			System.out.println("Number " + num + " is not found in the  array");
}
}
}
