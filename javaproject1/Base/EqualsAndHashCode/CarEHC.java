package EqualsAndHashCode;


/*
 * 
 * HASHCODE AND EQUALS
 * 
 * классы: Car, CarEHC
 * 
 * HASHCODE
 * 
 * метод HashCode нужен для получения хеш-кода объектов 
 * 
 * Хеширование - преобразование информации в строку определенной длинны
 * Хеш-функция - функция, которая возвращает хэш-код объекта
 * 
 * 
 * EQUALS
 * 
 * метод equals по умолчанию сравнивает ссылочные переменные на объекты(car1 и car2), а не сами объекты
 * в классе Car мы переписываем метод equals так, чтобы он сравнивал объекты по параметрам name и color
 * 
 * 
 * поля, используемые в hashCode должны быть такие же как в equals
 * если два объекта равный по equals, то их хешкоды должны быть одинаковые
 * если хешкоды двух объектов равны, то объекты не обязательно равны по equals
 * если два объекта имеют одинаковые хешкоды, это не значит что они равны(колизия), проверяется с помощью equals
 * 
 */


public class CarEHC {

	public static void main(String[] args) {

		Car car1 = new Car();
		
		car1.color = "red";
		car1.name = "Ford";
				
		Car car2 = new Car();
		
		car2.color = "red";
		car2.name = "Ford";
            
	    int hashCodeCar1 = car1.hashCode();
	    int hashCodeCar2 = car2.hashCode();
	
	    System.out.println("Сравнение по hashCode:");
	    
	    System.out.println("hashCode Car1 = " + hashCodeCar1);
	    System.out.println("hashCode Car2 = " + hashCodeCar2);

	    if(hashCodeCar1 == hashCodeCar2) {
		       
	    	System.out.println("У машин одинаковые цвета и названия");
	    }
	    else System.out.println("Машины разные");
	    
    	System.out.println("-------------------------------------------------------------");
	    
	    System.out.println("Сравнение по equals:");

	    if(car1.equals(car2) == true) {
	    	   
	    	System.out.println("У машин одинаковые цвета и цены");
	    }
	    else System.out.println("Машины отличаются цветом или ценой");
	    
	}
}




