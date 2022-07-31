package com.ineuronpatterns;

public class NumPatterns {
	int num = 10;
	
	public String One() {
		int i, j;
		String str = "";
		
		for (i=0; i<num; i++) {
			for (j=0; j<num; j++) {
				if( j == num/2 || i == num-1) {
					//System.out.print("*");
					str = str + "*";
				}
				else if(j==0 && i == 0){
					//System.out.print(" ");
					str = str + "";
				}
				else {
					str = str + " ";
				}
			}
			if(i == num-1) 
			{
				str = str + " ";
			}
			else {
				//System.out.println();
				str = str + "\n";
			}	
		}
		return str;
	}
	
	public String Two() {
		int i,j;
		String str = "";
		for (i=0; i<num; i++) {
			for (j =0; j<num; j++) {
				if(j==0 && i == 0){
					//System.out.print(" ");
					str = str + "";
				}
				else if(( i < num/2 && j == 0) || i+j == num-1 || i == 0 || i == num-1) {
					//System.out.print("*");
					str = str + "*";
				}
				else {
					str = str + " ";
				}
			}
			if(i == num-1) 
			{
				System.out.print(" ");
				str = str + " ";
			}
			else {
				//System.out.println();
				str = str + "\n";
			}	
		}
		return str;
	}
	
	public void Three() {
		
	}
	
	public void Four() {
		
	}
	
	public void Five() {
		
	}
	
	public void Six() {
		
	}
	
	public void Seven() {
		
	}
	
	public void Eight() {
		
	}
	
	public void Nine() {
		
	}
	
	public void Zero() {
		
	}
}
