
package com.donation.donationmanagement.service;

import com.donation.donationmanagement.model.Donation;
import com.donation.donationmanagement.repository.donationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonationService {
    
    @Autowired
    private donationRepository donationRepository;
    
    public Donation saveDonation(Donation donation) {
        return donationRepository.save(donation);
    }
    
    public List<Donation> getAllDonations() {
        return donationRepository.findAll();
    }
    
    public Double getTotalDonations() {
        return donationRepository.findAll().stream()
                .mapToDouble(Donation::getAmount)
                .sum();
    }
}
