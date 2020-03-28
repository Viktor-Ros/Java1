package InputOutPutStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 * ПОТОКИ ВВОДА/ВЫВОДА БАЙТОВ
 * 
 * класс: InputOutPutStream
 * 
 * InputStream/OutputStream - потоки ввода/вывода для работы с байтами(byte)
 * методы read()/write() могут записывать/считывать данные блоками в виде массива write/read(byte[] buff)
 * метод write() может записывать данные в виде части массива: write(byte[] buff, int from, int count); - from/count - начало/конец массива
 * 
 */


public class InputOutPutStream {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Viktor\\Desktop\\JavaFiles\\ferm.txt"); //чтение из файла ferm.txt

		while (fis.available() > 0) //пока остались непрочитанные байты, available() возвращает кол-во(int) непрочитанных байтов
			 {
			  int data = fis.read(); //прочитать очередной байт(кол-во прочитанных байтов будет равно кол-ву вызовов fis.read()), можно читать блоками в виде массива
			  System.out.println(data);
			 }
			fis.close(); // закрываем поток			
			 
			 File file = new File("C:\\Users\\Viktor\\Desktop\\JavaFiles\\ferm1.txt");// создаем файл file с адресом, если такого файла нет, программа создаст его
			 
			 FileOutputStream  fos  = new FileOutputStream(file, true); //запись в file, true - для записи данных в конец
			 
			 fos.write((Integer.toString(51) + "\n").getBytes());	// записать байт, конструкция с "\n" для записи с новой строки
			 fos.write((Integer.toString(52) + "\n").getBytes());
			 fos.write((Integer.toString(53) + "\n").getBytes());
			 fos.write(54);

			 
			 fos.flush();// записать все данные на диск сейчас, а не когда они заполнят буфер
			 
			 fos.close(); // закрываем поток
	}

}
