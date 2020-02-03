package Level4_Equals;

public class Car {

	int price;
	String color;

	   public boolean equals(Car car) {										//Переписанный equals
	       return this.price ==  car.price && this.color ==  car.color;		//Условие сравнения
	   }

	
}
