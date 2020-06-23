package AbstractClassesMethods;

public class Pig extends AbstractAnimal {
	String pig = "Хрюша";
	
	@Override
	public void animal() {
		System.out.println(pig);
	}
}