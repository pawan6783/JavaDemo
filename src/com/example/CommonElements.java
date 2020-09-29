package com.example;

import java.util.Scanner;
import java.util.Vector;

public class CommonElements {
	
	public Vector<Integer> findCommon(int arr1[], int arr2[], int arr3[]) {
		
		int i = 0;
		int j = 0;
		int k = 0;
		int l = 0;
		Vector<Integer> result = new Vector<Integer>();
		
		while((i < arr1.length) && (j < arr2.length) && (k < arr3.length)) {
			
			if( arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				
				result.add(arr1[i]);
				i++;
				j++;
				k++;
				l++;
			}
			else if(arr1[i] < arr2[j]){
				i++;
			}
			else if(arr2[j] < arr3[k]) {
				j++;
			}
			else {
				k++;
			}
		}
		return result;
	}
	
	public int[] input() {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
						
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		
		System.out.println("Enter elements: ");

		try {
			if(size > 10 ) {
				throw new Exception("Array size should be less than 11");
			}

			for(int i=0; i<size; i++) {
				arr[i] = sc.nextInt();
			}
		}
		catch (Exception e) {
				// TODO: handle exception
			System.out.println(e);
		}
		
		return arr;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonElements ce = new CommonElements();
		
		int arr1[] = ce.input();
		int arr2[] = ce.input();
		int arr3[] = ce.input();
							
		Vector<Integer> result = ce.findCommon(arr1, arr2, arr3);
		
		System.out.println("Common numbers are :");
		for(int x: result) {
			System.out.println(x);
		}
	}
}
