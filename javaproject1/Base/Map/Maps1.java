package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * 
 * MAP
 * 
 * классы: CollectionsMap, CollectionsMap2
 * map - словарь, хранящий связанные значения и ключи, т.е. пару, ключ всегда уникальный
 * HashMap - неупорядоченный словарь
 * TreeMap - упорядоченный словарь, медленнее чем HashMap, хранит данные в форме дерева
 * Отличие HashMap от TreeMap - HashMap работает быстрее TreeMap
 * 
 * 
 */


public class Maps1 {

	public static void main(String[] args) {
		
		
		Map<Integer, String> Ferm1 = new HashMap<>();//HashMap нужен для быстрого поиска 
		       //int - тип ключей, str - тип значений
		
	  Ferm1.put(11,"Cow");
	  Ferm1.put(12,"Pig");
	  Ferm1.put(13,"Pig");
	  Ferm1.put(13,"Dog");//Dog(не Pig) будет под номером 13, тк. ключи уникальны
	  Ferm1.put(14,"Cat");
	 
	System.out.println(Ferm1);
	
	Ferm1.remove(14);
	Ferm1.remove("Сow");//Удаление и получение(get) из HashMap происходит только по ключу, т.е. cow не удалится
	System.out.println(Ferm1);
	System.out.println(Ferm1.get(11));// Вывод значения с ключом 1
	
	
	Set keys = Ferm1.keySet();//Получение ключей и значений отдельными списками
	System.out.println("Ключи " + keys);
	ArrayList<String> values = new ArrayList<>(Ferm1.values());
	System.out.println("Значения " + values);
	
	if (!Ferm1.isEmpty()) { //проверка на наличие элементов в мапе
		System.out.println(Ferm1);//Если элементов нет, то вывода в консоль не будет 
	}
	
	HashMap<Integer, String> Ferm2 = new HashMap<>();
	
	  Ferm2.put(21,"Horse");
	  Ferm2.put(22,"Chiken");
	  Ferm2.put(23,"Pig");
	  Ferm2.put(24,"Pig");
	  Ferm2.put(25,"Pig");
	
	Ferm1.putAll(Ferm2);// Объединение мапов в один(Ferm1), если какие-то ключи равны, то первое значение удалится
	System.out.println(Ferm1);
	
	
	
	
	TreeMap<Integer, String> Ferm3 = new TreeMap<>();//TreeMap - хранит элементы по порядку ключей

	Ferm3.put(11,"Cow");
	Ferm3.put(14,"Pig");
	Ferm3.put(13,"Pig");
	Ferm3.put(12,"Cat");

	System.out.println("Упорядоченный мап " + Ferm3);
		     
	}

}
