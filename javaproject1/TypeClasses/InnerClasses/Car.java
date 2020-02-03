package InnerClasses;

public class Car {
	
	public void Type(String s) {
		System.out.println("Type: " + s);
	}
	
	/* 
	 * 
	 * ВЛОЖЕННЫЕ НЕСТАТИЧЕСКИЕ КЛАССЫ
	 * Объекты нестатических классов не могут существовать сами по себе
	 * Нельзя создать экземпляр внутреннего класса без привязки к внешнему классу
	 * Сперва экземпляр внешнего потом внутреннего
	 * Элементы нестатических классов не могут повлиять на код за пределами их внешнего класса
	 * 
	 */
	
	public class Model{
		public void mod(String s) {
			System.out.println("Model: " + s);
		}
	}
		
	public class Color{
		public void col(String s) {
			System.out.println("Color: " + s);
		}	
	}
	
	public class Weight{
		public void wei(int s) {
			System.out.println("Weight: " + s);
		}	
	}
	
	
	/*
	 *  
	 * ВЛОЖЕННЫЕ СТАТИЧЕСКИЕ КЛАССЫ
     * Статический класс имеет доступ только к статическим элементам внешнего класса
     * Элементы статического класса могут существовать без привязки к внешнему классу
     * Элементы статического класса можно использовать за пределами внешнего класса
     * 
	 */
	
	public static class maxSpeed{
		public static void ms(int s) {
			System.out.println("maxSpeed: " + s);
		}	
	}
	
	public static class Price{
		public static void pr(int s) {
			System.out.println("Price: " + s + "$");
		}	
	}	
	
}