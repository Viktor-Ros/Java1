package HomeWork1;

public class Main {

	public static void main(String[] args) {
		
		SweetBox sweetBox = new SweetBox();
		
		sweetBox.putSweet(new Сhocolate("Сhocolate", 5.4,10, "white"));
		sweetBox.putSweet(new Сhocolate("Сhocolate", 10.1,3.6, "black"));
		sweetBox.putSweet(new IceCream("Ice cream", 6.7,12, "strawberry"));
		sweetBox.putSweet(new Candy("Candy", 8.5,5.2, "vanilla"));
		
		sweetBox.printBoxParam();
		
		System.out.println("Price box: " + sweetBox.getBoxPrice());
		System.out.println("Weight box: " + sweetBox.getBoxWeight());
		
		sweetBox.delSweet(2);
		
		sweetBox.printBoxParam();
		
		System.out.println("Price box: " + sweetBox.getBoxPrice());
		System.out.println("Weight box: " + sweetBox.getBoxWeight());
		
		//sweetBox.reduceWeight(23.1);
		//sweetBox.reducePrice(17.6);
		//sweetBox.printBoxParam();
	}
}