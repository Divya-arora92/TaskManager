package com.taskmanager.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import com.taskmanager.database.TaskDetails;
import com.taskmanager.pojo.TaskInfoPojo;
//import com.taskmanager.pojo.ProjectInfoList;


@Repository
public interface TaskDetailsRepository extends JpaRepository<TaskDetails,Integer>  {
	
	List<TaskDetails> findByProjectId(int projectId);
	
TaskDetails findByTaskId(int taskId);
	//List<ProjectInfo> findByproject_id(String project_id);
	
	

	
}
