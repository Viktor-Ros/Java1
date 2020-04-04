package PolymorphismOverload;

public class Ford {

	public void fordmodel(int s) {
		System.out.println("Ford " + s);
	}
	public void fordmodel(String s) {
		System.out.println("Ford " + s);
	}
	
	public void fordmodel(String...car) {//String...s указывается тогда, когда мы не знаем, сколько строк будет у метода
		for (String s: car) {
			
			System.out.println("Ford " + s);	
		}

	}
	
}
