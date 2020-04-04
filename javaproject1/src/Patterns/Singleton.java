package Patterns;

/*
 * 
 * ПАТТЕРН SINGLETON
 * 
 * Паттерн позволяет создавать только один объект класса
 * 
 */


public class Singleton {
	
	private static Singleton singleton;
	
	private Singleton() {
	}
	
	public static Singleton getObject() {
		
		if(singleton == null) {
			singleton = new Singleton();
		}
		
		return singleton;
	}	
}