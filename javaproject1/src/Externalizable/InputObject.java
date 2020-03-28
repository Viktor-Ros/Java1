package Externalizable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class InputObject {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
	       FileInputStream fis = new FileInputStream("C:\\Users\\Viktor\\Desktop\\JavaFiles\\ferm1.txt");
	       
	       ObjectInputStream ois = new ObjectInputStream(fis);

	       AnimalFerm cow = (AnimalFerm) ois.readObject();
	       AnimalFerm horse = (AnimalFerm) ois.readObject();
	       AnimalFerm dog = (AnimalFerm) ois.readObject();
	       
	       System.out.println(cow);
	       System.out.println(horse);
	       System.out.println(dog);

	       ois.close();

	}
}