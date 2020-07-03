package HomeWork1;

public class Candy extends Sweets{

	private String name;
	private double weight;
	private double price;
	private String odor;

	public Candy(String name, double weight, double price, String odor) {
		
		this.name = name;
		this.weight = weight;
		this.price = price;
		this.odor = odor;
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
	
	public String getOdor() {
		return odor;
	}
	
	@Override
	public String getUniqueParam() {
		return "odor: " + odor;
	}
}