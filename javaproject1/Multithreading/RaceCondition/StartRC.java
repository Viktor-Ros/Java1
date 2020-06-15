package RaceCondition;

/*
 * 
 * МНОГОПТОЧНОСТЬ СОСТОЯНИЕ ГОНКИ
 * 
 * классы: StartRC, ThreadWriteRC, ThreadReadRC
 * 
 * Состояние гонки(race condition) - ситуация, когда несколько потоков работают с одними данными, и одни из них меняют эти данные, а другие не видят изменений
 * 
 * Изменения внесенные одними потоками, не всегда видны другим потокам
 * 
 * Состояния гонки предотвращает синхронизация
 * 
 */


public class StartRC {
	
	public static int race = 1;//переменная для изменения
	
	public static Object syncObj = new Object();//объект для синхронизации
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadWriteRC tWrite = new ThreadWriteRC("tWrite");
		
		ThreadReadRC tRead = new ThreadReadRC("tRead");

		tWrite.start();
		tRead.start();
		
		Thread.sleep(3000);
		
		tWrite.interrupt();
		tRead.interrupt();
	}
}