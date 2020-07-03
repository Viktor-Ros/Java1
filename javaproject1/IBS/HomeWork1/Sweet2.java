package HomeWork1;

public class Sweet2 extends Sweets{

	private String name;
	private double weight;
	private double price;
	private String taste;
	
	public Sweet2(String name, double weight, double price, String taste) {
		
		this.name = name;
		this.weight = weight;
		this.price = price;
		this.taste = taste;
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
	
	public String getTaste() {
		return taste;
	}
	
	@Override
	public String getUniqueParam() {
		return taste + " вкус";
	}
}