package Сonstructor;

//*
//* Конструктор, каркас класса. Содержит необходимые элементы(model, max Speed) для создания объекта(Ford)
//* Без названия аргументов("Ford Mustang", 407) программа выдает ошибку
//* Конструктор, как метод, только без типа возвращаемого значения
//* Название конструктора = названия класса
//* this - слово позволяет использовать переменную(model) именно из конструктора, а не общую переменную класса
//*

public class Сonstructor {

	   String model = "Москвич";
	   int maxSpeed;

	    Сonstructor(String model, int maxSpeed) { // Конструктор
	      this.model = model;
	      this.maxSpeed = maxSpeed; 
	   }
	        
	    Сonstructor(String model) { // Перезаписанный конструктор
	    	this.model = model; // Без слова this вместо SLK будет Москвич
		   }
	    
	    Сonstructor() { // - Дефолтный конструктор, если не знаем параметров model и maxSpeed
	    	System.out.println("model и maxSpeed неизвестны");
		   }

	   public static void main(String[] args) {
		   
		   Сonstructor Ford = new Сonstructor("Ford Mustang", 407);
	       System.out.println("Модель:" + Ford.model + '\n' + "Максимальная скорость:" + Ford.maxSpeed);
	       
	       Сonstructor Mersedes = new Сonstructor("SLK");
	       System.out.println("Модель:" + Mersedes.model);
	   }

}