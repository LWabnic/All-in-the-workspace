package com.qa.calc;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorUnitTestMockito {

	@Mock
	private Adder adder;

	@Mock
	private Subtractor subtractor;

	@Mock
	private Multiplier multipler;

	@Mock
	private Divider divider;

	@InjectMocks
	private Calculator calculator;

	@Test
	public void addTest() {
		Mockito.when(adder.add(5, 5)).thenReturn(10);

		assertEquals(10, calculator.add(5, 5));

		verify(adder, times(1)).add(Mockito.anyInt(), Mockito.anyInt());
	}

	@Test
	public void subTest() {
		Mockito.when(subtractor.sub(5, 5)).thenReturn(0);

		assertEquals(0, calculator.sub(5, 5));

		verify(subtractor, times(1)).sub(Mockito.anyInt(), Mockito.anyInt());
	}

	@Test
	public void mulTest() {
		Mockito.when(multipler.mul(5, 5)).thenReturn(25);

		assertEquals(25, calculator.mul(5, 5));

		verify(multipler, times(1)).mul(Mockito.anyInt(), Mockito.anyInt());
	}

	
	@Test
	public void divTest() {
		Mockito.when(divider.div(25, 5)).thenReturn((double) 5);

		assertEquals((double)5,divider.div(25,5),0);
		

		verify(divider, times(1)).div(Mockito.anyInt(), Mockito.anyInt());
	}

}
