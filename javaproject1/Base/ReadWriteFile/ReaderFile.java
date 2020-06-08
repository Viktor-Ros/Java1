package ReadWriteFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 
 * ЧТЕНИЕ ФАЙЛОВ
 * * FileWriter - конструктор для чтения файла
 * 
 */

public class ReaderFile {

	public static void main(String[] args) throws IOException {
		
		FileReader FermReader = new FileReader("C:\\Users\\Viktor\\Desktop\\JavaFiles\\ferm.txt");
		
		Scanner scan = new Scanner(FermReader);
		
		while (scan.hasNextInt()) {
			int i = scan.nextInt();
            System.out.println(i);
        }

		FermReader.close();
	}
}