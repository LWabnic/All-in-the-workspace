package com.qa.personexercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

//Include @RunWith annotation here: Check community if needed.
@RunWith(MockitoJUnitRunner.class)
public class MenuTest {

	// Create your mocks
	@Mock
	PersonCreator creator;
	
	
	// Inject your mocks
	@InjectMocks
	Menu menu;
	
	
	// Write your tests for all 4 methods in the 'Menu' class
	@Test
	public void fullPersonTest() { 
		final String name = "Bob Smith", jobTitle = "Dev";
		final int age = 25;
		final Person created = new Person(name, jobTitle, age);
		
		Mockito.when(creator.createFullPerson(name, jobTitle, age)).thenReturn(created);
		
		assertEquals(created, menu.createFullPerson(name, jobTitle, age));
		
		Mockito.verify(creator, Mockito.times(1)).createFullPerson(name, jobTitle, age);
	}
	@Test
	public void JoblessPersonTest() { 
		final String name = "Bob Smith";
		final int age = 25;
		final Person created = new Person(name,age);
		
		Mockito.when(creator.createJoblessPerson(name, age)).thenReturn(created);
		
		assertEquals(created, menu.createJoblessPerson(name, age));
		
		Mockito.verify(creator, Mockito.times(1)).createJoblessPerson(name, age);
	}
	@Test
	public void AgelessPersonTest() { 
		final String name = "Bob Smith",jobTitle = "Dev";
		
		final Person created = new Person(name,jobTitle);
		
		Mockito.when(creator.createAgelessPerson(name,jobTitle)).thenReturn(created);
		
		assertEquals(created, menu.createAgelessPerson(name,jobTitle));
		
		Mockito.verify(creator, Mockito.times(1)).createAgelessPerson(name,jobTitle);
	}
	@Test
	public void NameOnlyPersonTest() { 
		final String name = "Bob Smith";
		
		final Person created = new Person(name);
		
		Mockito.when(creator.createNameOnlyPerson(name)).thenReturn(created);
		
		assertEquals(created, menu.createNameOnlyPerson(name));
		
		Mockito.verify(creator, Mockito.times(1)).createNameOnlyPerson(name);
	}
	// If done correctly, PersonCreator should have 0% coverage.
	// Note: Person.java will have coverage but it's a POJO (Plain Old Java Object)
	// So therefore this is okay in a unit test, as its extremely fast to test.
}
