package com.jobs.posting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jobs.posting.entities.JobPosting;
import com.jobs.posting.services.Services;

@RestController
@RequestMapping("/jobs")
public class JobsController {

	@Autowired
	private Services services;

	@GetMapping
	public ResponseEntity<?> getAllJobs() {
		return ResponseEntity.status(HttpStatus.OK).body(services.getAllJobs());

	}

	@GetMapping("{id}")
	public ResponseEntity<?> getJobById(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(services.getJobById(id));
	}

	@PostMapping
	public ResponseEntity<?> addJob(@RequestBody JobPosting jobPosting) {

		return ResponseEntity.status(HttpStatus.CREATED).body(services.addJob(jobPosting));

	}

	@PutMapping("/{id}")
	public ResponseEntity<?> updateJob(@PathVariable Long id, @RequestBody  JobPosting jobPosting) {

		return ResponseEntity.status(HttpStatus.OK).body(services.updateJob(jobPosting, id));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteJob(@PathVariable Long id) {

		return ResponseEntity.status(HttpStatus.OK).body(services.deleteJob(id));
	}
}
