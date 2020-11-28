package com.demo.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.rest.Patient;

import java.util.List;

@Repository
public interface FetchDataService extends JpaRepository<Patient,Integer> {

	@Override
	List<Patient> findAll();
}
