package HomeWork1;

public class Sweet1 extends Sweets{

	private String name;
	private double weight;
	private double price;
	private String color;
	
	public Sweet1(String name, double weight, double price, String color) {
		
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
		return color + " цвет";
	}
}