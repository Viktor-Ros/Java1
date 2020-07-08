package HomeWork2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Map<String, Integer> map = new HashMap<>();

	public static void main(String[] args){

		FileReader reader = null;
		//System.out.println("Введите адрес файла:");
		//String address = new Scanner(System.in).nextLine();
		
		try {
			reader = new FileReader("C:\\Users\\Viktor\\Desktop\\JavaFiles\\JF.txt");//"C:\\Users\\Viktor\\Desktop\\JavaFiles\\JF.txt"
		} catch (FileNotFoundException e) {
			System.out.println("Такого файла несуществует, попробуйте еще раз:");
			main(args);
		}
		
		Scanner scan = new Scanner(reader);
		
		int count = 0;
		
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			int lineCount = wordFreq(line);
			if(count < lineCount) {
				count = lineCount;
			}
        }
		
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(Map.Entry<String, Integer> iter : map.entrySet()) {
			
			if(iter.getValue() == count) {
				System.out.println(iter.getKey() + " = " + iter.getValue());
			}
		}	
		
		System.out.println(map);

	}
	
	static int wordFreq(String line) {
		
		int count = 1;
		String word = "";
		
		for(int i = 0; i < line.length(); i++) {
			
			char sym = line.charAt(i);
			
			if(Character.isLetter(sym)) {
				word += String.valueOf(sym);	
			}
			
			if((!Character.isLetter(sym) || i == line.length()-1) && word.length() > 0) {

				if(map.containsKey(word)) {
					int countLet = map.get(word) + 1;
					map.replace(word,countLet);
					
					if(count < countLet) {
						count = countLet;
					}
				}
				else map.put(word,1);

			word = "";
			}
		}
		return count;
	}
}