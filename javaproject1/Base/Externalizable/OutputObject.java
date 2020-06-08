package Externalizable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import Serializable.Cow;
import Serializable.Horse;

public class OutputObject {

	public static void main(String[] args) throws IOException {
		
	       FileOutputStream fos = new FileOutputStream("C:\\Users\\Viktor\\Desktop\\JavaFiles\\ferm1.txt");
	       
	       ObjectOutputStream oos = new ObjectOutputStream(fos);
	       
	       AnimalFerm cow = new AnimalFerm("Корова", 400, "Коричневый", 5);
	       AnimalFerm horse = new AnimalFerm("Конь", 500, "Белый", 7);
	       AnimalFerm dog = new AnimalFerm("Пес", 60, "Черный", 1);

	       oos.writeObject(cow);
	       oos.writeObject(horse);
	       oos.writeObject(dog);

	       oos.close();
	}

}
