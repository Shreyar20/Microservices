package com.demo.repo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.demo.rest.Patient;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class Patient_repoService {
	 @Autowired
     Patient_repo repo;
	 
//	 public Patient addPatient(Patient patient)
//	 {
//		 return repo.save(patient);
//	 }
	 
public List<Patient> getAllPatient()
{
	List<Patient> patients=repo.findAll();
	System.out.println(patients);
	return patients;
}
		public List<Patient> getPatientUsername(String username){
			
			List<Patient> patients=repo.findAllByUsername(username);
			log.info("list of patients"+patients);
			return patients;
			}
		
		public void delete(Long id)   
		{  
		repo.deleteById(id);  
		log.info("Patient Deleted Successfully");
		
		}  
		

}