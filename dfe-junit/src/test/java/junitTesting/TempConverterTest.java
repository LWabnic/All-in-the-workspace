package junitTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TempConverterTest {
	
	TempConverter c;
		
		@Before
		public void init() {
			c=new TempConverter();
		}
		
		@Test
		public void convertFahrenheitToCelsiusTest() {
			assertEquals(((float) 5 / 9) * (10 - 32),c.convertFahrenheitToCelsius(10),0);
		}
		@Test
		public void convertCelsiusToFahrenheitTest() {
			assertEquals(((float) 9 / 5) * (10) + 32,c.convertCelsiusToFahrenheit(10),0);
		}
		@Test
		public void convertKelvinToCelsiusTest() {
			assertEquals(10 - 273,c.convertKelvinToCelsius(10),0);
		}
		@Test
		public void convertCelsiusToKelvinTest() {
			assertEquals(10 + 273,c.convertCelsiusToKelvin(10),0);
		}
		@Test
		public void convertKelvinToFahrenheitTest() {
			assertEquals(((float) 9 / 5) * (10 - 273) + 32,c.convertKelvinToFahrenheit(10),0);
		}
		@Test
		public void convertFahrenheitToKelvinTest() {
			assertEquals(((float) 5 / 9) * (10 - 32) + 273,c.convertFahrenheitToKelvin(10),0);
			
		}
	
	
	
}
