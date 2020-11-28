package com.demo.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.demo.Service.DoctorService;
import com.demo.rest.Doctor;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DoctorRepoService {
	 @Autowired
     DoctorService repo;
	 public List<Doctor> getDoctorById(int id){
			
			List<Doctor> doctors=repo.findAllById(id);
			log.info("list of doctors"+doctors);
			return doctors;
			}

}