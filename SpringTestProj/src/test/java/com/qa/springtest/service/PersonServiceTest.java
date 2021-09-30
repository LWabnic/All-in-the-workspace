package com.qa.springtest.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.springtest.domain.Person;
import com.qa.springtest.exceptions.PersonNotFoundException;
import com.qa.springtest.repo.PersonRepo;

@RunWith(MockitoJUnitRunner.class)
public class PersonServiceTest {
//The class i will be testing
	@InjectMocks
	PersonService service;
//The class i will be mocking
	@Mock
	private PersonRepo repo;

	@Test
	public void createTest() {
		Person input = new Person("Test", "Testson");
		Person output = new Person(1L, "Test", "Testson");

		// mocking the output from PersonRepo class
		Mockito.when(this.repo.saveAndFlush(input)).thenReturn(output);

		assertEquals(output, this.service.create(input));

		Mockito.verify(this.repo, Mockito.times(1)).saveAndFlush(input);
	}

	@Test
	public void readAllRecordsTest() {

		List<Person> output = Arrays.asList(new Person(1L, "Bob", "Bobson"), new Person(2L, "Rob", "Robson"));

		// mocking the output from PersonRepo class
		Mockito.when(this.repo.findAll()).thenReturn(output);

		assertEquals(output, this.service.readAllRecords());

		Mockito.verify(this.repo, Mockito.times(1)).findAll();
	}

	@Test
	public void readIdTest() {

		Person input = new Person(1L, "Bob", "Bobson");
		// Optional<Person> output = Optional.of(input);

		// mocking the output from PersonRepo class
		Mockito.when(this.repo.findById(1L)).thenReturn(Optional.of(input));

		assertEquals(input, this.service.readId(1L));

		Mockito.verify(this.repo, Mockito.times(1)).findById(1L);
	}

	@Test
	public void deleteIdSuccesTest() {

		Mockito.when(this.repo.existsById(1L)).thenReturn(true, false);

		assertTrue(this.service.deleteId(1L));

		Mockito.verify(this.repo, Mockito.times(1)).deleteById(1L);
		Mockito.verify(this.repo, Mockito.times(2)).existsById(1L);

	}

	@Test(expected = PersonNotFoundException.class)
	public void deleteIdFailTest() {

		Mockito.when(this.repo.existsById(1L)).thenReturn(false);
		this.service.deleteId(1L);

		Mockito.verify(this.repo, Mockito.times(0)).deleteById(1L);
		Mockito.verify(this.repo, Mockito.times(0)).existsById(1L);
	}

	@Test
	public void UpdateIdSuccesTest() {
	
		Person input = new Person(1L, "Test", "Testson");
		Long id =1L;
		
		// mocking the output from PersonRepo class
		Mockito.when(this.repo.findById(id)).thenReturn(Optional.of(input));
		Mockito.when(this.repo.saveAndFlush(input)).thenReturn(input);
		
		assertEquals(this.repo.saveAndFlush(input), this.service.updateId(input,id));

		Mockito.verify(this.repo, Mockito.times(1)).findById(id);
		Mockito.verify(this.repo, Mockito.times(2)).saveAndFlush(input);
		
	}
	@Test(expected = PersonNotFoundException.class)
	public void UpdateIdFailedTest() {
	
		Person input = new Person(1L, "Test", "Testson");
		Long id =1L;
		Optional<Person> exists = Optional.empty();
		
		// mocking the output from PersonRepo class
		Mockito.when(this.repo.findById(id)).thenReturn(exists);
		
		
		this.service.updateId(input,id);

		Mockito.verify(this.repo, Mockito.times(1)).findById(id);

		
	}

}
