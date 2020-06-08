package Encapsulation;

/*
 * 
 * ИНКАПСУЛЯЦИЯ
 * классы: Chevrolet, Car
 * для работы с переменными из другого класса, изменять сами переменные нельзя
 * в классе car есть приватные переменные color и price, которые нужны другим классам, но в этих изменять их нельзя(банковские данные пользователей)
 *
*/

public class Chevrolet {

public static void main (String[] args){

Car car = new Car();

System.out.println("Цвет: " + car.getColor());
System.out.println("Цена: " + car.getPrice());
}
}