package HomeWork1;

public class Сhocolate extends Sweets{

	private String name;
	private double weight;
	private double price;
	private String color;
	
	public Сhocolate(String name, double weight, double price, String color) {
		
		this.name = name;
		this.weight = weight;
		this.price = price;
		this.color = color;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public double getPrice() {
		return price;
	}
	
	public String getColor() {
		return color;
	}

	@Override
	public String getUniqueParam() {
		return "color: " + color;
	}
}