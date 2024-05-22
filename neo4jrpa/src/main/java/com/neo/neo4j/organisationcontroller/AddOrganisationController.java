package com.neo.neo4j.organisationcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.neo4j.node.NameValuePairNode;
import com.neo.neo4j.node.OrganisationNode;
import com.neo.neo4j.repository.OrganisationDao;
import com.neo.neo4j.util.UniqueIdGenerator;

@RestController
@RequestMapping("organisation")
public class AddOrganisationController {

	@Autowired
	private OrganisationDao organisationDao;

	@PostMapping("/add")
	public OrganisationNode addOrganisation(@RequestBody OrganisationNode organisationNode) {

		organisationNode.setId(UniqueIdGenerator.getAlphaNumeric(6));

		List<NameValuePairNode> organisationDetails = new ArrayList<>();

		if(organisationNode.getOrganisationDetails()!=null) {
		organisationNode.getOrganisationDetails().forEach(details -> {
			NameValuePairNode organisationDetail = new NameValuePairNode();

			organisationDetail.setId(UniqueIdGenerator.getInstance().createUniqueId());
			organisationDetail.setKey(details.getKey());
			organisationDetail.setValue(details.getValue());

			organisationDetails.add(organisationDetail);
		});
		}
		organisationNode.setOrganisationDetails(organisationDetails);
		return organisationDao.save(organisationNode);

	}

}
