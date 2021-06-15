package com.taskmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanager.database.TaskDetails;
import com.taskmanager.pojo.ParticipantPojo;
import com.taskmanager.pojo.ProjectPojo;
import com.taskmanager.pojo.TaskInfoList;
import com.taskmanager.pojo.TaskInfoPojo;
import com.taskmanager.service.TaskManagerService;

//import antlr.collections.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;


@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/taskmanager")
public class TaskManagerController {
	
	@Autowired
	private TaskManagerService servi;
	
	
	@PostMapping("/participant")
	public ResponseEntity<ParticipantPojo> getParticipantDetails(@RequestBody ParticipantPojo participantPojo)
	
	{
	
		ParticipantPojo partiPojo1=servi.saveParticipantDetails(participantPojo);
				
		return new ResponseEntity<ParticipantPojo>(partiPojo1,HttpStatus.OK);
		
		
			
	}
	
	@PostMapping("/project")
	public ResponseEntity<ProjectPojo> getProjectDetails(
			@RequestBody ProjectPojo projectPojo)
	
	{
	
		ProjectPojo projectPojo1=servi.saveProjectDetails(projectPojo);
				
		return new ResponseEntity<ProjectPojo>(projectPojo1,HttpStatus.OK);
		
		
			
	}
	
	
	
	
	@PostMapping("/participant/{participantId}/project/{projectId}/task")
	public ResponseEntity<TaskInfoPojo> getTaskDetails(@PathVariable int participantId,@PathVariable int projectId ,
			@RequestBody TaskInfoPojo taskInfoPojo)
	
	{
	
		TaskInfoPojo taskInfoPojo1=servi.saveTaskDetails(taskInfoPojo, participantId, projectId);
				
		return new ResponseEntity<TaskInfoPojo>(taskInfoPojo1,HttpStatus.OK);
		
		
			
	}
	
	@PutMapping("/task/{taskId}")
	public ResponseEntity<TaskInfoPojo> updateTaskDetails(@PathVariable int taskId,@RequestBody TaskInfoPojo taskInfoPojo)
	
	{
	
 		TaskInfoPojo taskInfoPojo2=servi.updateTaskDetails(taskInfoPojo,taskId);
				
		return new ResponseEntity<TaskInfoPojo>(taskInfoPojo2,HttpStatus.OK);
		
		
			
	}
	/*
	@GetMapping("/news")
	public ListNews sayHi()
	{
		
		List<News> news=servi.displayData() ;
		ListNews listNews=new ListNews();
		listNews.setListNews(news);
		return listNews;
	}*/
	
	
	@GetMapping("/project/{projectId}")
	public TaskInfoList displayTaskDetails(@PathVariable int projectId 
			)
	
	{
	
 		List <TaskDetails> taskInfoTable;
 		taskInfoTable=servi.showTaskInfo( projectId);
 		
 		TaskInfoList tasklist=new TaskInfoList();
 		
 		tasklist.setTasklist(taskInfoTable);
 		
 	//	.setTasklist(taskInfoPojo2);
 		return tasklist;
 		
				
	//	return new ResponseEntity<TaskInfoPojo>(taskInfoPojo2,HttpStatus.OK);
		
		
			
	}
	
	@GetMapping("/task/{taskId}")
	public TaskDetails displayOneTask(@PathVariable int taskId )
	
	{
	
 		TaskDetails taskInfoTable;
 		taskInfoTable=servi.showOnlyTaskInfo( taskId);
 		
 		//TaskInfoList tasklist=new TaskInfoList();
 		
 		//tasklist.setTasklist(taskInfoTable);
 		
 	//	.setTasklist(taskInfoPojo2);
 		return taskInfoTable;
 		
				
	//	return new ResponseEntity<TaskInfoPojo>(taskInfoPojo2,HttpStatus.OK);
		
		
			
	}
}