package ReadWriteFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/*
*
* СОЗДАНИЕ/ЗАПИСЬ ФАЙЛА
* FileWriter - Конструктор для создания, записи или добавления элементов в файл
*
*/

public class WriteFile {

	public static void main(String[] args) throws IOException {
		
	String [] Animals = {"Cat", "Dog"};	
	Integer [] Number = {0,1,2,3};
		
		FileWriter Ferm = new FileWriter("C:\\Users\\Viktor\\Desktop\\JavaFiles\\ferm.txt", false);//false - данные будут перезаписываться, true - данные добавляются в конец файла
		Ferm.write("Cow");
		Ferm.append("\n");// - следующая запись с новой строки
		Ferm.write("Pig" + '\n' + "Horse" + '\n');
		Ferm.write(Arrays.toString(Animals));
		Ferm.append('\n');
		Ferm.write(Arrays.toString(Number));
		Ferm.append('\n');
        for(int i = 0; i <= 10; i++) {      	 
        	Ferm.write(i+"\n");
        }
        Ferm.close();//закрытие файла, без него файл не запишется
	}
}