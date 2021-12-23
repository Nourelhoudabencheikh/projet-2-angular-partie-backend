package com.example.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="expenses")
@Setter
@Getter
public class Expense {
	 
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private long id; 
	 private String expense; 
	 private String description;
	 private BigDecimal amount;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getExpense() {
		return expense;
	}
	public void setExpense(String expense) {
		this.expense = expense;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public Expense() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Expense(String expense, String description, BigDecimal amount) {
		super();
		this.expense = expense;
		this.description = description;
		this.amount = amount;
	}
	 
	 
	 

}
