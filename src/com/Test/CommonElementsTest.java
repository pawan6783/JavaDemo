package com.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Vector;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.CommonElements;

public class CommonElementsTest {
	
	CommonElements ce = null;
	
	@BeforeEach
	public void setUp() {
		ce = new CommonElements();
	}
	
	@Test
	public void findCommonTest1() {
		
		int arr1[] = new int[] {1, 5, 10, 20, 40, 80};
		int arr2[] = new int[] {6, 7, 20, 80, 100};
		int arr3[] = new int[] {3, 4, 15, 20, 30, 70, 80, 120};
		Vector<Integer> result = new Vector<Integer>();
		result.add(20);
		result.add(80);
		
		
		assertEquals(result, ce.findCommon(arr1,arr2,arr3));
	}
	
	public void findCommonTest2() {
		
		int arr1[] = new int[] {1, 2, 0, 6, 10, 100};
		int arr2[] = new int[] {7, 20, 80, 100};
		int arr3[] = new int[] {4, 15,30, 70, 80, 120};
		Vector<Integer> result = new Vector<Integer>();
		result.add(0);
		
		
		assertEquals(result, ce.findCommon(arr1,arr2,arr3));
	}

	public void findCommonTest3() {
	
		int arr1[] = new int[] {1, 5, 10, 20, 40, 0, 80};
		int arr2[] = new int[] {6, 7, 20, 0, 80, 100};
		int arr3[] = new int[] {3, 4, 15, 20, 30, 70,0, 80, 120};
		Vector<Integer> result = new Vector<Integer>();
		result.add(20);
		result.add(80);
		result.add(0);
	
	
		assertEquals(result, ce.findCommon(arr1,arr2,arr3));
	}

	public void findCommonTest4() {
	
		int arr1[] = new int[] {1, 5, 10, 23, 40, 80};
		int arr2[] = new int[] {6, 23, 20, 80, 100};
		int arr3[] = new int[] {3, 4, 15, 2, 30, 70, 23, 120};
		Vector<Integer> result = new Vector<Integer>();
		result.add(23);
		result.add(80);
	
	
		assertEquals(result, ce.findCommon(arr1,arr2,arr3));
	}
}
