package org.accenture.fac;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {
	@Test
	public void Test1() {
		Factorial factorial= new Factorial();
		
		long result= factorial.compute(0);
		long expectedValue=1;
		
		assertEquals(expectedValue,result);
		
	}
	@Test
	public void Test2() {
		Factorial factorial= new Factorial();
		
		long result= factorial.compute(1);
		long expectedValue=1;
		
		assertEquals(expectedValue,result);
		
	}
	@Test
	public void Test3() {
		Factorial factorial= new Factorial();
		
		long result= factorial.compute(2);
		long expectedValue=2;
		
		assertEquals(expectedValue,result);
		
	}
	@Test
	public void Test4() {
		Factorial factorial= new Factorial();
		
		long result= factorial.compute(5);
		long expectedValue=120;
		
		assertEquals(expectedValue,result);
		
	}
}
