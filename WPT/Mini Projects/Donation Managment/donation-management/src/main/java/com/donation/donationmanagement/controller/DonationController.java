package com.donation.donationmanagement.controller;

import com.donation.donationmanagement.model.Donation;
import com.donation.donationmanagement.service.DonationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donations")
public class DonationController {
    
    @Autowired
    private DonationService donationService;
    
    @PostMapping
    public Donation addDonation(@RequestBody Donation donation) {
        return donationService.saveDonation(donation);
    }
    
    @GetMapping
    public List<Donation> getAllDonations() {
        return donationService.getAllDonations();
    }
    
    @GetMapping("/total")
    public Double getTotalDonations() {
        return donationService.getTotalDonations();
    }
}
