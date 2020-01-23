package RecordReadingDeletionFiles;
package ��������������������������;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/*
 * 
 * ��������/������ �����
 * FileWriter - ����������� ��� ��������, ������ ��� ���������� ��������� � ����
 * 
 */

public class WriteFile {

	public static void main(String[] args) throws IOException {
		
	String [] Animals = {"Cat", "Dog"};	
	Integer [] Number = {0,1,2,3};
		
		FileWriter Ferm = new FileWriter("C:\\Users\\Viktor\\Desktop\\JavaFiles\\ferm.txt", false);//false - ������ ����� ����������������, true - ������ ����������� � ����� �����
		Ferm.write("Cow");
		Ferm.append("\n");// - ��������� ������ � ����� ������
		Ferm.write("Pig" + '\n' + "Horse" + '\n');
		Ferm.write(Arrays.toString(Animals));
		Ferm.append('\n');
		Ferm.write(Arrays.toString(Number));
		Ferm.append('\n');
        for(int i = 0; i <= 10; i++) {      	 
        	Ferm.write(i+"\n");
        }
        Ferm.close();//�������� �����, ��� ���� �� ���������
	}
}