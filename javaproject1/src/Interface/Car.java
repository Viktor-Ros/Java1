package Iinterface;

public class Car implements InterfaceColor, IinterfacePrice {
	public void color() {
		System.out.println("Color: Red");
	}

	@Override
	public void price() {
		System.out.println("Price: 10 000$");
	}
	
}

