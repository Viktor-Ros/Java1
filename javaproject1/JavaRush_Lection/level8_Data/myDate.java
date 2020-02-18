package level8_Data;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 
 * ДАТА
 * Год - с 1900
 * Месяцы - с 0
 * Дни - с 1 дня недели
 * 
 * 
 */
public class myDate {

	public static void main(String[] args) {
		
		Date today = new Date();//Получение текущей даты
		System.out.println("Текущая дата и время: " + today);		
		
	    int hour = today.getHours();
	    int min = today.getMinutes();
	    int sec = today.getSeconds();

	    System.out.println("Текущее время: " + hour + ":" + min + ":" + sec);
	    
	    int year = today.getYear();
	    int month = today.getMonth();
	    int day = today.getDay();
	    
	    System.out.println("Текущая дата: " + year + "." + month + "." + day);
	    
	    SimpleDateFormat formatDate = new SimpleDateFormat("E yyyy.MM.dd 'и время' hh:mm:ss a zzz");//Форматирование даты
	    
	    System.out.println("Форматирванная д" + formatDate.format(today));
	    
	    Date myDate = new Date(94, 4, 7, 03, 00, 0);//Вывод нужной даты
	    
	    System.out.println("Мой др: " + myDate);
	    
	    //Сравение дат
	    
	    if(today.getTime() > myDate.getTime()) {//Сравнение миллисекунд
	    	System.out.println("В " + today + " больше миллисекунд, чем в " + myDate);
	    }
	    
	    if(today.after(myDate)) {//Если today идет после myDate
	    	System.out.println(today + " идет после " + myDate);	
	    }
	    
	    if(myDate.before(today)) {//Если today идет перед myDate
	    	System.out.println(today + " идет перед " + myDate);	
	    }
	}
}
