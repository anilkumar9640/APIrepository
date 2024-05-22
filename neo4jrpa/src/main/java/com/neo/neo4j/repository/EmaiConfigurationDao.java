package com.neo.neo4j.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.neo.neo4j.node.EmailConfigurationNode;

public interface EmaiConfigurationDao  extends Neo4jRepository<EmailConfigurationNode, String>{

}
