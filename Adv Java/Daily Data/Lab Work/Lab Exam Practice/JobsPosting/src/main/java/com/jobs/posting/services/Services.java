package com.jobs.posting.services;

import java.util.List;

import com.jobs.posting.entities.JobPosting;

public interface Services {

	List<JobPosting> getAllJobs();
	JobPosting getJobById(Long id);
	JobPosting addJob(JobPosting JobPosting);
	String updateJob(JobPosting JobPosting, Long id);
	String deleteJob(Long id);
	List<JobPosting> getBySalaryMoreThan(Double salary);
}
