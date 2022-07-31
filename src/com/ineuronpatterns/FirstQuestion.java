package com.ineuronpatterns;
/*
 * Prepared by Abinash K. Chaudhary for Ineuron Java Full Stack Course Assignment
 * Assignment 1
 * Solution to Question 1
 * */
public class FirstQuestion {
	public static void main(String[] args) {
		
		int i,j;
		
		int num = 10;
		
		int spaceSize = 2; //to change the space between the characters
		boolean Ipattern, Npattern, Epattern, Upattern, Rpattern, Opattern;
		
		for (i=0; i < num; i++) {
			// Pattern for I
			for (j=0; j<num; j++) {
				Ipattern = (i == 0 || i == num-1 || j == num/2 );
				
				if (Ipattern == true){
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			//space
			for (j=0; j < spaceSize; j++) {
				System.out.print(" ");
			}
			// Pattern for N
			for (j=0; j<num; j++) {
				Npattern = ( j == 0 || j == num-1 || i==j );
				
				if (Npattern == true){
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}	
			//space
			for (j=0; j < spaceSize; j++) {
				System.out.print(" ");
			}
			// Pattern for E
			for (j=0; j<num; j++) {
				Epattern = ( i == 0 || i == num-1 || j==0 || (i == num/2 && j <= num/2) );
				
				if (Epattern == true){
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}	
			//space
			for (j=0; j < spaceSize; j++) {
				System.out.print(" ");
			}
			// Pattern for U
			for (j=0; j<num; j++) {
				Upattern = (i == num-1 || j==0 || j == num-1 );
				
				if (Upattern == true){
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}		
			//space
			for (j=0; j < spaceSize; j++) {
				System.out.print(" ");
			}
			// Pattern for R
			for (j=0; j<num; j++) {
				Rpattern = (i==0 || j==0 || i == num/2 || (i <= num/2 && j == num-1) || ( i >= num/2 && i-j == 0));
				
				if (Rpattern == true){
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}	
			//space
			for (j=0; j < spaceSize; j++) {
				System.out.print(" ");
			}
			// Pattern for O
			for (j=0; j<num; j++) {
				Opattern = (i==0 || j==0 || i == num-1 || j == num-1);
				
				if (Opattern == true){
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}	
			//space
			for (j=0; j < spaceSize; j++) {
				System.out.print(" ");
			}
			// Pattern for N
			for (j=0; j<num; j++) {
				Npattern = ( j == 0 || j == num-1 || i==j );
				
				if (Npattern == true){
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}	
			System.out.println();
		}
	}
}
