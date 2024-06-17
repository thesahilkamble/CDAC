package com.jobs.posting.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class JobPosting {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 30)
	private String jobTitle;
	@Column(length = 30)
	private String companyName;
	@Column(length = 30)
	private String location;
	@Column(length = 30)
	private String description;
	@Column(length = 30)
	private String requirments;
	@Column
	private double salary;
	@Column
	private LocalDateTime postingDate= LocalDateTime.now();
	
}