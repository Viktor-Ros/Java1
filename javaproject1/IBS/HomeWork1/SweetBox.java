package HomeWork1;

import java.util.ArrayList;

/*
 * 
 * Класс для коробки
 * 
 */

public class SweetBox implements Box{

	private ArrayList<Sweets> sweetsBoxArrayList = new ArrayList<>();
	
	@Override
	public void putSweet(Sweets sweet) {
		sweetsBoxArrayList.add(sweet);
	}

	@Override
	public void dellSweet(int index) {
		
		if(index < sweetsBoxArrayList.size()) {
			sweetsBoxArrayList.remove(index);
		}
		else System.out.println("Элемент с таким не существует");
	}

	@Override
	public double getBoxWeight() {
		
		double weight = 0;
		
		for(Sweets sweet: sweetsBoxArrayList) {
			weight += sweet.getWeight();
		}
		return weight;
	}

	@Override
	public double getBoxPrice() {
		
		double price = 0;
		
		for(Sweets sweet: sweetsBoxArrayList) {
			price += sweet.getPrice();
		}
		return price;
	}

	@Override
	public void getBoxParam() {

		for(Sweets sweet: sweetsBoxArrayList) {
			System.out.println("Название: " + sweet.getName() + " | Масса: " 
		+ sweet.getWeight()+ " | Цена: " + sweet.getPrice() +  " | Уникальный параметр: " + sweet.getUniqueParam());
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
			dellSweet(index);
		}	
	}
	
	public void reducePrice(double price) {
		
		while(getBoxPrice() > price) {
			
			double priceMin = sweetsBoxArrayList.get(0).getPrice();
			int index = 0;
			
			for(int i = 0; i < sweetsBoxArrayList.size(); i++) {
				
				Sweets sweet = sweetsBoxArrayList.get(i);
			      if (sweet.getPrice() < priceMin) {
			    	  priceMin = sweet.getPrice
			    			  ();
			    	  index = i;
			      	}	
			}
			dellSweet(index);
		}
	}
}
