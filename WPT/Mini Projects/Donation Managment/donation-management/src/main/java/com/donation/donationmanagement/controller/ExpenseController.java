package com.donation.donationmanagement.controller;

import com.donation.donationmanagement.model.Expense;
import com.donation.donationmanagement.service.ExpenseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {
    
    @Autowired
    private ExpenseService expenseService;
    
    @PostMapping
    public Expense addExpense(@RequestBody Expense expense) {
        return expenseService.saveExpense(expense);
    }
    
    @GetMapping
    public List<Expense> getAllExpenses() {
        return expenseService.getAllExpenses();
    }
    
    @GetMapping("/total")
    public Double getTotalExpenses() {
        return expenseService.getTotalExpenses();
    }
}
