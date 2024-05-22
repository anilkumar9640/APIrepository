package com.neo.neo4j.emailconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.neo4j.node.EmailConfigurationNode;
import com.neo.neo4j.repository.EmaiConfigurationDao;
import com.neo.neo4j.repository.OrganisationDao;

@RestController
@RequestMapping("/emailconfiguration")
public class GetEmailConfigurationController {
	
	@Autowired
	private EmaiConfigurationDao emailConfigurationDao;
	
	@Autowired
	private OrganisationDao organisationDao;
	
	@GetMapping("getEmail/{id}")
	public EmailConfigurationNode getEmail(@PathVariable String id) {
		return emailConfigurationDao.findById(id).orElse(null);
		
	}

}
