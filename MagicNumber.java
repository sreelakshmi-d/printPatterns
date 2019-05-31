package com.sri.patterns;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		try {
			System.out.println("Enter input: ");
			int input = sc.nextInt(); 
			int n = input;
			Long start = System.currentTimeMillis();
			int sum = 0;
			while(input>0 || sum > 9){
				if(input == 0){
					input = sum;
					sum = 0;
				}
				sum += input%10;
				input /= 10;
			}
			if(sum == 1){ 
				System.out.println(n+" is Magic Numer");
			} else{
				System.out.println(n+" is NOT a Magic Numer");
			}
			Long endTime = System.currentTimeMillis();
			System.out.println("Start Time: "+start+" "+"\nEnd Time: "+endTime+"\nExecution Time in millis :"+(endTime-start));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
