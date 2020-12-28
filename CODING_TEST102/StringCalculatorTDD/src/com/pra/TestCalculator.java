package com.pra;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestCalculator {
	private Calculator calculator;
	
	
	@BeforeAll
	public void init() {
		 calculator=new Calculator();
	}
	@Test
	public void emptyStringReturnZero() {
		
		assertEquals(calculator.calculate(" ", 0));
	}
	@Test
	public void oneStringReturn() {
		//Calculator calculator=new Calculator();
		//assertEquals(calculator.calculate("", 0));
		assertEquals(calculator.calculate("1", 1));
	}
	private void assertEquals(int calculate) {
		// TODO Auto-generated method stub
		
	}

}

