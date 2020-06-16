package AbstractClassesMethods;

public class Pig extends AbstractFerm {
	String pig = "Хрюша";
	
	@Override
	public void animal() {
		System.out.println(pig);
	}
}