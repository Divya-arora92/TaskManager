package com.taskmanager.pojo;
import java.util.List;

import com.taskmanager.database.TaskDetails;

public class TaskInfoList {
	
	private List<TaskDetails> tasklist;
	
	public TaskInfoList()
	{
		
	}

	public List<TaskDetails> getTasklist() {
		return tasklist;
	}

	public void setTasklist(List<TaskDetails> taskInfoPojo2) {
		this.tasklist = taskInfoPojo2;
	}

	

}
