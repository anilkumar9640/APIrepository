package com.neo.neo4j.organisationcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.neo4j.node.OrganisationNode;
import com.neo.neo4j.repository.OrganisationDao;

@RestController
@RequestMapping("/organisation")
public class GetOrganisationController {
	
	@Autowired
	private OrganisationDao organisationDao;
	
	@GetMapping("/getOrganisation/{id}")
	public OrganisationNode getOrganisation(@PathVariable String id) {
		return organisationDao.findById(id).orElse(null);
		
	}
	
	@GetMapping("/getAll")
	public List<OrganisationNode> getAllOrganisations(@PathVariable String id) {
		return organisationDao.findAll();
		
	}
	

}
