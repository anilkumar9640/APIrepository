package com.neo.neo4j.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.neo.neo4j.node.OrganisationNode;

@Repository
public interface OrganisationDao extends Neo4jRepository<OrganisationNode, String>{

}
