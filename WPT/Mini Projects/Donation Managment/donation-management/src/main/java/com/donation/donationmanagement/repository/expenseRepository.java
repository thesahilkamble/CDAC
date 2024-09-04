package com.donation.donationmanagement.repository;

import com.donation.donationmanagement.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface expenseRepository extends JpaRepository<Expense, Long> {
}
