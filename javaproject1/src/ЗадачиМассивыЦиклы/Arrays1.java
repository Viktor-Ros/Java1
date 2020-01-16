package ЗадачиМассивыЦиклы;

/*
 * 
 * Разные операции с рукописным массивом
 * Классы: Array1, Enter
 * 
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Arrays1 {
	public static void main(String[] args) {
		Enter ent = new Enter();
		ent.enter1();
		Integer[] arrayone = {ent.a, ent.b, ent.c, ent.d};
		System.out.println("Массив " + Arrays.toString(arrayone));
		
		Arrays.sort(arrayone, 0, 4);
		System.out.println("Массив по возрастанию " + Arrays.toString(arrayone));
		
		Arrays.sort(arrayone, Collections.reverseOrder());
		System.out.println("Массив по убыванию " + Arrays.toString(arrayone));
		
		System.out.println("Длинна массива " + arrayone.length);
		
		int sum = 0;
		for( int num : arrayone) {
	       sum = sum+num;
	      }
	      System.out.println("Сумма элементов массива " + sum);
	      
		int mult = 1;
			for( int num : arrayone) {
				mult = mult*num;
		      }
		      System.out.println("Произведение элементов массива " + mult);
	      
	      System.out.println("Среднее значение элементов  массива " + sum/arrayone.length);
	      
	    Integer max = arrayone[0];
	      for (int i = 0; i < arrayone.length; i++) {
	      if (arrayone[i] > max) {
              max = arrayone[i];
	      	}
	      }
	      
	      System.out.println("Самый большой элемент массива " + max);
	      
	    Integer min = arrayone[0];
	      for (int i = 0; i < arrayone.length; i++) {
	      if (arrayone[i] < min) {
	    	  min = arrayone[i];
	      	}
	      }
	      
	      System.out.println("Самый маленький элемент массива " + min);
	      
	      for (int i = 0; i < arrayone.length; i++) {
	      if (arrayone[i]%2==0) {
	      System.out.println("Четный элемент массива " + arrayone[i]);
	}
}
	      for (int i = 0; i < arrayone.length; i++) {
	      if (arrayone[i]%2-1==0) {
	      System.out.println("Нечетный элемент массива " + arrayone[i]);
	}
}	      
	      
	}
}
