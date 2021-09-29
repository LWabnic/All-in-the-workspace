package com.example.demo.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import com.sun.istack.NotNull;

@Entity
@Table(name="Person")
public class Person {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String firstName;
    @NotNull
    @Pattern(regexp="^[a-zA-Z]+$")
    private String lastName;
	
    
    public Person(Long id, String firstName, @Pattern(regexp = "^[a-zA-Z]+$") String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
    public Person(String firstName, @Pattern(regexp = "^[a-zA-Z]+$") String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public int hashCode() {
		final int prime=31;
		int result=1;
		result=prime*result+((firstName==null)?0:firstName.hashCode());
		result=prime*result+((id==null)?0:id.hashCode());
		result=prime*result+((lastName==null)?0:lastName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(id, other.id)
				&& Objects.equals(lastName, other.lastName);
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
  
    
    
}