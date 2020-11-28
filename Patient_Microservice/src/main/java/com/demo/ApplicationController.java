package com.demo;


import com.demo.repo.Patient_repoService;
import com.demo.rest.Patient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import com.demo.Service.FetchDataService;
@RestController
public class ApplicationController {
	

	@Autowired
	private Patient_repoService repo;
@Autowired
FetchDataService fetchDataService;
	@GetMapping("/")
	public String hospital ()
	{
		return "<h1>Welcome to City Hospital</h1>";
	}
	@GetMapping(value="/retrievePatient")
	List<Patient> getUsers()
	{
		return fetchDataService.findAll();
	}
	
	
	@GetMapping("/getPatient/{username}")
	public List<Patient> getPatientByUsername(@PathVariable String username)
	{
		 List<Patient> patient=repo. getPatientUsername(username);
		 return patient;
		 }
	
	
	@GetMapping("/deletePatient/{patientid}")  
	public String deleteBook(@PathVariable Long patientid)   
	{  
		repo.delete(patientid);  
		return " Patient Deleted Succesfully";
	}  
	}