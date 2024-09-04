package com.donation.donationmanagement.repository;

import com.donation.donationmanagement.model.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface donationRepository extends JpaRepository<Donation, Long> {
}
