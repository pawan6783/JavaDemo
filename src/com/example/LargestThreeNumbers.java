package com.example;

import java.util.Scanner;

public class LargestThreeNumbers {
	
	public void sort(int arr[],int size) {
		
		for(int i=0; i<size-1; i++) {
			for(int j=0; j<size-i-1; j++) {
				
				if(arr[j] >arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public int[] findLargestThreeNumbers(int arr[],int size){
		
		sort(arr,size);
		
		int result[] = {arr[size-1], arr[size-2], arr[size-3]};
		
		return result;
	}
	
	public static void main(String[] args) {
		
		LargestThreeNumbers ltn = new LargestThreeNumbers();
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
			
		int resultOfLargestNumber[];
		resultOfLargestNumber = ltn.findLargestThreeNumbers(arr, size);
		
		System.out.println("Largest three numbers are :");
		for(int x: resultOfLargestNumber) {
			System.out.println(x);
		}
	}
}
