package Exercises_Level10;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

/*
 * 
 * Ввести с клавиатуры 10 строк
 * Подсчитать в них количество различных букв (для 33 маленьких букв алфавита). 
 * Результат вывести на экран в алфавитном порядке.
 * 
 */

public class task1 {
	
	public static void main(String[] args) {

		List<Character> alp = Arrays.asList(
	    	'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
	        'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
	        'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
	        'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');
	  
		Map<Character, Integer> map = new LinkedHashMap<>();
			
		for(Character element : alp) {
			map.put(element, 0);
		}
			
	    for (int i = 0; i < 2; i++) {
	    	String str = new Scanner(System.in).nextLine();
	            
	    	for(int j = 0; j < str.length(); j++) {
	    		char b = str.charAt(j);			
	    		map.replace(b, map.get(b) + 1);
	    	}	
	    }
			
	    Iterator<Map.Entry<Character, Integer>> iter = map.entrySet().iterator();
	    	
	    while(iter.hasNext()) {
	    	Map.Entry<Character, Integer> it = iter.next();//Объединяет ключ и значения в один класс, чтобы не перебирать их по отдельности
	    	System.out.println(it.getKey() + "  " + it.getValue());
	    }
	}
}