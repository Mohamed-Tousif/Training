package com.sonata;

public class LargeNum2 {
	public static void main( String[] args ){
	int arr[] = {1,2,3,4,5,6};
	
	int max1 = 0;
	
	int max2 = 0;
	for(int i = 1;i<arr.length;i++) {
		int countnum = arr[i];
		if(countnum>max1 ) {
			max2 = max1;
			max1 = countnum;
		}
		else if( max2<countnum ) {
			max2 = countnum;
		}
		
	}
	System.out.println(max1);
	System.out.println(max2);
}
}
