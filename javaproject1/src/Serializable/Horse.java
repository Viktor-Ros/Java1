package Serializable;

import java.io.Serializable;

public class Horse implements Serializable{
	
	private String name;
	private int weight;
	private int speed;
	
	
	public Horse(String name, int weight, int speed) {
		
		this.name = name;
		this.weight = weight;
		this.speed = speed;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public int getSpeed() {
		return this.weight;
	}
	
	public String toString() {
		return "Имя: " + name + " || " + "Вес: " + weight + " || " + "Скорость: " + speed;
	}
	
}
