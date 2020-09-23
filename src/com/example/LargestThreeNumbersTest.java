package com.example;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LargestThreeNumbersTest {
	
	LargestThreeNumbers ltn= null;
	
	@BeforeEach 
	public void setUp() {
		 ltn = new  LargestThreeNumbers();
	}
	
	@Test
	public void findLargestThreeNumbersTest() {
		
		int[] expectedArray = {90,50,23};
		
		assertArrayEquals(expectedArray, ltn.findLargestThreeNumbers(new int[] {10, 4,3,50,23,90},6));
	}
}
