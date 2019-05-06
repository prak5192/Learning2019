package com.SpringBoot2Recipes.chapter2.calculator;

import java.util.Collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CalculatorApplication 
{
	public static void main(String[] args) {
		System.out.println("CalculatorApplication: main method.");
		ApplicationContext ctx = SpringApplication.run(CalculatorApplication.class, args);
		Calculator calculator = ctx.getBean(Calculator.class);
		calculator.calculate(137, 21, '+');
		calculator.calculate(137, 21, '*');
		//calculator.calculate(137, 21, '-');
	}
	
	@Bean
	public Calculator calculator(Collection<Operation> operations) {
		System.out.println("CalculatorApplication: calculator method.");
		return new Calculator(operations);
	}
}
