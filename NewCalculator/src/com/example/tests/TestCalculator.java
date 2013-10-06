package com.example.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.classes.Calculator;

public class TestCalculator {
	Calculator cal = new Calculator();
	

	@Test
	public void testadd() {
		assertEquals("the output of addition is: ",50, cal.add(10, 40));
//		fail("Not yet implemented");
	}
	@Test
	public void testmul() {
		assertEquals("the output of multiplication is: ",400, cal.mul(10, 40));
//		fail("Not yet implemented");
	}
	@Test
	public void testdiv() {
		assertEquals("the output of division is: ",0, cal.div(10, 40));
//		fail("Not yet implemented");
	}

}
