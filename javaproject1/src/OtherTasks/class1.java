package OtherTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


/*
 * 
 * Сложение всех предыдущих чисел с последующим
 * был нужен для приложеньки
 * 
 */

public class class1 {
	
static int b;
static int c;

	public static void main(String[] args){
		
		while(true) {
		
			int a = new Scanner(System.in).nextInt();
		
		
		b = c + a;
		c = b;
		
		System.out.println(c);
			
}
	
}
}
