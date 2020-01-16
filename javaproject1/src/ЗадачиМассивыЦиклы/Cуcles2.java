package ЗадачиМассивыЦиклы;

//*
//* Цикл в цикле(результаты таблицы умножения)
//*

public class Cуcles2 {
	public static void main(String[] args) {
		
		for (int i = 1; i < 11; i = i + 1){
			for (int a = 1; a < 11; a = a+1){
				if(a!=10)
					System.out.print(a*i + " ");
				else
					System.out.println(a*i + " ");
				}
	}
	}
}