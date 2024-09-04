package com.donation.donationmanagement.service;

import com.donation.donationmanagement.model.Expense;
import com.donation.donationmanagement.repository.expenseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    
    @Autowired
    private expenseRepository expenseRepository;
    
    public Expense saveExpense(Expense expense) {
        return expenseRepository.save(expense);
    }
    
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }
    
    public Double getTotalExpenses() {
        return expenseRepository.findAll().stream()
                .mapToDouble(Expense::getAmount)
                .sum();
    }
}
