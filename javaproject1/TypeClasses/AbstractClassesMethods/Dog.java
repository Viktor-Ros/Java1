package AbstractClassesMethods;

public class Dog extends AbstractAnimal {
	String dog = "Пес";
	
	@Override
	public void animal() {
		System.out.println(dog);
	}
}