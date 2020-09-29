package com.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.LargestThreeNumbers;

public class LargestThreeNumbersTest {
	
	LargestThreeNumbers ltn= null;
	
	@BeforeEach 
	public void setUp() {
		 ltn = new  LargestThreeNumbers();
	}
	
	@Test
	public void findLargestThreeNumbersTest1() {
		
		int[] expectedArray = {90,50,23};
		
		assertArrayEquals(expectedArray, ltn.findLargestThreeNumbers(new int[] {10, 4,3,50,23,90},6));
	}
	
	@Test
	public void findLargestThreeNumbersTest2() {
		
		int[] expectedArray = {100,23,22};
		
		assertArrayEquals(expectedArray, ltn.findLargestThreeNumbers(new int[] {100,4,3,1,23,22},6));
	}
	
	@Test
	public void findLargestThreeNumbersTest3() {
		
		int[] expectedArray = {1000,500,100};
		
		assertArrayEquals(expectedArray, ltn.findLargestThreeNumbers(new int[] {100, 4,3,500,23,1000},6));
	}
	
	@Test
	public void findLargestThreeNumbersTest4() {
		
		int[] expectedArray = {90,50,40};
		
		assertArrayEquals(expectedArray, ltn.findLargestThreeNumbers(new int[] {22, 40,35,50,23,90},6));
	}
}
