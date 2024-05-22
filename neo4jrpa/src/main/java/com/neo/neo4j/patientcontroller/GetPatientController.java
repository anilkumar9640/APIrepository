package com.neo.neo4j.patientcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.neo4j.node.PatientNode;
import com.neo.neo4j.repository.PatientDao;

@RestController
@RequestMapping("/patient")
public class GetPatientController {
	
	@Autowired
	private PatientDao patientDao;
	
	@GetMapping("/getPatient/{id}")
	public PatientNode getPatient(@PathVariable String id) {
		return patientDao.findById(id).orElse(null);
	}
	
	@GetMapping("/getAll")
	public List<PatientNode> getAllPatients() {
		return patientDao.findAll();
	}
    
	
}
