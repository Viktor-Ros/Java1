package Adapter;

/*
 * 
 * АДАПТЕРЫ
 * 
 * классы: Adapter, Wolf, Tiger, WolfTransformation
 * интерфейсы: WildAnimal, CircusAnimal
 * 
 * Адаптер - класс, который реализует совместную работу классов(Wolf, Tiger) с несовместимыми интерфейсами(CircusAnimal, WildAnimal)
 * 
 * 
 */
public class Adapter implements WildAnimal{

	CircusAnimal circusAnimal;
	
	Adapter(CircusAnimal circusAnimal){
		
		this.circusAnimal = circusAnimal;
		
	}

	@Override
	public String noCircus() {
		
		return this.circusAnimal.Circus();//Вызываем метод circus() при вызове метода noCircus()
		
	}

}
