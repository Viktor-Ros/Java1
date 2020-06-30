package Interface;

public class Car implements InterfaceTotal {
	
	public void color() {
		System.out.println("Color: Red");
	}

	@Override
	public void price() {
		System.out.println("Price: 10 000$");
	}


	
}

