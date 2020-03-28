package Adapter;

public class WolfTransformation {

	public static void main(String[] args) {

		Tiger tiger = new Tiger();
		
		Wolf wolf1 = new Wolf();//Объект класса Wolf
		
		WildAnimal wolf2 = new Adapter(tiger);//Объект класса Wolf, адаптированный под Tiger
		
		System.out.println("wolf1 " + wolf1.noCircus());		
		System.out.println("wolf2 " + wolf2.noCircus());
		
	}

}
