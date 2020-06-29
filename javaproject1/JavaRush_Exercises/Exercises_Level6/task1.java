package Exercises_Level6;

import java.util.Scanner;

/*
 * 
 * Подсчет четных и нечетных цифр в числе 
 * 
 */

public class task1 {
		   
    public static void main(String[] args){
    	
    	int even = 0, odd = 0;
    	String a = new Scanner(System.in).nextLine();
    	
    	for(int i = 0; i < a.length(); i++) {
    		
    		char b = a.charAt(i);
    		if(b%2 == 0) {
            	even++;
    		} else odd++;
    	}
    	
    	System.out.println("Четные: " + even);
    	System.out.println("Нечетные: " + odd);
    }
}