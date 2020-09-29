package com.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.MissingNumber;

public class MissingNumberTest {

	MissingNumber mn = null;
	
	@BeforeEach
	public void setUp() {
		mn = new MissingNumber();
	}
	
	@Test
	public void testFindMissingNumber1() {
		assertEquals(3, mn.findMissingNumber(new int[] {1,2,4,5,6},5));
	}
	
	@Test
	public void testFindMissingNumber2() {
		assertEquals(5, mn.findMissingNumber(new int[] {1,2,3,4,6},5));
	}
	
	@Test
	public void testFindMissingNumber3() {
		assertEquals(2, mn.findMissingNumber(new int[] {1,3,4,5,6},5));
	}
	
	@Test
	public void testFindMissingNumber4() {
		assertEquals(6, mn.findMissingNumber(new int[] {1,2,3,4,5},5));
	}
	
	

}
