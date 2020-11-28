package com.demo;

import com.demo.rest.Patient;
import com.demo.rest.Doctor;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.demo.Service.DoctorRepoService;
import com.demo.Service.DoctorService;

@RestController
public class ApplicationController {
	@Autowired 
	 PatientService service;
	@Autowired 
	 DoctorService doctor;
	@Autowired
	DoctorRepoService repo;
	


	@GetMapping("/")
	public String getWelcome(){
		return "<h1>Welcome to City Hospital</h1>";
	}
	
	
	
	@GetMapping("/patient")
public List<Patient> getAllUsers()
{
		return service.getUsers();
	
}
	@GetMapping("/doctor")
	public List<Doctor> getDoctor()
	{
			return doctor.findAll();
		
	}
	@GetMapping("/getDoctor/{id}")
	public List<Doctor> getAllDoctorById(@PathVariable int id){
		 List<Doctor> doctors=repo.getDoctorById(id);
		 return doctors ;
		 }
	
}