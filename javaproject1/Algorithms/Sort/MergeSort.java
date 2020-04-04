package Sort;

import java.util.Arrays;

/*
 * 
 * СОРТИРОВКА СЛИЯНИЕМ
 * 
 * CC делит список на 2 части пока в частях не останется по одному элементу, затем сравнивает их и добавляет в список в порядке возрастания
 * Cложность СС Big O(N * log(N)), массив разбивается на две части каждый раз пока не останется один элемент log(N), и так для всех элементов, которых N 
 * 
 * CC нужна для быстрой сортировки массива 
 * 
 * 1) Массив разбивается на более мелкие массивы
 * 2) Более мелкие массивы опять разабиваются на массивы рекурсией (если нужно)
 * 3) Конечные массивы сортируются
 * 4) Конечные массивы собираются обратно в один массив
 * 
 * 
 */


public class MergeSort {
	
	public static void Sorter(Integer[] array){

		if(array.length > 2) {
			
			Integer[] array1 = new Integer[array.length/2];
			Integer[] array2 = new Integer[array.length - array.length/2];
				
			System.arraycopy(array, 0, array1, 0, array.length / 2);
			System.arraycopy(array, array.length/2, array2, 0, array.length - array.length/2);
			
			MergeSort.Sorter(array1);
			MergeSort.Sorter(array2);
			
			int i = 0;
			int j = 0;
			
			for(int k = 0; k < array.length; k++) {
				
				if(i > array1.length - 1  && j < array2.length) {
					array[k] = array2[j];
					j++;
				}
				
				if(j > array2.length - 1 && i < array1.length) {
					array[k] = array1[i];
					i++;
				}
				
				if(j < array2.length && i < array1.length) {
					
					if(array1[i] >= array2[j]) {
						array[k] = array2[j];
						j++;	
					}
					
					else if(array2[j] >= array1[i]) {
						array[k] = array1[i];
						i++;
					}
				}
			}			
		}
		
		if(array.length == 2) {
			
			int a = array[0];
			int b = array[1];
			
			if(a > b) {
				array[0] = b;
				array[1] = a;
			}
		}	
	}		
}