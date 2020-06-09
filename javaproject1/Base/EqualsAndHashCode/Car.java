package EqualsAndHashCode;

public class Car {

	String name;
	String color;
	

	@Override
	public int hashCode() {//Переписанный hashCode
			
	   return color.hashCode() + name.hashCode();//Возвращаемое число
	}
	
	@Override
	public boolean equals(Object o) {//Переписанный equals
		
		Car car = (Car) o;
	   
	   return this.name ==  car.name && this.color ==  car.color;//Условие сравнения
	}
}
