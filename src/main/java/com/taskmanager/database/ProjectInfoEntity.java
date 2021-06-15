package com.taskmanager.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="project_details")



public class ProjectInfoEntity {
	
	
		
	/*@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;*/
			
	@Id		
	@Column(name="project_id")
			private int projectId;
			
			@Column(name="project_name")
	        private String projectName;

			public int getProjectId() {
				return projectId;
			}

			public void setProjectId(int projectId) {
				this.projectId = projectId;
			}

			public String getProjectName() {
				return projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}
			
	
	      

			
			

			

	}


