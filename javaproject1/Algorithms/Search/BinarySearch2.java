package Search;

import java.util.ArrayList;

/*
 * 
 * БИНАРНЫЙ ПОИСК C ИНДЕКСОМ
 * 
 */

public class BinarySearch2 {
	
	public static void Search(ArrayList<Integer> list, int num){
		
		int start = 0;
		int end = list.size() - 1;
		int mid;
		
		while(true) {

			mid = (end + start)/2;
			
			if((end + start)%2 != 0 && (end + start) != 1) {
				mid = mid + 1;
			}

			if(num == list.get(mid)) {
				System.out.println(num + " Индекс " + mid);
				break;
			}
			
			if(start == end) {
				System.out.println(num + " Такого элемента нет");
				break;
			}
			
			if(num > list.get(mid)) {
				start = mid;
			}
			else end = mid;	
		}
	}
}