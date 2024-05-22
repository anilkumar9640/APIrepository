package com.neo.neo4j.node;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
public class SftpConfigurationNode {
	
	@Id
	private String id;
	
	private String password;

	private String folder;

	private String host;
	
	private String username;

	private int port;
	
	private String privateKeyFile;

	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name="organisation_id", referencedColumnName = "id") 
//	@JsonIgnore
//	private OrganisationEntity organiseEntity;

	
	private boolean enable ;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFolder() {
		return folder;
	}


	public void setFolder(String folder) {
		this.folder = folder;
	}


	public String getHost() {
		return host;
	}


	public void setHost(String host) {
		this.host = host;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public int getPort() {
		return port;
	}


	public void setPort(int port) {
		this.port = port;
	}


	public String getPrivateKeyFile() {
		return privateKeyFile;
	}


	public void setPrivateKeyFile(String privateKeyFile) {
		this.privateKeyFile = privateKeyFile;
	}


	public boolean isEnable() {
		return enable;
	}


	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	
	
	

}
