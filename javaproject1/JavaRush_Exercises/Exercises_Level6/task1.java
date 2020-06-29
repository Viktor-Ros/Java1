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
    	String number = new Scanner(System.in).nextLine();
    	
    	for(int i = 0; i < number.length(); i++) {
    		
    		char num = number.charAt(i);
    		
    		if(Character.isDigit(num)){
        		if(num%2 == 0) {
                	even++;
        		} else odd++;
    		}
    	}
    	
    	System.out.println("Четные: " + even);
    	System.out.println("Нечетные: " + odd);
    }
}