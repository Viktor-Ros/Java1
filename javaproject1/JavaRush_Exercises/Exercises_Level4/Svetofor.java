package Exercises_Level4;

import java.util.Scanner;

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