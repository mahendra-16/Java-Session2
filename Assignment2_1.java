package session2;

import java.util.Scanner;

public class Assignment2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner age = new Scanner(System.in);
		System.out.print("Please enter your Age : ");
		int Age = age.nextInt();
		// A Person should be 18 years or older to be eligible to vote.		 
		if(Age <= 18){
			System.out.println("You are not eligible to vote!!");
		}else if(Age >= 18){
			System.out.println("You are eligible to vote");
		}
		//System.out.println("You Entered : " + Age);
		
		
	}

}
