package PolymorphismOverride;

public class Ford_plus extends Ford{
	
	String plus = " plus";
	
	@Override
	public void fordmodel(int n) {
		
		super.fordmodel(n + plus);
	}

	@Override
	public void fordmodel(String n) {
		
		super.fordmodel(n + plus);
	}
	

}
