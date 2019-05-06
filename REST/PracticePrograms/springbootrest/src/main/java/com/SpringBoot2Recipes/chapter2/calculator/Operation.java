package com.SpringBoot2Recipes.chapter2.calculator;

public interface Operation 
{
	int apply(int lhs, int rhs);
	boolean handles(char op);
}
