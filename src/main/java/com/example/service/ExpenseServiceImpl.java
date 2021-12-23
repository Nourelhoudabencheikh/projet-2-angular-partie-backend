package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Expense;
import com.example.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {
	
	@Autowired
	ExpenseRepository expenseRepository;

	@Override
	public List<Expense> findAll() {
		// TODO Auto-generated method stub
		return expenseRepository.findAll();
	}

	@Override
	public Expense save(Expense expense) {
		// TODO Auto-generated method stub
		 expenseRepository.save(expense);
		 return expense;
		 
	}

	@Override
	public Expense findById(long id) {
		// TODO Auto-generated method stub
		if(expenseRepository.findById(id).isPresent()) {
			return expenseRepository.findById(id).get();
		}
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		Expense expense=findById(id);
		expenseRepository.delete(expense);
		
	}

}
