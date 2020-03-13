package Polymorphism;

/*
 * 
 * ПОЛИМОРФИЗМ
 * Для изменения существующих классов/объектов под свои нужды
 * Классы: Parametres, Car, Chevrolet1, Chevrolet2, MaxSpeed
 * Классы chevrolet1 и chevrolet2 используют интрефейс класса car для создания собственного интерфейса (много программ юзают один интерфейс под свои задачи)
 * Классы chevrolet1 и chevrolet2 - наследники класса car
 * Класс class23 создает объекты car1 и car2 типа chevrolet1 и chevrolet2
 * Класс MaxSpeed работает напрямую с классом Car, что позвоялет использовать его для все наследников класса Car, а не писать для каждого класса-наследника свой аналог MaxSpeed
 *
 */

public class Parameters {

	public static void main (String[] args){
	
		Car car1 = new Chevrolet1();
		Car car2 = new Chevrolet2();

		MaxSpeed ms = new MaxSpeed();

		System.out.println("Масса Chevrolet 1: " + car1.weight());
		System.out.println("Масса Chevrolet 2: " + car2.weight());
	
		System.out.print("Максимальная скорость Chevrolet 1: ");
		ms.maxSpeed(car1);
		System.out.print("Максимальная скорость Chevrolet 2: ");
		ms.maxSpeed(car2);
	}
}