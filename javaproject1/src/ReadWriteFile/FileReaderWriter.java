package ReadWriteFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 
 * ПОТОКИ ВВОДА/ВЫВОДА СИМВОЛОВ
 * 
 * класс: FileReaderWriter, DeliteFile
 * 
 * FileReader/FileWriter - потоки ввода/вывода для работы с символами
 * методы read()/write() могут записывать/считывать данные блоками в виде массива write/read(char[] buff)
 * метод write() может записывать данные в виде части массива: write(char[] buff, int from, int count); - from/count - начало/конец массива
 * 
 */


public class FileReaderWriter {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("C:\\Users\\Viktor\\Desktop\\JavaFiles\\ferm.txt");//чтение из файла ferm.txt
		FileWriter fw = new FileWriter("C:\\Users\\Viktor\\Desktop\\JavaFiles\\ferm1.txt", true);//запись в файл ferm1.txt, true - для записи данных в конец

		while(fr.ready()) {//пока остались непрочитанные символы, ready() возвращает кол-во(int) непрочитанных символов
			int data = fr.read();//чтение очередного символа и преобразование его из char в int
			fw.write(data);//запись очередного символа
		}
		
		fr.close();
		fw.close();
	}

}
