package com.redbee.academy.challenge;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeApplication.class, args);
		
		Integer result_SumTwoNumbers = SumTwoNumbers.sum(100, 420);
		System.out.println("La suma es igual a " + result_SumTwoNumbers);
		
		List<Integer> myArray = new ArrayList<Integer>();
		myArray.add(1);
		myArray.add(2);
		myArray.add(3);
		
		Integer result_SumArrayNumbers = SumArrayNumbers.sum(myArray);
		System.out.println("La suma de los elementos del array es " + result_SumArrayNumbers);
		
		Integer result_CompareNumbers = CompareNumbers.max(50, 100, 200);
		System.out.println("El mayor valor es " +  result_CompareNumbers);
		
		List<Integer> arrayA = new ArrayList<Integer>();
		arrayA.add(1);
		arrayA.add(200);
		arrayA.add(14);
		
		List<Integer> arrayB = new ArrayList<Integer>();
		arrayB.add(10);
		arrayB.add(5);
		arrayB.add(37);
		
		List<Integer> arrayC = CompareArrayNumbers.max(arrayA, arrayB);
		System.out.println("El array resultado es " + arrayC);
		
	}

}
