package Задачи_массивы_циклы;

//*
//* Сортировка элементов массива по модулям
//*

import java.util.Arrays;

public class Arrays3 {


	public static void main(String[] args) {

		Integer [] arra = {4,-5,-1,2,-3};
		Integer [] arr;
		System.out.println("Массив " + Arrays.toString(arra));
		arr = new Integer[arra.length];
			for(int i = 0; i<arra.length; i++) {
				arr[i] = arra[i];
			}
			for(int i = 0; i<arra.length; i++) {
				if(arr[i]<0)
				arr[i] = arr[i]*(-1);
			}		
		Arrays.sort(arr, 0, arr.length);
		for(int i = 0; i<arra.length; i++) {
			for(int a = 0; a<arra.length; a++) {				
				if(arr[i]==arra[a]*(-1)) {
					arr[i] = arra[a];
				}
			}
	}
		System.out.println("Сортированный массив по модулям " + Arrays.toString(arr));	
	}
}