package JavaCore_Level8_WrapperClass;

/*
 * 
 * КЛАСС - ОБЕРТКА
 * 
 * классы: WrapperClass, Ford, FordWrapper
 * 
 * класс FordWrapper - обертка класса Ford, которая расширяет метод getName()
 * Классы - обертка нужны для расширения функционала внутреннего класса
 * Класс Integer - обертка для int, у Integer более широкий функционал(прим: перевод текста в числа), но Integer работает дольше int
 * 
 */

public class WrapperClass {

	public static void main(String[] args) {
		
		Ford ford  = new Ford();
		
		FordWrapper fordWrap = new FordWrapper(ford);
		
		System.out.println("Метод getName() класса Ford без обертки: " + ford.getName());
		
		System.out.println("Метод getName() класса Ford c оберткой: " + fordWrap.getName());
		
	}
}
