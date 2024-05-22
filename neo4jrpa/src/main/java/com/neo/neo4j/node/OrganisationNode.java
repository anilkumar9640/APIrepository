package com.neo.neo4j.node;

import java.util.List;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;


@Node
public class OrganisationNode {

	@Id
	private String id;

	private String name;

	private String identifier;

	@Relationship(type = "HAS_ORGANISATION_DETAILS")
	private List<NameValuePairNode> organisationDetails;

	@Relationship(type = "HAS_EMAIL_CONFIGURATION")
	private List<EmailConfigurationNode> emailConfiguration;

	@Relationship(type = "HAS_SFTP_CONFIGURATION")
	private List<SftpConfigurationNode> sftpConfiguration;

	@Relationship(type = "HAS_AUTOMATION_CONFIGURATION")
	private AutomationConfigurationNode automationConfiguration;

	@Relationship(type = "HAS_SITE_DETAILS")
	private List<SiteDetailsNode> siteDetailsList;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public List<NameValuePairNode> getOrganisationDetails() {
		return organisationDetails;
	}

	public void setOrganisationDetails(List<NameValuePairNode> organisationDetails) {
		this.organisationDetails = organisationDetails;
	}

	public List<EmailConfigurationNode> getEmailConfiguration() {
		return emailConfiguration;
	}

	public void setEmailConfiguration(List<EmailConfigurationNode> emailConfiguration) {
		this.emailConfiguration = emailConfiguration;
	}

	public List<SftpConfigurationNode> getSftpConfiguration() {
		return sftpConfiguration;
	}

	public void setSftpConfiguration(List<SftpConfigurationNode> sftpConfiguration) {
		this.sftpConfiguration = sftpConfiguration;
	}

	public AutomationConfigurationNode getAutomationConfiguration() {
		return automationConfiguration;
	}

	public void setAutomationConfiguration(AutomationConfigurationNode automationConfiguration) {
		this.automationConfiguration = automationConfiguration;
	}

	public List<SiteDetailsNode> getSiteDetailsList() {
		return siteDetailsList;
	}

	public void setSiteDetailsList(List<SiteDetailsNode> siteDetailsList) {
		this.siteDetailsList = siteDetailsList;
	}
	
	

}
