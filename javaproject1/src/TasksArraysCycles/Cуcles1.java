package ЗадачиМассивыЦиклы;

//*
//* Разные виды циклов
//*

public class Cуcles1 {
	
	public static void main(String[] args) {
		System.out.print("Цикл FOR по возрастанию - ");
		for (int i = 0; i < 11; i = i + 2){
			//for ([инициализация цикла]; [условие выполнения цикла(макс значение)]; [изменение шага цикла])
		if (i<9) 
		    System.out.print(i +" ");
		else
			System.out.println(i);	
		}
		
		System.out.print("Цикл FOR по убыванию - ");
		for (int i = 10; i >= 0; i = i - 2){
			
		if (i > 0)
			System.out.print(i + " ");
		else
			System.out.println(i + " ");
		}	
			
		System.out.print("Цикл WHILE(предусловие) - ");
		int w = 1; 
		while (w <= 11) { // - условие перед циклом
		if (w >= 11)
					System.out.println(w + " ");
		else
					System.out.print(w + " ");
				w = w+2;	// - тело цикла
				}	
					
		System.out.print("Цикл WHILE_DO(постусловие) - ");	
		int d = 1;		
		do {
		if (d >= 11)
					System.out.println(d + " ");
		else
					System.out.print(d + " ");
					d = d + 2;	// - тело цикла
				} 
		while (d <= 11); // - условие после цикла
				
		System.out.print("Цикл с BREAK  - ");
		for (int a = 1; a < 11; a = a + 2){
		if (a > 7)
					// break - выход из цикла до окончания его работы при i > 7
		break;	
		if (a >= 7)
						System.out.println(a +" ");
		else
					System.out.print(a +" ");
				}	
				
		System.out.print("Цикл с CONTINUE - ");
		for (int s = 1; s <= 11; s = s + 2){
		if (s == 7)
						// continue - переход к следующей операции при s = 7(пропуск всех операций при s = 7)
		continue;	
				System.out.print(s +" ");
				}						
	}
}