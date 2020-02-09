package Exercises_Level4;

import java.util.Scanner;
/*
 * 
 * ЗАДАЧА ПРО СВЕТОФОР
 * 
 * Работа светофора для пешеходов запрограммирована следующим образом:
 * в начале каждого часа в течение 3 минут горит зелёный сигнал,
 * затем в течение 1 минуты - жёлтый,
 * а потом в течение 1 минуты - красный,
 * затем опять зелёный горит три минуты и т. д.
 * Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
 * Определить, сигнал какого цвета горит для пешеходов в этот момент.
 * 
 */
public class Svetofor {
	
	   public static void main(String[] args) {
	    	
	    	double t = new Scanner(System.in).nextDouble();
	    	int a = (int) t % 60;

	    	 for(int j = 0; j<=60; j = j + 5) {
	    		 	
	    		 if(a<j) {
	    			 
	    			 a = a - j + 5;
	    			  
	    			  if(a>=0 && a<3) {
	    				  System.out.println("зеленый"); 
	    				  break;
	    			  	  }
	    			  if(a==3) {
	        			  System.out.println("желтый"); 
	        			  break;
	        			  }
	    			  if(a==4) {
	        			  System.out.println("красный"); 
	        			  break;
	        			  }	
	    	 break;
	    		}
	    		  
	    	}
	   }
}