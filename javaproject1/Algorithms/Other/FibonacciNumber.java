package Other;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * 
 * ЧИСЛА ФИБОНАЧЧИ
 * 
 * каждое следующее число равно сумме двух предыдущих
 * 
 */

public class FibonacciNumber {
	
	  public static void main(String[] args) {

			 System.out.println("Введи номер числа Фибоначчи:");	      

		      int n = new Scanner(System.in).nextInt();
		  
		      BigInteger a= BigInteger.ZERO;
		      BigInteger b = BigInteger.ONE;
		      BigInteger c = BigInteger.ZERO;
		      
		      for(int i = 0; i < n; i++) {			     
		    	 c = a.add(b);
		    	 a = b;
		    	 b = c;   
		    	 if(i % 1000 == 0) {
				      System.out.println(i);
		    	 }
		      }
			
		      System.out.println(n + " число Фибоначчи =  " + c);	      

		      System.out.println("Число знаков в числе: " + String.valueOf(c).length());	      

	}
}