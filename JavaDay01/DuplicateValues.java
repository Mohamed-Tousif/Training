package com.sonata;

public class DuplicateValues {
	public static void main(String[] args) {    
		int array[] = {1, 2, 3, 4, 5, 6, 5, 1, 6};
		System.out.println("Duplicate elements in given array: ");    
        for(int i = 0; i < array.length; i++) {  
        for(int j = i + 1; j < array.length; j++) {  
        if(array[i] == array[j])  
        System.out.println(array[j]);  

}
}
}
}