package Полиморфизм_Перезапись;

/*
 * 
 * ПОЛИМОРФИЗМ
 * ПЕРЕЗАПИСЬ/ПЕРЕОПРЕДЕЛЕНИЕ
 * классы Car, Ford, Ford_plus
 * в ford2 мы перезаписываем метод fordmodel(добавляем plus) из ford, чтобы не изменять его в ford
 * отличается от перегрузки тем, что к методу добавляется новый функционал под наши задачи(добавляем plus)
 * 
 */
public class Car {
	
	static int a = 5;
	static String b = "five";
	public static void main(String[] args) {

	Ford_plus ford2 = new Ford_plus();
	ford2.fordmodel(a);
	ford2.fordmodel(b);
	}
}
