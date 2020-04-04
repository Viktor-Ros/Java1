package Sort;

import java.util.ArrayList;

/*
 * 
 * БЫСТРАЯ СОРТИРОВКА
 * 
 * Cложность БС Big O(N * log(N))
 * 
 * 1) Список разбивается на три списка:
 *  - 1 список - числа меньшее чем пивот(любое число из списка, от которого будем отталкиваться)
 *  - 2 список - числа равные пивоту
 *  - 3 список - числа больше пивота
 *  2) К спискам 1 и 2 также может применятся рекурсия
 *  3) Списки 1, 2, 3 соединяются в один список
 * 
 */

public class QuickSort {
	
	public static void Sorter(ArrayList<Integer> list){
			
		if(list.size() > 1) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();

		int a = list.get((int) Math.random()*list.size());//пивот
		//int a = list.get(0);

		for(int k = 0; k < list.size(); k++) {
			
			if(list.get(k) > a) {
				list3.add(list.get(k));
			}
		
			if(list.get(k) == a) {
				list2.add(list.get(k));

			}
			
			if(list.get(k) < a) {
				list1.add(list.get(k));
			}
		}
		
		QuickSort.Sorter(list1);
		QuickSort.Sorter(list3);
		
		list.clear();
		
		list.addAll(list1);
		list.addAll(list2);
		list.addAll(list3);

		}
	}		
}