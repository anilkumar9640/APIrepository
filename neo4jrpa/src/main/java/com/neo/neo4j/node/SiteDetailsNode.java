package com.neo.neo4j.node;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class SiteDetailsNode {
	
	@Id
	private String id;
	
	private String username;
	
	private String password;

	private String siteName;

	private String siteId;


//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name="organisation_id",referencedColumnName = "id")
//	@JsonIgnore
//	private OrganisationEntity orgEntity;
	
	private String   diagnosisCode;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getSiteName() {
		return siteName;
	}


	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}


	public String getSiteId() {
		return siteId;
	}


	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}


	public String getDiagnosisCode() {
		return diagnosisCode;
	}


	public void setDiagnosisCode(String diagnosisCode) {
		this.diagnosisCode = diagnosisCode;
	}
	
	

}
