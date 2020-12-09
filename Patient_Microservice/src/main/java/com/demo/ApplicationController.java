package com.demo;


import com.demo.repo.Patient_repoService;
import com.demo.repo.Patient_repo;
import com.demo.rest.Patient;
import org.springframework.web.bind.annotation.PathVariable;
import com.demo.exception.PatientNotFoundException;
import com.demo.exception.SomethingWentWrong;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;
import com.demo.Service.FetchDataService;
@RestController
public class ApplicationController {
	
	@Autowired
	private Patient_repo prepo;

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
	public List<Patient> getPatientByUsername(@PathVariable String username) throws PatientNotFoundException
	{
		
		 List<Patient> patient=repo. getPatientUsername(username);
		 if(patient.isEmpty())
		 {
			 throw new PatientNotFoundException();
		 }
		 else
			 
		 return patient;
		 }


	@PostMapping("/addPatient")
	public String patientDetail(@RequestBody Patient p) throws PatientNotFoundException
	{
		if(p.getUsername()==null) 
	{
		throw new PatientNotFoundException();
	}
	else
	{
		repo.patientDetail(p);
		return "added successfully";
	}
	}
	@GetMapping("/deletePatient/{patientid}")  
	public String deleteBook(@PathVariable Long patientid) throws SomethingWentWrong
	{  if(!prepo.existsById(patientid))
	{
		throw new SomethingWentWrong();
	}
	else
	{
		repo.delete(patientid);  
		return " Patient Deleted Succesfully";
	}  }
	}