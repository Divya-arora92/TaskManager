package com.taskmanager.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taskmanager.database.ProjectInfoEntity;
//import com.taskmanager.pojo.ProjectPojo;
@Repository
public interface ProjectRepository extends JpaRepository<ProjectInfoEntity,Long>  {
	
	
	
		

		
	}



