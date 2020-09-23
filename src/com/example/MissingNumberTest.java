package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MissingNumberTest {

	MissingNumber mn = null;
	
	@BeforeEach
	public void setUp() {
		mn = new MissingNumber();
	}
	
	@Test
	public void testFindMissingNumber() {
		assertEquals(3, mn.findMissingNumber(new int[] {1,2,4,5,6},5));
	}
	
	

}
