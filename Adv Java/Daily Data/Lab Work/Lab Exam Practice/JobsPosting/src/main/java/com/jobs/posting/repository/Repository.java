package com.jobs.posting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobs.posting.entities.JobPosting;

public interface Repository extends JpaRepository<JobPosting,Long> {

	
}
