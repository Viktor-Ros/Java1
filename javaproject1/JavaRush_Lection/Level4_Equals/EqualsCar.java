package Level4_Equals;
/*
 * 
 * СРАВНЕНИЕ ОБЪЕКТОВ
 * классы: Car, EqualsCar
 * метод equals по умолчанию сравнивает ссылочные переменные на объекты(Ford и Chevrolet), а не сами объекты
 * в классе Car ма переписываем метод equals так, чтобы он сравнивал объекты по параметрам price и color
 * 
 */
public class EqualsCar {
	
	   int price;
	   String color;

	   public static void main(String[] args) {

	       Car Ford = new Car();
	       Ford.price = 10000;
	       Ford.color = "Red";
	       
	       Car Chevrolet = new Car();
	       Chevrolet.price = 10000;
	       Chevrolet.color = "Red";

	       if(Ford.equals(Chevrolet) == true) {
	       System.out.println("У машин одинаковые цвета и цены");
	       }
	   }
	}
