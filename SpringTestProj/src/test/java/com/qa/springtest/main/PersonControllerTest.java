package com.qa.springtest.main;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.springtest.domain.Person;
import com.qa.springtest.service.PersonService;

@RunWith(SpringRunner.class)
@WebMvcTest
public class PersonControllerTest {
@Autowired
private MockMvc mvc;
@Autowired
private ObjectMapper mapper;
@MockBean
PersonService service;

@Test
public void createTest() throws Exception{
	Person p=new Person("Test","Testson");
	String pAsJson=this.mapper.writeValueAsString(p);
	
Mockito.when(this.service.create(p)).thenReturn(p);
	
	mvc.perform(post("/api/create")
			.contentType(MediaType.APPLICATION_JSON)
			.content(pAsJson))
			.andExpect(status().isCreated())
			.andExpect(content().json(pAsJson));
}

}
