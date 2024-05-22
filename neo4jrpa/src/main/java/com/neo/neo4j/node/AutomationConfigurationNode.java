package com.neo.neo4j.node;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class AutomationConfigurationNode {

	@Id
	private String id;
	
	private String status;//start , stop

	private int retryCount;
	
//	@OneToOne()
//	@JoinColumn(name="organisation_id")
//	@JsonIgnore
//	private OrganisationEntity organisationEntity;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getRetryCount() {
		return retryCount;
	}

	public void setRetryCount(int retryCount) {
		this.retryCount = retryCount;
	}
	

	
	
}
