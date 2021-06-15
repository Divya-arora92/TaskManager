package com.taskmanager.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taskmanager.database.ParticipantInfoEntity;
//import com.taskmanager.database.ProjectInfo;
@Repository
public interface ParticipantRepository extends JpaRepository<ParticipantInfoEntity,Long>  {

}
