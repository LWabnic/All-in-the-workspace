package com.qa.springtest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.springtest.domain.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person,Long> {

}
