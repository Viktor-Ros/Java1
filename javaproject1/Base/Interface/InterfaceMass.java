package Interface;

/*
 * 
 * Реализация дефолтного метода в интерфейсе
 * 
 */

public interface InterfaceMass{

	default void mass() {
		System.out.println("Mass: 1500kg");
	}
}