package HomeWork1;

/*
 * 
 * Интерфейс для коробки
 * 
 */

public interface Box {
	
	public void putSweet(Sweets sweet);
	
	public void dellSweet(int index);

	public double getBoxWeight();
	
	public double getBoxPrice();
	
	public void getBoxParam();

}