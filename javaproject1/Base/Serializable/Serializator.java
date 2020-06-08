package Serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * 
 * СЕРИАЛИЗАЦИЯ
 * 
 * классы: Serializator, ReaderObject, Cow, Dog, Horse
 * 
 * Сериализация - запись объекта в массив байт
 * 
 * Сериализовать можно только те объекты которые поддерживают интерфейс-маркер Serializable
 * Десериализация - восстановление объекта из массива байт
 * Запись/чтение осуществляются через ObjectOutputStream/ObjectInputStream
 * transient - модификатор поля, при котором оно не учитывается при сериализации
 * 
 * При сериализации объекта сериализуются все объекты, на которые он ссылается в своих переменных экземпляра и классы-родители.
 * 
 * Этапы сериализации:
 * 1) Запись полей класса
 * 2) Запись полей все родителей класса
 * 3) Запись значение полей родителей
 * 4) Запись значение полей класса
 * 
 */

public class Serializator {

	public static void main(String[] args) throws IOException {

		Cow cow = new Cow("Корова", 400, "Коричневый");
		Horse horse = new Horse("Конь", 400, 30);
		Dog dog = new Dog("Пес", 60, "Черный");


		 FileOutputStream fos = new FileOutputStream("C:\\Users\\Viktor\\Desktop\\JavaFiles\\ferm.txt");//поток для записи байтов в файл
		 
		 ObjectOutputStream oos = new ObjectOutputStream(fos);//поток для записи объекта в байты
		 
		 oos.writeObject(cow);
		 oos.writeObject(horse);
		 oos.writeObject(dog);
		 
		 fos.close();
		 oos.close();
		 
		 
	}

}
