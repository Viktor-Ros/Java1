package HomeWork1;

public class Main {

	public static void main(String[] args) {
		
		SweetBox sweetBox = new SweetBox();
		
		sweetBox.putSweet(new Sweet1("sweet1", 1,1, "color1"));
		sweetBox.putSweet(new Sweet2("sweet2", 2,2, "taste1"));
		sweetBox.putSweet(new Sweet3("sweet3", 3,3, "odor1"));
		
		sweetBox.getBoxParam();
		
		System.out.println("Цена коробки " + sweetBox.getBoxPrice());
		System.out.println("Масса коробки " + sweetBox.getBoxWeight());
		
		sweetBox.dellSweet(2);
		
		sweetBox.getBoxParam();
		
		System.out.println("Цена коробки " + sweetBox.getBoxPrice());
		System.out.println("Масса коробки " + sweetBox.getBoxWeight());
		
		//sweetBox.reduceWeight(5);
		//sweetBox.reducePrice(5);
		
		sweetBox.getBoxParam();

	}
}