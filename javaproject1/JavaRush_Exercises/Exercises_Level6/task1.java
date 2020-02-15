package Exercises_Level6;

import java.io.IOException;
import java.util.Scanner;

/*
 * 
 *Подсчет четных и нечетных цифр в числе 
 * 
 * 
 */

public class task1 {
		   
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {

    	int a = new Scanner(System.in).nextInt();
    	int b = 0;
    	int c = a;
    	int d;


    	while(c!=0){//или String v = Integer.toString(a); b = v.length();
    		c = c/10;
        	b++;
    	}

 	  	
 	  	
    	for(int i = 0; i < b; i++) {
    		d = (int) ((a%Math.pow(10,i+1) - a%Math.pow(10,i))/Math.pow(10,i));
	
        	if(d%2 == 0) {
        		even++;
        	}
        	else odd++;

    	}
    	
    	System.out.println(even);
    	System.out.println(odd);
    }
}