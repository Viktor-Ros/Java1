package Exercises_Level5;

public class CatsFight {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		cat1.age = 12;
		cat1.weight = 12;
		cat1.strength = 2;
		
		Cat cat2 = new Cat();
		cat2.age = 12;	
		cat2.weight = 2;	
		cat2.strength = 12;	
		
		System.out.println(cat1.fight(cat2));
		System.out.println(cat2.fight(cat1));

	}

}