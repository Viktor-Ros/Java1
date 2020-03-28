package Serializable;

import java.io.Serializable;

public class Dog implements Serializable{
	
	private String name;
	private int weight;
	private String color;
	
	
	public Dog(String name, int weight, String color) {
		
		this.name = name;
		this.weight = weight;
		this.color = color;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String toString() {
		return "Имя: " + name + " || " + "Вес: " + weight + " || " + "Цвет: " + color;
	}
}
