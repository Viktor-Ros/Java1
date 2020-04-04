package Search;


import java.util.ArrayList;


/*
 * 
 * БИНАРНЫЙ ПОИСК БЕЗ ИНДЕКСА
 * 
 * БП делит список на две части, его сложность Big O(Log N)
 * 
 * т.е. если в списке 8 элементов, кол-во операция для поиска нужного элемента(x) = Log2(8);
 * 2^x = 8 = 2^3; x = 3
 * БП нужен для определение существования элемента в списке 
 * 
 */


public class BinarySearch1 {
		
	public static void Searches(ArrayList<Integer> list, int num){
		
		if(list.size() == 1) {
			
			if(list.get(0) == num) {
				System.out.println("Есть!");
			}
			else System.out.println("Нет!");
		}
		
		if(list.size() > 1) {
			
			int a = list.size()/2;
		
			ArrayList<Integer> listSmall = new ArrayList<>();
		
			if(list.get(a) > num) {
				for(int i = 0; i < a; i++) {
					listSmall.add(list.get(i));
				}
				BinarySearch1.Searches(listSmall, num);
			}
		
			if(list.get(a) < num) {
				for(int i = a; i < list.size(); i++) {
					listSmall.add(list.get(i));
				}
				BinarySearch1.Searches(listSmall, num);
			}
		
			if(list.get(a) == num) {
				System.out.println("Есть!");
			}
		}	
	}			
}