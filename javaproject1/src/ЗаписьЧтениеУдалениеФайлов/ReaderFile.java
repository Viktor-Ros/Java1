package ��������������������������;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 
 * ������ �����
 * FileWriter - ����������� ��� ������ �����,
 * 
 */

public class ReaderFile {

	public static void main(String[] args) throws IOException {
		
		FileReader FermReader = new FileReader("C:\\Users\\Viktor\\Desktop\\JavaFiles\\ferm.txt");
		
		Scanner scan = new Scanner(FermReader);
		
		while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }

		FermReader.close();
	}
}