package Externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/*
 * 
 * EXTERNALIZABLE
 * 
 * классы: AnimalFerm, InputObject, OutputObject
 * Externalizable - интрфейс для создание собственного механизма сериализации
 * 
 * при реализации Externalizable необходим конструктор по умолчанию
 * в методах writeExternal()/readExternal() важно соблюдать порядок
 * 
 *
 * 
 */


public class AnimalFerm implements Externalizable{

	private String name;
	private int weight;
	private String color;
	private int age;
	
	public AnimalFerm() {

	}
	
	public AnimalFerm(String name, int weight, String color, int age) {
		this.name = name;
		this.weight = weight;
		this.color = color;
		this.age = age;
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {//тут решаем какие поля объекта будем сохранять
		out.writeObject(this.getName());
		out.writeObject(this.getWeight());
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {//тут решаем какие поля объекта будем считывать
		name = (String) in.readObject();
		weight = (int) in.readObject();
	}
	
	public String getName() {
		return name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return "Имя: " + name + " || " + "Вес: " + weight + " || " + "Цвет: " + color + " || " + "Возраст: " + age;
	}
}
