package com.taskmanager.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;


import com.taskmanager.database.ParticipantInfoEntity;
import com.taskmanager.database.ProjectInfoEntity;
import com.taskmanager.database.TaskDetails;
import com.taskmanager.model.ParticipantRepository;
import com.taskmanager.model.ProjectRepository;
import com.taskmanager.model.TaskDetailsRepository;
import com.taskmanager.pojo.TaskInfoPojo;

import lombok.RequiredArgsConstructor;

import com.taskmanager.pojo.ParticipantPojo;
import com.taskmanager.pojo.ProjectPojo;

@Service
@RequiredArgsConstructor
public class TaskManagerService {
	
	@Autowired
	private TaskDetailsRepository taskInfoR;
	
	@Autowired
	private ProjectRepository projectPostR;
	
	@Autowired
	private ParticipantRepository participantPostR;

	
	/*public List<News> displayData() {

		List<News> a = nr.findAll();
		return a;
	}*/
	
	 //Display task details with projectId
    public List<TaskDetails> showTaskInfo( int project_id) {
    	
    	List<TaskDetails> projectDetails = taskInfoR.findByProjectId( project_id);
    			//taskInfoR.findAll();
    	
    	//List<TaskInfoPojo> a =projectDetails
    	
    	//how to convert entity into pojo
	
    
    	
    	
    	return projectDetails;
    	
    	
    }
  //Display task details with taskId
public TaskDetails showOnlyTaskInfo( int taskId) {
    	
    	TaskDetails taskDetails = taskInfoR.findByTaskId(taskId);
    			//taskInfoR.findAll();
    	
    	//List<TaskInfoPojo> a =projectDetails
    	
    	//how to convert entity into pojo
	
    
    	
    	
    	return taskDetails;
    	
    	
    }
    
  //Project creation code
  	public ProjectPojo saveProjectDetails(ProjectPojo projectInfoPojo) {
  		// TODO Auto-generated method stub
  		Random rand = new Random();
     	     int int1 = rand.nextInt(1000);
     	    
     	     
     	  ProjectInfoEntity projectinfoEntity =new ProjectInfoEntity();
     	  
     	 projectinfoEntity.setProjectId(int1);
     	
     	 projectinfoEntity.setProjectName(projectInfoPojo.getProjectName());
     			// .getProjectName());
     	projectInfoPojo.setProjectId(int1);
     	 
     	// taskinfoEntity.setTask_id(int1);
     
     	projectPostR.save(projectinfoEntity);
     	 
     	 return projectInfoPojo;
     	    
     
  		
  	}
  	
 //Participant creation code
  	public ParticipantPojo saveParticipantDetails(ParticipantPojo participantInfoPojo) {
  		// TODO Auto-generated method stub
  		Random rand = new Random();
     	     int int1 = rand.nextInt(1000);
     	    
     	     
     	  ParticipantInfoEntity participantinfoEntity =new ParticipantInfoEntity();
     	
     	 participantinfoEntity.setParticipantId(int1);
     	 
     	participantinfoEntity.setParticipantName(participantInfoPojo.getParticipantName());
     	participantInfoPojo.setParticipantId(int1);

     	// taskinfoEntity.setTask_id(int1);
     
     	participantPostR.save(participantinfoEntity);
     	 
     	 return participantInfoPojo;
     	    
     
  		
  	}
    
    
//Task creation code
	public TaskInfoPojo saveTaskDetails(TaskInfoPojo taskInfoPojo, int participantId, int projectId) {
		// TODO Auto-generated method stub
		Random rand = new Random();
   	     int int1 = rand.nextInt(1000);
   	     
   	    
   	     
   	  TaskDetails taskinfoEntity =new TaskDetails();
   	
   	 taskinfoEntity.setParticipantId(participantId);
   	 taskinfoEntity.setProjectId(projectId);
   	 
   	 taskinfoEntity.setTaskId(int1);
   	 taskinfoEntity.setDescription(taskInfoPojo.getDescription());
   	 
   	 //taskinfoEntity.se
   	 taskinfoEntity.setStartDate(taskInfoPojo.getStartDate());
   	 taskinfoEntity.setEndDate(taskInfoPojo.getEndDate());
   	 taskinfoEntity.setTitle(taskInfoPojo.getTitle());
   	 taskinfoEntity.setStatus(taskInfoPojo.getStatus());
   	 
   	taskInfoPojo.setTaskId(int1);
   	taskInfoPojo.setParticipantId(participantId);
   	taskInfoPojo.setProjectId(projectId);
   	taskInfoR.save(taskinfoEntity);
   	 
   	 return taskInfoPojo;
   	    
   
		
	}
	
	

//Task updation code
	
	public TaskInfoPojo updateTaskDetails(TaskInfoPojo taskInfoPojo ,int taskId) {
		
   	 TaskDetails taskinfoEntity=taskInfoR.findByTaskId( taskId);//();//.findByParticipant_idAndProject_idAndTask_id(participant_id, project_id, task_id);
   			
   	
   	 taskinfoEntity.setTaskId(taskId);
   	 
   	
   	 taskinfoEntity.setDescription(taskInfoPojo.getDescription());
   	 taskinfoEntity.setStartDate(taskInfoPojo.getStartDate());
   	 taskinfoEntity.setEndDate(taskInfoPojo.getEndDate());
   	 taskinfoEntity.setTitle(taskInfoPojo.getTitle());
   	 taskinfoEntity.setStatus(taskInfoPojo.getStatus());
 	//taskInfoPojo.setParticipantId(participantId);
   	//taskInfoPojo.setProjectId(projectId);
	taskInfoPojo.setTaskId(taskId);
   	 
   
   	 
   	taskInfoR.save(taskinfoEntity);
   	 
   	 return taskInfoPojo;
   	    
   
		
	}
    
    
    
}
