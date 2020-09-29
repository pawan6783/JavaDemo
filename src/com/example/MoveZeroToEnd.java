package com.example;

import java.util.Scanner;

public class MoveZeroToEnd {
	
	public int[] moveZero(int arr[]) {
		
		int result[] = new int[arr.length];
		int  addLast = arr.length-1;
		int addFront = 0;
		int i = 0;	
		
		while(addFront <= addLast) {
			if(arr[i] == 0) {
				result[addLast] = arr[i];
				addLast--;
			}
			else {
				result[addFront] = arr[i];
				addFront++;
			}
			i++;
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of array: ");
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		System.out.println("Enter elements: ");
		
		int arr[] = new int[size];

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
		
		MoveZeroToEnd mz = new MoveZeroToEnd();
		int []result = mz.moveZero(arr);
		
		for(int each : result) {
			System.out.println(each);
		}
	}

}
