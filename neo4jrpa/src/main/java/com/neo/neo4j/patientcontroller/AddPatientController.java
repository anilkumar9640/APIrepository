package com.neo.neo4j.patientcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.neo4j.node.PatientNode;
import com.neo.neo4j.repository.PatientDao;
import com.neo.neo4j.util.UniqueIdGenerator;

@RestController
@RequestMapping("patient")
public class AddPatientController {
	
	@Autowired
	private PatientDao patientDao;
	
	@PostMapping("/addPatient")
    public PatientNode addPatient(@RequestBody PatientNode patientNode) throws Exception {
		String msg="patient Already Exists";
		
		patientNode.setId(UniqueIdGenerator.getInstance().createUniqueId());
		PatientNode existingPatient = patientDao.findbyIdentifier(patientNode.getIdentifier());
		if(existingPatient==null) {
		return patientDao.save(patientNode);
		}else {
			throw new Exception(msg);
		}
	}

}
