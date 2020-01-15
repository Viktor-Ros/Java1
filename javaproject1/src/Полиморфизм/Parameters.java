package Полиморфизм;
/*
*ПОЛИМОРФИЗМ
*классы: class23, car, chevrolet1, chevrolet2
*классы chevrolet1 и chevrolet2 используют интрефейс класса car для создания собственного интерфейса (много программ юзают один интерфейс под свои задачи)
*классы chevrolet1 и chevrolet2 - наследники класса car
*класс class23 создает объекты car1 и car2 типа chevrolet1 и chevrolet2 
*/

public class Parameters {

public static void main (String[] args){
Car car1 = new Chevrolet1();
Car car2 = new Chevrolet2();
System.out.println("Масса Chevrolet 1: " + car1.weight());
System.out.println("Масса Chevrolet 2: " + car2.weight());
}
}