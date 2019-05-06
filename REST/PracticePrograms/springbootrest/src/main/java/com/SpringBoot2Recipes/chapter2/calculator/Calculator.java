package com.SpringBoot2Recipes.chapter2.calculator;

import java.util.Collection;

public class Calculator 
{
	private final Collection<Operation> operations;
	
	public Calculator(Collection<Operation> operations)
	{
		System.out.println("Calculator: constructor method");
		this.operations = operations;
	}
	
	public void calculate(int lhs, int rhs, char op) 
	{
		System.out.println("Calculator: calculate method");
		for (Operation operation : operations) 
		{
			if (operation.handles(op)) 
			{
				int result = operation.apply(lhs, rhs);
				System.out.printf("%d %s %d = %s%n", lhs, op, rhs, result);
				return;
			}
		}
		throw new IllegalArgumentException("Unknown operation " + op);
	}
}
	
