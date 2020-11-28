package com.demo.repo;
import org.springframework.data.repository.CrudRepository;  
import org.springframework.stereotype.Repository;
import com.demo.rest.Patient;
import java.util.List;
@Repository
public interface Patient_repo extends CrudRepository<Patient, Long> {
	List<Patient> findAllByUsername(String username);
	@Override
	List<Patient> findAll();
}

