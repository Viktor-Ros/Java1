package Exceptions;


/*
*
* ИСКЛЮЧЕНИЯ
* Исключения(исключительные ситуации) - ошибки программы, которые решаемы и предсказуемы(try, catch, finnaly)
* Исключения нужны для отслеживания ошибок и бесперебойной работы программы
* Есть два вида исключений: Exception и RunTimeExeption
* Exception - проверяемые исключения - исключения, которые компилятор знает заранее и не компилирует код, без их обраьотки
* RunTimeException - непроверяемые исключения - исключения, которые появляются в работе программы, о них компилятор не знает
* Throw ключевое слово для создания собственных исключений
* Когда в блоке try возникает исключение, остальной код прекращает работу и начинается блок catch
* если исключение не возникает, то catch не исполняется
* Исключения нужно обрабатывать с помощью try/catch или пробрасывать дальше с помощью throws, можно обработать одно, а второе пробросить
* throws деалет так, чтобы тот, кто вызвал метод(след. по стеку), сам реализовывал обработку исключений 
* Исключения бывают: проверяемые(checked) и непроверяемые(unchecked). 
*
*/

import java.util.Scanner;

public class Exceptions {
	
	static void tx (int a, int b) { //метод для собственных исключений
		if (a<b) {//Условие исключения
		throw new NullPointerException("a<b");//NullPointerException - тип исключения, a<b - будет написано(красным) когда выдаст ошибку
      //throw для собственных исключений
		}
	}
	
	public static void main(String[] args) {
		   
		Exceptions tx = new Exceptions();

	
		   System.out.println("Вводи a");
		   int a = new Scanner(System.in).nextInt();
		   System.out.println("Вводи b");
		   int b = new Scanner(System.in).nextInt();	 
			
		   try { // часть кода, где могут быть исключения

				 
				 Exceptions.tx(a,b); // здесь выполянеся исключение, после него программа не работает
	 
				 System.out.println("a / b = " + a/b);	 
		   }
		   
		  catch (ArithmeticException e) { // часть кода, где обрабатывается исключение
			   //ArithmeticException - исключение при делении на ноль
			   System.out.println("На ноль не делят!");
			   System.out.println("Еще раз!");
			   main(args);
			   }
		   
		  catch (NullPointerException e) { //исключение из метода xt
			   System.out.println("A больше B!");
			   System.out.println("Еще раз!");
			   main(args);
		  }
		   
		   catch (Exception e) { // Exception - общее исключение
			   System.out.println("Еще раз!");
			   main(args);
		  }
		   
		   finally { //Необязательный блок кода, который выполянется в любом случае
			   System.out.println("finally!");
			   
		   }

	   }  
}	