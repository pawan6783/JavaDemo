package com.example;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		
		int size = sc.nextInt();
		
		try {
			if(size > 10 ) {
				throw new Exception("Array size exceed");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		

		
		int arr[] = new int[10];
		
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		MissingNumber mn = new MissingNumber();
		int result = mn.findMissingNumber(arr, size);
		
		System.out.println(result);
	}

}
