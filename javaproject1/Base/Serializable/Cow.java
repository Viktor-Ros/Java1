package Serializable;

import java.io.Serializable;

public class Cow implements Serializable{
	
	private String name;
	private int weight;
	transient private String color;// переменная color не будет сериализованна
	
	public Cow(String name, int weight, String color) {
		
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
