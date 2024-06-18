package com.jobs.posting.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class APIResponse {
	private String message;
	private LocalDateTime datetime;
	
	public APIResponse(String message) {
		this.message=message;
		this.datetime=LocalDateTime.now();
	}

}
