package com.HW3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.HW3.SetUsingArray.SetUsingArray;

class test {
	private SetUsingArray objSet;
	private SetUsingArray objSet1;
	private Object[] myArray;
	
	@Before
	void setUp() {
		objSet1 = new SetUsingArray();
		myArray = new Object[10];
	}
	
	@Test
	void test() {
		objSet = new SetUsingArray();
		assertEquals(5, objSet.add(2, 3));
		
	}
	
	@Test
	void testIsArrayEmpty() {
		Object[] myArray = new Object[10];
		boolean result = objSet1.isArrayEmpty(myArray);
		System.out.println(result); 
		assertEquals(true, result);
	}
	
	@Test
	void testIsNotArrayEmpty() {
		Object[] myArray = new Object[10];
		myArray[9] = "vineeth";
		boolean result = objSet1.isArrayEmpty(myArray);
		System.out.println(result); 
		assertEquals(false, result);
	}
	
	@Test
	void testInsertWithFullArray() {
		int count = 10;
		Object[] myArray1 = new Object[10];
		for (int i = 0; i < myArray1.length; i++) {
			myArray1[1] = count;
			count =+1;
		}
		objSet1.myArray = myArray1;
		objSet1.insert();
		boolean x = objSet1.testInsertFlag;
		assertEquals(false, x);
	}

}
