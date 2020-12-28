package com.pra;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCalculator {
	@Test
	public void emptyStringReturnZero() {
		Calculator calculator=new Calculator();
		//assertEquals(calculator.calculate("", 0));
		assertEquals(calculator.calculate("", 0));
	}

	private void assertEquals(int calculate) {
		// TODO Auto-generated method stub
		
	}
}
