package Interface;

/*
 * 
 * ИНТЕРФЕЙСЫ
 * 
 * Классы: Interface, Car
 * Интерфейсы: InterfaceTotal, InterfacePrice, InterfaceColor, InterfaceMass
 * 
 * Интерфейс описывает совокупность методов(поведение), которыми должен обладать класс
 * Интерфейсы нужны потому что класс не может быть наследником сразу нескольких классов, но может использовать несколько интерфейсов
 * Интерфейс описывает поведение, но не реализует его, поэтому все методы интерфеса пустые
 * Если нужно, чтобы какой-то метод что-то реализовывал, ставим в его сигнатуру default(делаем его дефолтным)
 * Интерфейс отличается от абстрактного класса тем, что класс может быть наследником нескольких интерфейсов
 * Интерфейс отличается от конструктора тем, что конструктор(каркас класса) это метод без типа возвращаемого значения 
 * Интерфейс может наследоваться только от интерфейса(можно несколько)
 * 
 */


public class Interface {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		car.color();
		car.price();
		car.mass();
	}
}