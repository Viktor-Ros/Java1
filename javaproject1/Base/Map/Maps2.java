package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Maps2 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> ferm1 = new HashMap<>();
	       
	
			ferm1.put(11,"Cow");
			ferm1.put(12,"Pig");
			ferm1.put(13,"Pig");
			ferm1.put(13,"Dog");
			ferm1.put(14,"Cat");
			ferm1.putIfAbsent(15, "Horse");//Добавления нового элемента, при условии что такого элемента нет
			ferm1.putIfAbsent(12,"Pig");
			
			
			
	    	Iterator<Map.Entry<Integer, String>> iter = ferm1.entrySet().iterator();//Итератор
	    	
	    	while(iter.hasNext()) {
	    		Map.Entry<Integer, String> it = iter.next();//Объединяет ключ и значения в один класс, чтобы не перебирать их по отдельности
	    		System.out.println("Ключ: " + it.getKey() + " Значение: " + it.getValue());
	    	}
	    	
	    	System.out.println("Проверка ключа 10 на наличие: " + ferm1.containsKey(10));//Проверка ключа на наличие
	    	System.out.println("Проверка значения Cat на наличие: " + ferm1.containsValue("Cat"));//Проверка значения на наличие
	    	
	    	System.out.println("Поиск элемента по ключу 14: " + ferm1.get(14));//Поиск элемента по ключу
	    	
	    	ferm1.remove(13);//Удаление элемента по ключу
	    	ferm1.remove(11,"Cow");//Удаление элемента по значению
	    	
	    	Iterator<Map.Entry<Integer, String>> iter1 = ferm1.entrySet().iterator();
	    	
	    	while(iter1.hasNext()) {
	    		Map.Entry<Integer, String> it1 = iter1.next();
	    		System.out.println("Ключ: " + it1.getKey() + " Значение: " + it1.getValue());
	    	}
	    	
	    	ferm1.clear();//Отчистка коллекции
	    	System.out.println("Отсутствие элементов: " + ferm1.isEmpty());//Проверка на пустоту     
	}
}
