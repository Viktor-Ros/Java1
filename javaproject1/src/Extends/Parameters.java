package Extends;

/*
 *
 * НАСЛЕДОВАНИЕ
 * классы: Parameters, Car, Shevrolet
 * для использование методов и переменных другого класса в своей программе
 * класс shevrolet -  наследник(extends) класса car
 * в классе car нет данных из класса shevrolet
 * цикличного наследования нет(car => chevrolet => nasledovanie =>car - нельзя)
 * instanceof проверяет, является ли класс наследником другого класса, часто используется при переопределении equals, чтобы убедиться, что объект - строка
 *
 */

public class Parameters{

public static void main (String[] args){
	
Chevrolet chevrolet = new Chevrolet();

System.out.println("Скорость: " + chevrolet.speed);//дергаем переменную из car
System.out.println("Масса: " + chevrolet.weight());//дергаем метод из car
System.out.println("Кузов: " + chevrolet.types());//дергаем метод из car
System.out.println("Марка: " + chevrolet.model);//местная переменная из chevrolet
System.out.print("chevrolet наследник Car: ");
System.out.println(chevrolet instanceof Car);//instanceof проверяет, является ли chevrolet наследником Car
}
}