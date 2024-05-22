package com.neo.neo4j.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import com.neo.neo4j.node.PatientNode;

public interface PatientDao  extends Neo4jRepository<PatientNode, String>{

	@Query("match(n:PatientNode{identifier:identifier)")
	PatientNode findbyIdentifier(String identifier);

}
