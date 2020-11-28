package com.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import java.util.List;

import com.demo.rest.Patient;


@FeignClient(url="http://localhost:8081",name="Patient")

@Service
public interface PatientService{
	@GetMapping("/retrievePatient")
	public List<Patient> getUsers();
	
}



