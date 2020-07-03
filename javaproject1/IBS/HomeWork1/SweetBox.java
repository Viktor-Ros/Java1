package HomeWork1;

import java.util.ArrayList;

/*
 * 
 * Класс для коробки
 * 
 */

public class SweetBox implements Box{
	
	private ArrayList<Sweets> sweetsBoxArrayList = new ArrayList<>();
	private double weight = 0;
	private double price = 0;
	
	@Override
	public void putSweet(Sweets sweet) {
		sweetsBoxArrayList.add(sweet);
		weight += sweet.getWeight();
		price += sweet.getPrice();
	}

	@Override
	public void delSweet(int index) {
		
		if(index < sweetsBoxArrayList.size()) {
			weight -= sweetsBoxArrayList.get(index).getWeight();
			price -= sweetsBoxArrayList.get(index).getPrice();
			sweetsBoxArrayList.remove(index);
		}
		else System.out.println("Элемент с таким не существует");
	}

	@Override
	public double getBoxWeight() {
		
		return weight;
	}

	@Override
	public double getBoxPrice() {

		return price;
	}

	@Override
	public void printBoxParam() {

		for(Sweets sweet: sweetsBoxArrayList) {
			System.out.println("Name: " + sweet.getName() + " | Weight: " 
		+ sweet.getWeight()+ " | Price: " + sweet.getPrice() +  " | Unique parameter - " + sweet.getUniqueParam());
		}
	}
	
	public void reduceWeight(double weight) {
		
		while(getBoxWeight() > weight) {
			
			double weightMin = sweetsBoxArrayList.get(0).getWeight();
			int index = 0;
			
			for(int i = 0; i < sweetsBoxArrayList.size(); i++) {
				
				Sweets sweet = sweetsBoxArrayList.get(i);
			      if (sweet.getWeight() < weightMin) {
			    	  weightMin = sweet.getWeight();
			    	  index = i;
			      	}	
			}
			delSweet(index);
		}	
	}
	
	public void reducePrice(double price) {
		
		while(getBoxPrice() > price) {
			
			double priceMin = sweetsBoxArrayList.get(0).getPrice();
			int index = 0;
			
			for(int i = 0; i < sweetsBoxArrayList.size(); i++) {
				
				Sweets sweet = sweetsBoxArrayList.get(i);
			      if (sweet.getPrice() < priceMin) {
			    	  priceMin = sweet.getPrice();
			    	  index = i;
			      	}	
			}
			delSweet(index);
		}
	}
}
