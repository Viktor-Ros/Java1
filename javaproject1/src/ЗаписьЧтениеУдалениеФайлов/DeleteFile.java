package ЗаписьЧтениеУдалениеФайлов;

import java.io.File;

/*
 * 
 * УДАЛЕНИЕ ФАЙЛА
 * 
 */

public class DeleteFile {

	public static void main(String[] args) {
		File ferm = new File("C:\\Users\\Viktor\\Desktop\\JavaFiles\\ferm.txt");
		ferm.delete();
	}
}
