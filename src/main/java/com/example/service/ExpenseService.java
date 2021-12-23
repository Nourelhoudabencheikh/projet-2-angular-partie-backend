package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Expense;
import com.example.repository.ExpenseRepository;

public interface ExpenseService {
	List <Expense> findAll();
	Expense save(Expense expense);
	Expense findById(long id);
	void delete(Long id);


}
