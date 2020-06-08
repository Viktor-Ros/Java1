package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
*
* SET
* set - множество элементов без дубликатов
* HashSet - Неупорядоченное множество без дубликатов, нужен для быстрого поиска элементов, присваивает каждому элементу индекс
* TreeSet - Упорядоченное множество без дубликатов, медленнее чем HashSet, хранит данные в форме дерева
* Отличие HashSet от TreeSet - HashSet работает быстрее
*
*/

public class CollectionSet {

	public static void main(String[] args) {
		
		HashSet<String> Ferm1 = new HashSet<>();// HashSet нужен для быстрого поиска элемента в коллекции
		
		Ferm1.add("cow");
		Ferm1.add("3er");
		Ferm1.add("pig");
		Ferm1.add("cow");
		Ferm1.add("27g");
		
		System.out.println("HashSet " + Ferm1);
		
		TreeSet<String> Ferm2 = new TreeSet<>(); //TreeSet - хранит элементы по порядку, но медленнее чем HashSet
		Ferm2.add("cow");
		Ferm2.add("3er");
		Ferm2.add("pig");
		Ferm2.add("cow");
		Ferm2.add("27g");
		
		System.out.println("TreeSet " + Ferm2); 

	}

}