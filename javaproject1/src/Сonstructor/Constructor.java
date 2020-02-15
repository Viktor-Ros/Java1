package Сonstructor;


//*
//* КОНСТРУКТОР
//* классы: Car, Constructor
//* Конструктор, каркас класса. Содержит необходимые элементы(model, max Speed) для создания объекта(Ford, Mersedes)
//* Без названия аргументов("Ford Mustang", 407) программа выдает ошибку
//* Конструктор, как метод, только без типа возвращаемого значения
//* Название конструктора = названия класса
//* this - слово позволяет использовать переменную(model) именно из аргументов конструктора, а не общую переменную класса
//*

public class Constructor {

	   String model = "Москвич";
	   int maxSpeed;

	   public Constructor(String model, int maxSpeed) { // Конструктор
	      this.model = model;
	      this.maxSpeed = maxSpeed;
	   }
	        
	    Constructor(String model) { // Перезаписанный конструктор
	    	this.model = model; // Без слова this в классе Car вместо SLK будет Москвич
		   }
	    
	    Constructor() { // - Дефолтный конструктор, если не знаем параметров model и maxSpeed
	    	System.out.println("model и maxSpeed неизвестны");
		   }
	    
	   public static void main(String[] args) {
			   
			   Constructor Ford = new Constructor("Ford Mustang", 407);
		       System.out.println("Модель:" + Ford.model + '\n' + "Максимальная скорость:" + Ford.maxSpeed);
		       
			   Constructor Ford1 = new Constructor("Ford Mustang", 407);
		       System.out.println("Модель:" + Ford.model + '\n' + "Максимальная скорость:" + Ford.maxSpeed);
		       
		       Constructor Mersedes = new Constructor("SLK");
		       System.out.println("Модель:" + Mersedes.model);
		       
		       Constructor Chevrolet = new Constructor();
		   }
}