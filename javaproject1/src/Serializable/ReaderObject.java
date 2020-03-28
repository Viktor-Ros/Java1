package Serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReaderObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		 FileInputStream fis = new FileInputStream("C:\\Users\\Viktor\\Desktop\\JavaFiles\\ferm.txt");//поток для записи байтов в файл
		 
		 ObjectInputStream ois = new ObjectInputStream(fis);//поток для записи объекта в байты
		 
		 Cow cow = (Cow) ois.readObject();
		 Horse horse = (Horse) ois.readObject();
		 Dog dog = (Dog) ois.readObject();
		 
		 System.out.println(cow);
		 System.out.println(horse);
		 System.out.println(dog);
	}
}