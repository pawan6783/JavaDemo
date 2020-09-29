package com.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.MoveZeroToEnd;

public class MoveZeroToEndTest {
	
	MoveZeroToEnd mz = null;
	
	@BeforeEach
	public void setUp() {
		mz = new MoveZeroToEnd();
	}
	
	@Test
	public void moveZeroTest1() {
		
		int result[] = {1, 2, 4, 3, 5, 0, 0, 0};
		assertArrayEquals(result, mz.moveZero(new int[] {1, 2, 0, 4, 3, 0, 5, 0}));
	}
	
	@Test
	public void moveZeroTest2() {
		
		int result[] = {11, 2, 41, 33, 5, 0, 0, 0};
		assertArrayEquals(result, mz.moveZero(new int[] {11, 0, 2, 41, 0, 0, 33, 5}));
	}
	
	@Test
	public void moveZeroTest3() {
		
		int result[] =  {10, 205, 30, 600, 0, 0};
		assertArrayEquals(result, mz.moveZero(new int[] {0, 10, 205, 0, 30, 600}));
	}
	
	@Test
	public void moveZeroTest4() {
		
		int result[] = {21, 50, 1, 600, 0, 0, 0};
		assertArrayEquals(result, mz.moveZero(new int[] {0, 21, 0, 50, 1, 600, 0}));
	}
}
