package ������������������;

//*
//* ������ ���� ������
//*

public class C�cles1 {
	
	public static void main(String[] args) {
		System.out.print("���� FOR �� ����������� - ");
		for (int i = 0; i < 11; i = i + 2){
			//for ([������������� �����]; [������� ���������� �����(���� ��������)]; [��������� ���� �����])
		if (i<9) 
		    System.out.print(i +" ");
		else
			System.out.println(i);	
		}
		
		System.out.print("���� FOR �� �������� - ");
		for (int i = 10; i >= 0; i = i - 2){
			
		if (i > 0)
			System.out.print(i + " ");
		else
			System.out.println(i + " ");
		}	
			
		System.out.print("���� WHILE(�����������) - ");
		int w = 1; 
		while (w <= 11) { // - ������� ����� ������
		if (w >= 11)
					System.out.println(w + " ");
		else
					System.out.print(w + " ");
				w = w+2;	// - ���� �����
				}	
					
		System.out.print("���� WHILE_DO(�����������) - ");	
		int d = 1;		
		do {
		if (d >= 11)
					System.out.println(d + " ");
		else
					System.out.print(d + " ");
					d = d + 2;	// - ���� �����
				} 
		while (d <= 11); // - ������� ����� �����
				
		System.out.print("���� � BREAK  - ");
		for (int a = 1; a < 11; a = a + 2){
		if (a > 7)
					// break - ����� �� ����� �� ��������� ��� ������ ��� i > 7
		break;	
		if (a >= 7)
						System.out.println(a +" ");
		else
					System.out.print(a +" ");
				}	
				
		System.out.print("���� � CONTINUE - ");
		for (int s = 1; s <= 11; s = s + 2){
		if (s == 7)
						// continue - ������� � ��������� �������� ��� s = 7(������� ���� �������� ��� s = 7)
		continue;	
				System.out.print(s +" ");
				}						
	}
}