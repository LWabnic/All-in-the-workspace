package com.qa.springtest.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import com.qa.springtest.domain.Person;
import com.qa.springtest.dto.PersonDTO;
import com.qa.springtest.repo.PersonRepo;
import com.qa.springtest.exceptions.PersonNotFoundException;

@Service
public class PersonService {

	private ModelMapper mapper;
	private PersonRepo repo;
	
	@Autowired
	public PersonService(PersonRepo repo,ModelMapper mapper) {
		this.repo=repo;
		this.mapper=mapper;
	}
	//Map to Dto
	public PersonDTO mapToDTO(Person p) {
		return this.mapper.map(p, PersonDTO.class);
	}
	//Map from Dto
		public Person mapFromDTO(PersonDTO p) {
			return this.mapper.map(p, Person.class);
		}
	//Create for DTo
		public PersonDTO createDTO(PersonDTO p) {
			Person saveIt=this.mapFromDTO(p);
			Person saved=this.repo.save(saveIt);
			return this.mapToDTO(saved);
		}
		
		


	// CREATE
	public Person create(Person p) {
		return this.repo.saveAndFlush(p);
	}

	// READ ALL
	public List<Person> readAllRecords() {
		return this.repo.findAll();
	}

	// READ ID
	public Person readId(Long id) {
		return this.repo.findById(id).get();
	}

	// DELETE
	public Boolean deleteId(Long id) {
		if (!this.repo.existsById(id)) {
			throw new PersonNotFoundException();
		}
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}

	// UPDATE
	public Person updateId(Person p, Long id) {
		Person exists = this.repo.findById(id).orElseThrow(PersonNotFoundException::new);
		exists.setFirstName(p.getFirstName());
		exists.setLastName(p.getLastName());
		return this.repo.saveAndFlush(exists);
	}

	// Find by name
//	public List<Person> findByName(String name) {
//		return this.repo.findByName(name);
//	}
//
//	private List<Person> people = new ArrayList<>();
//
//	public List<Person> readAll() {
//		List<Person> list = Arrays.asList(new Person(1L, "Bob", "Bobson"), new Person(2L, "Rob", "Robson"));
//		return list;
//	}
//
//	public boolean addPerson(@RequestBody Person person) {
//		return this.people.add(person);
//	}
//	public PersonService(PersonRepo repo) {
//		this.repo = repo;
//	}
}
