package AbstractClassesMethods;

public class Dog extends AbstractFerm {
	String dog = "Пес";
	
	@Override
	public void animal() {
		System.out.println(dog);
	}
}