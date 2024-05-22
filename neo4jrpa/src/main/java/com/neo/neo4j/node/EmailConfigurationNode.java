package com.neo.neo4j.node;

import java.util.List;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;

@Node
public class EmailConfigurationNode {

	@Id
	private String id;

	private String email;

	private String password;

	private String inboxFolder;

	private String host;

	private String name;

	private String mailStoretype;
	
//	@Relationship(type = "EMAIL_BELONGS_TO", direction = Direction.OUTGOING)
//	private OrganisationNode organisations;
	

	
	


//	public OrganisationNode getOrganisations() {
//		return organisations;
//	}
//
//	public void setOrganisations(OrganisationNode organisations) {
//		this.organisations = organisations;
//	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getInboxFolder() {
		return inboxFolder;
	}

	public void setInboxFolder(String inboxFolder) {
		this.inboxFolder = inboxFolder;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailStoretype() {
		return mailStoretype;
	}

	public void setMailStoretype(String mailStoretype) {
		this.mailStoretype = mailStoretype;
	}

}
