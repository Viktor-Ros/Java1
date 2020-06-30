package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

/*
 * 
 * LIST
 * list - Неупорядоченный список с возможными дубликатами
 * ArrayList - Массив с динамическим числом элементов
 * LinkedList - Список элементов, где каждый элемент хранит данные и ссылки на следующий и предыдущий элемент
 * Отличие ArrayList от LinkedList, в ArrayList работа происходит с внутреним массивом, в LinkedList с изменением ссылок
 * 
 * 							Операция:		ArrayList:		LinkedList:
 * Взятие элемента			get				Быстро			Медленно
 * Присваивание элемента	set				Быстро			Медленно
 * Добавление элемента		add				Быстро			Быстро
 * Вставка элемента			add(i, value)	Медленно		Быстро
 * Удаление элемента		remove			Медленно		Быстро
 * 
 * size - число элементов, а не размер, размер у массивов
 * Нельзя проводить одновременно перебирать список и изменять его элементы
 * 
 * ЕСЛИ НУЖНО ВСТАВЛЯТЬ/УДАЛЯТЬ ЭЛЕМЕНТЫ ИЗ СЕРЕДИНЫ - ИСПОЛЬЗУЕМ LinkedList, в остальных случаях - ArrayList
 *  
 */

public class CollectionList {

	public static void main(String[] args) {
		
		String [] FermArray = {"cow", "pig", "chiken" , "dog", "cat"};
		
		List Ferm1 = new ArrayList();// ArrayList - Массив с динамическим числом элементов
		
		Ferm1.add("cow");
		Ferm1.add("pig");
		Ferm1.add("cow");
		Ferm1.clear();
		System.out.println(Ferm1);

		Ferm1.remove("pig");// удаление элемента "pig", можно удалять по индексу
		Ferm1.indexOf("pig");// Поиск индекса элемента
		Ferm1.contains("cow"); //Проверка существования элемента (true/false)
		ArrayList<String> FermList = new ArrayList<String>(Arrays.asList(FermArray));//Преобразование массива в список
		
		LinkedList Ferm2 = new LinkedList(); //LinkedList - Список элементов, у которых кроме данных есть ссылки на соседние элементы
		
		Ferm2.add("cow");
		Ferm2.add(3);
		Ferm2.add("pig");
		Ferm2.add(2,"cow");//добавление cow на 2 позицию в списке
		
		System.out.println(Ferm2);		
	}
}