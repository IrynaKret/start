package com.softserveinc.edu.ita;

import java.util.Scanner;

public class Zadacha88a {
	public static void main (String[] args) {
		
		System.out.println("Enter the natural number:");
		  Scanner input = new Scanner(System.in);
		  
		  int n = input.nextInt();
		  int n2 = n * n;
		  String num = String.valueOf(n2);
		  
		  for (int i = 0; i < num.length(); i++){
			  char c = num.charAt(i);        
              if (c == '3') {
            	  System.out.printf("There is digit 3 in the number %d", n2);
            	  break;
              }
              else
            	  System.out.printf("There is not digit 3 in the number %d", n2);
		  }
	}

}
