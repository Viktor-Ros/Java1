package Collections;

import java.util.ArrayList;

/*
*
* ДЖЕНЕРИКИ
* Дженерик - тип данных ArrayList
* Если не указать дженерик, то в ArrayList могут быть данные любых типов
*
*/

public class Generic {

	public static void main(String[] args) {
		
		ArrayList Car = new ArrayList(); //Сырой ArrayList, тк не указан дженерик(прим. int) в <>
		
		Car.add("one");
		Car.add("two");
		Car.add("tree");
		Car.add("tree");
		Car.add("tree");
		Car.add(3);
		Car.add(28);
		
		System.out.println(Car);
		System.out.println("Размер: " + Car.size());
		System.out.println("4 элемент Car: " + Car.get(4));
		
		ArrayList<String> Ferm = new ArrayList<>();//Дженерик <String>
		
		Ferm.add("Cow");
		Ferm.add("Dog");
		Ferm.add("Pig");
		//Ferm.add(4); - нельзя добавить, тк у AL тип String
		System.out.println(Ferm);
		
		
	}

}
