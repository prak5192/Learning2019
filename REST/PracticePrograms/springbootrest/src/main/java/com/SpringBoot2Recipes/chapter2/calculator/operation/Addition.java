package com.SpringBoot2Recipes.chapter2.calculator.operation;

import org.springframework.stereotype.Component;

import com.SpringBoot2Recipes.chapter2.calculator.Operation;

@Component
public class Addition implements Operation {

	@Override
	public int apply(int lhs, int rhs) 
	{
		System.out.println("Addition: apply method");
		return lhs + rhs;
	}
	
	@Override
	public boolean handles(char op) 
	{
		System.out.println("Addition: handles method");
		return '+' == op;
	}
}
