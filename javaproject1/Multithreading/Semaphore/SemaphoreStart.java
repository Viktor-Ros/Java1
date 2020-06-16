package Semaphore;

import java.util.concurrent.Semaphore;

/*
 * 
 * МНОГОПТОЧНОСТЬ СЕМАФОР
 * 
 * Семафор - класс для синхронизации потоков
 * Семафор использует счетчик для предоставления потокам разрешений на работу
 * если разрешения кончились, то оставшиеся потоки ждут их освобождения
 * 
 * Семафор нужен для задач, где нужно ограничивать доступ потокам
 * 
 * при создании семафора обязательно указывается кол-во разрешений и по желанию true/false - давать потокам разрешение в порядке очереди или нет
 * 
 * метод acquire() - запрашивает разрешение у семафора
 * метод release() - освобождает разрешение
 * 
 */


public class SemaphoreStart {
		
	public static void main(String[] args) throws InterruptedException {
		
		Semaphore semaphore = new Semaphore(1,true);
		
		SemThread sThread1 = new SemThread("sThread1", semaphore);
		SemThread sThread2 = new SemThread("sThread2", semaphore);
		SemThread sThread3 = new SemThread("sThread3", semaphore);
		SemThread sThread4 = new SemThread("sThread4", semaphore);

		sThread1.start();
		sThread2.start();
		sThread3.start();
		sThread4.start();	
	}
}