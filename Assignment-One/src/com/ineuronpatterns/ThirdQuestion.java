package com.ineuronpatterns;

/*
 * Prepared by Abinash K. Chaudhary for Ineuron Java Full Stack Course Assignment
 * Assignment 1
 * Solution to Question 3
 * 
 * */

public class ThirdQuestion {
	public static void main(String[] args) {
		int num = 15;
		boolean condition = false;
		for (int i=0; i < num; i++) {
			for (int j=0; j < num; j++) {
				condition = (i == 0 || j == 0 || i == num-1 || j == num -1 || i+j <= 7 || j-i >= 7);
				if (condition == true) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
