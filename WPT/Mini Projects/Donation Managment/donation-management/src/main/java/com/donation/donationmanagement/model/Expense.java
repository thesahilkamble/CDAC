package com.donation.donationmanagement.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Expense {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String spentOn;
    
    private LocalDate date;
    
    private Double amount;
    
    private String screenshotUrl;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSpentOn() {
		return spentOn;
	}

	public void setSpentOn(String spentOn) {
		this.spentOn = spentOn;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getScreenshotUrl() {
		return screenshotUrl;
	}

	public void setScreenshotUrl(String screenshotUrl) {
		this.screenshotUrl = screenshotUrl;
	}

    // Getters and Setters
    
}
