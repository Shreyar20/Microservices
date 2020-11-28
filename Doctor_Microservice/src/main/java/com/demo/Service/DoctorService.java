package com.demo.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.rest.Doctor;
import com.demo.rest.Patient;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.context.annotation.Bean;

@Service
@Repository
public interface DoctorService extends JpaRepository<Doctor,Integer> {
List<Doctor> findAllById(int id);
	@Override
	List<Doctor> findAll();
	
	
}