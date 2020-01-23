package Коллекции;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 * 
 * LIST
 * list - Неупорядоченный список с возможными дубликатами
 * ArrayList - Массив с динамическим числом элементов
 * LinkedList - Список элементов, где каждый элемент хранит данные и ссылки на следующий и предыдущий элемент
 * Отличие ArrayList от LinkedList, в ArrayList работа происходит с внутреним массивом, в LinkedList с изменением ссылок
 *  
 */

public class CollectionList {

	public static void main(String[] args) {
		
		List Ferm1 = new ArrayList();// ArrayList - Массив с динамическим числом элементов
		
		Ferm1.add("cow");
		Ferm1.add(3);
		Ferm1.add("pig");
		Ferm1.add("cow");
		System.out.println(Ferm1);
		
		LinkedList Ferm2 = new LinkedList(); //LinkedList - Список элементов, у которых кроме данных есть ссылки на соседние элементы
		
		Ferm2.add("cow");
		Ferm2.add(3);
		Ferm2.add("pig");
		Ferm2.add(2,"cow");//добавление cow на 2 позицию в списке
		
		System.out.println(Ferm2);
	}

}