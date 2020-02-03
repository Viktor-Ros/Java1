package Level4_Operations;

/*
 * 
 * ОПЕРАЦИИ НАД ЧИСЛАМИ
 * постфиксное увеличение(a++) - увеличение, которое происходит на следующей операции с b
 * префиксное увеличение(++a) - увеличение, которое происходит сразу
 * комбинированные операции - операция присваивания и арифметическая операция: +=,-=, %= и тд
 * 
 */

public class Operations {

	public static void main(String[] args) {

		int a = 2;
		int b = 4;
		int c = 6;
		int d = 8;
		d += c;
		
		System.out.println("Остаток от деления 33 на 4: " + 33%4);
		System.out.print("Сравнение a и b: "); 
		System.out.println(a==b);
		System.out.println("Постфиксное увеличение b на 1: " + "b++, b = " + b++ + "; следующий вызов b = " + b);
		System.out.println("Префиксное увеличение a на 1: " + ++a);
		System.out.println("Комбинированная операция d(8) += c(6): " + d);

		
	}
	
}
