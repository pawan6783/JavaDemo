package com.example;

public class MissingNumber {
	
	public int findMissingNumber(int arr[], int size) {
		
		int total=0;			
		
		total = (size+1)*(size+2)/2;

		for(int i=0; i<size; i++) {
			total -= arr[i];
		}
		return total;
	}
}
