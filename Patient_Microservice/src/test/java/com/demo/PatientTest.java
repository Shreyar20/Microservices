//package com.demo;
//
//import org.junit.Test;
//import java.util.stream.Stream;
//import java.util.stream.Collectors;
//import static org.mockito.Mockito.when;
//import static org.junit.Assert.assertEquals;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.beans.factory.annotation.Autowired;
//import com.demo.repo.Patient_repoService;
//import com.demo.repo.Patient_repo;
//import com.demo.rest.Patient;
//
//@RunWith(SpringRunner.class)
//
//@SpringBootTest
//public class PatientTest {
//
//	@Autowired
//	private Patient_repoService service;
//	
//	@MockBean
//	private Patient_repo repo;
//	
//	
//	@Test
//	public void contextLoads() {
//	}
//	@Test
//	public void  getAllPatientTest()
//	{
//		when(repo.findAll()).thenReturn(Stream 
//				.of(new Patient(7,"patient6@gmail.com","Corona","Symptoms include fever,running nose","Rachel")).collect(Collectors.toList()));
//		assertEquals(1,service. getAllPatient().size());
//	}
//	@Test
//	public void getPatientUsernameTest()
//	{
//		String patient="Bob";
//				when(repo.findAllByUsername(patient)).thenReturn(Stream 
//				.of(new Patient(7,"patient6@gmail.com","Corona","Symptoms include fever,running nose","Rachel")).collect(Collectors.toList()));
//		assertEquals(1,service. getPatientUsername(patient).size()); 
//	}
//	
//
//}
