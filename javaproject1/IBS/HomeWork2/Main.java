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
		String address = new Scanner(System.in).nextLine();
		
		try {
			reader = new FileReader(address);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Scanner scan = new Scanner(reader);
		
		int count = 0;
		
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			count = wordFreq(line);
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
	}
	
	static int wordFreq(String line) {
		
		int count = 0;
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