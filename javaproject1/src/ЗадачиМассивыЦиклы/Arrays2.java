package Задачи_массивы_циклы;

//*
//* Разные операции с массивами
//*

import java.util.Arrays;
import java.util.Collections;

public class Arrays2 {

	public static void main(String[] args) {
	
		Integer [] arr = {8,4,15,16,42,54,23};	//создали массив arr из 7 элементов 
		int c = 0;
		int d = 1;
		int e = 0;
		int g = 0;
	 	int h = 5;
	 	int u = 0;
						
		//*
		//Вывод массива arr
		//*
		
		System.out.println("Массив " + Arrays.toString(arr));
		
		 //*
		 //Сумма/произведение элементов массива arr
		 //*
		 
		 for (int i = 0; i < arr.length; ++i) {		
				c = c + arr[i];
				d = d * arr[i];
			}
		 System.out.println("Сумма элементов массива " + c);
		 System.out.println("Произведение элементов массива " + d);
		
		 //*
		 //Длинна массива arr
		 //*
		 
		System.out.println("Длинна массива " +arr.length);	
		
		//*
		 //Четный/нечетный элемент массива arr
		 //*
		
		 for (int i = 0; i < arr.length; i++) {
		      if (arr[i]%2==0) {	  
		      System.out.println(arr[i] + " Четный элемент массива");}
		      else  
		    	  System.out.println(arr[i] + " Нечетный элемент массива"); 
		      }		
		 
         //*
		 //Сумма e/кол-во g четных элементов массива arr
		 //*
		 
		 for (int i = 0; i < arr.length; i++) {
		      if (arr[i]%2==0) {
		    	  e = e + arr[i];
		    	  g = g + 1;
		      }
		 }
		 System.out.println("Сумма четных элементов массива " + e); 
		 System.out.println("Кол-во четных элементов " + g);
		 
		 //*
		 //Массив ar из четных элементов массива arr
		 //*
		 
		 Integer [] ar;
		 ar = new Integer[g]; 
   	     g=0;
  	for (int i = 0; i < arr.length; i++) {
	      if (arr[i]%2==0) {
	    	  ar[g] = arr[i];
	    	  g++; 	 
	      }
	 }		 		 
		 System.out.println("Массив из четных элементов " + Arrays.toString(ar));
		 
		//*
		//Самый большой/маленький элемент масива
		//*
		 
		 for (int i = 0; i < arr.length; i++) {
			 			 
		      if (u<arr[i]) {
		    	  u = arr[i];
		      }
		 }  
		 System.out.println("Самый большой элемент массива " + u);
		 
		 for (int i = 0; i < arr.length; i++) {
		      if (h>arr[i]) {
		    	  h = arr[i];
		      }
		 }  
		 
		 System.out.println("Самый маленький элемент массива " + h);	
		 
		 //*
		 // Массив по возрастанию/убыванию
		 //*
		 
		    Arrays.sort(arr, 0, arr.length);
			System.out.println("Массив по возрастанию " + Arrays.toString(arr));
	
			Arrays.sort(arr, Collections.reverseOrder());
			System.out.println("Массив по убыванию " + Arrays.toString(arr));
		  }		 
}