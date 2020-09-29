package com.example;

import java.util.Scanner;

public class MissingNumber {
	
	public int findMissingNumber(int arr[], int size) {
		
		int total=0;			
		total = (size+1)*(size+2)/2;

		for(int i=0; i<size; i++) {
			total -= arr[i];
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		
		MissingNumber mn = new MissingNumber();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		
		System.out.println("Enter elements: ");
		
		int arr[] = new int[10];

		try {
			if(size > 10 ) {
				throw new Exception("Invalid array size ");
			}

			for(int i=0; i<size; i++) {
				arr[i] = sc.nextInt();
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
			
		int result = mn.findMissingNumber(arr, size);
		
		System.out.println("Missing Number : "+result);
		
	}

}
