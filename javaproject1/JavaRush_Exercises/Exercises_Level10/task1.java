package Exercises_Level10;

import java.io.BufferedReader;
import java.io.CharConversionException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.file.FileSystemException;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.Set;


/*
 * 
 * Ввести с клавиатуры 10 строчек
 * Подсчитать в них количество различных букв (для 33 маленьких букв алфавита). 
 * Результат вывести на экран в алфавитном порядке.
 * 
 */

public class task1 {
	
	public static void main(String[] args) throws IOException {

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String str = new Scanner(System.in).nextLine();
            list.add(str);
        }

        ArrayList<Integer> list2 = new ArrayList<Integer>();//список слов
        
        for(int i = 0; i < alphabet.size(); i++ ) {
        	
        	int a = 0; 
        	
            for(int j = 0; j < list.size(); j++ ) {
            	
            	for(int k = 0; k < list.get(j).length(); k++ ) {
            		if(list.get(j).charAt(k) == (alphabet.get(i))) {
            			a++;
            		}
            	}
            }
            
            list2.add(a);
        }

        for(int i = 0; i < alphabet.size(); i++ ) {
        	
        	System.out.println(alphabet.get(i) + " " + list2.get(i));
        } 
    }
}