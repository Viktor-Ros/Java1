package OtherTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


/*
 * 
 * Сложение всех предыдущих чисел с последующим  и вывод суммы после слова "сумма"
 * 
 */

public class task1 {
	
static int b;
static int c;

	public static void main(String[] args){
		
		while(true) {

		String a = new Scanner(System.in).next();

			if(a.equals("сумма") == true) {
				System.out.println(c);	
				break;
			}

		int e = Integer.parseInt(a);
		
		b = c + e;
		c = b;
		
		}
	}
}
