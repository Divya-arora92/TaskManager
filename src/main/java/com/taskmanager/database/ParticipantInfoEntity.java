package com.taskmanager.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="participant_details")

public class ParticipantInfoEntity {
	
	
    
	@Id
		@Column(name="participant_id")
		private int participantId;
		
		public int getParticipantId() {
			return participantId;
		}

		public void setParticipantId(int participantId) {
			this.participantId = participantId;
		}

		public String getParticipantName() {
			return participantName;
		}

		public void setParticipantName(String participantName) {
			this.participantName = participantName;
		}

		@Column(name="participant_name")
		private String participantName;

}
