package junitTesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotanionExampleTest {

	@BeforeClass
	public static void setup() {
		System.out.println("Setup");
	}
	
	@Before
	public void BeforeMethod() {
		System.out.println("BeforeMethod");
	}
	
	@Test
	public void test() {
		System.out.println("Test 1");
	}
	
	
	@Test
	@Ignore
	public void test2() {
		System.out.println("Test 2");
	}
	@Test
	public void test3() {
		System.out.println("Test 3");
	}
	
	@After
	public void AfterMethod() {
		System.out.println("AfterMethod");
	}
	
	@AfterClass
	public static void teardown() {
		System.out.println("Teardown");
	}
	
}
