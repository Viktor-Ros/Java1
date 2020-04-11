package Other;

import java.util.Scanner;

/*
 * 
 * АЛГОРИТ ЕВКЛИДА
 * 
 * алгоритм по поиску наибольшего общего делителя, путем вычисления остатка от деления
 * 
 */


public class EvclidAlgoritms {
	
	  public static void main(String[] args) {
		  
		  int a = new Scanner(System.in).nextInt();
		  int b = new Scanner(System.in).nextInt();

		  while(true) {
			  
			  if(a > b) {
				  a = a % b;
			  }
			  else b = b % a;
		  
			  if(a == 0) {
				  System.out.println(b);
				  break;
			  }
		  
			  if(b == 0) {
				  System.out.println(a);
				  break;
			  }  
		  }
	  }
}