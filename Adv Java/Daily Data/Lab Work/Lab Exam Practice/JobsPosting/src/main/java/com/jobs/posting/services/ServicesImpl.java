package com.jobs.posting.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jobs.posting.entities.JobPosting;
import com.jobs.posting.exception.JobsException;
import com.jobs.posting.repository.Repository;

@Service
@Transactional
public class ServicesImpl implements Services {

	@Autowired
	private Repository repository;

	@Override
	public List<JobPosting> getAllJobs() {

		return repository.findAll();
	}


	@Override
	public JobPosting getJobById(Long id) {
		
			return repository.findById(id).orElseThrow(() -> new JobsException("Job with " + id + " not Found"));

	}
	
	@Override
	public JobPosting addJob(JobPosting JobPosting) {
	
		return repository.save(JobPosting);
	}

	@Override
	public String updateJob(JobPosting JobPosting, Long id) {
		String flag = "Not Found";
		if(repository.existsById(id)) {
			repository.save(JobPosting);
			flag = "Found";
			return flag;
		}
		return flag;
	}

	@Override
	public String deleteJob(Long id) {
		String flag = "Not Found";
		if(repository.existsById(id)) {
			repository.deleteById(id);;
			flag = "Deleted";
			return flag;
		}
		return flag;
	}


	@Override
	public List<JobPosting> getBySalaryMoreThan(Double salary) {
		// TODO Auto-generated method stub
		return null;
	}

}
