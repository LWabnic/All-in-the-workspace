package com.qa.springtest.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qa.springtest.domain.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person,Long> {

	@Query(value="SELECT * FROM person Where first_name= ?1",nativeQuery = true)
	List<Person> findByName(String name);
	
}
