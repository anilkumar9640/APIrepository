package com.neo.neo4j.emailconfiguration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.neo4j.node.EmailConfigurationNode;
import com.neo.neo4j.node.OrganisationNode;
import com.neo.neo4j.repository.EmaiConfigurationDao;
import com.neo.neo4j.repository.OrganisationDao;
import com.neo.neo4j.util.UniqueIdGenerator;

@RestController
@RequestMapping("/emailconfiguration")
public class AddEmailConfigurationController {

	@Autowired
	private EmaiConfigurationDao emailConfigurationDao;

	@Autowired
	private OrganisationDao organisationDao;

	@PutMapping("/addEmailConfiguration/{organisationId}")
	public ResponseEntity<Object> addEmailForOrganisation(@RequestBody EmailConfigurationNode emailConfig,
			@PathVariable String organisationId) {

		ResponseEntity<Object> responseEntity = null;

		OrganisationNode organisationNode = organisationDao.findById(organisationId).orElse(null);
		if (organisationNode != null) {

			String ID = "EC" + UniqueIdGenerator.generateNumericId(4);

			emailConfig.setId(ID);

			organisationNode.getEmailConfiguration().add(emailConfig);

			organisationDao.save(organisationNode);

			OrganisationNode organisationNode1 = organisationDao.findById(organisationId).orElse(null);
			
			emailConfig = emailConfigurationDao.findById(emailConfig.getId()).orElse(null);
			if (emailConfig != null) {

				responseEntity = new ResponseEntity<>(organisationNode1, HttpStatus.OK);
			}
		}

		return responseEntity;
	}
}
