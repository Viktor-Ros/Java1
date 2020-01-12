package javaproject1;

import java.util.Scanner;

public class class14 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int e, g;

System.out.println("Введи e и g");

e = scanner.nextInt();
g = scanner.nextInt();
if(e>g)
	System.out.println("Наибольшее число " + e);
else
	System.out.println("Наибольшее число " + g);
	}
}