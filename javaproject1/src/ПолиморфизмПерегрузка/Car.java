package Полиморфизм_Перегрузка;
/*
 * 
 * ПОЛИМОРФИЗМ
 * ПЕРЕГРУЗКА
 * классы Car, Ford
 * в классе ford мы перегружаем(копируем) метод fordmodel, чтобы он работал с разными типами данных int и String
 * отличается от перезаписи тем, что один метод fordmodel используется с разными параметрами(int и String)
 * 
 */
public class Car {
	
	static int a = 4;
	static String b = "four";
	
	public static void main(String[] args) {
		
		Ford ford = new Ford();
		ford.fordmodel(a);
		ford.fordmodel(b);

}
}