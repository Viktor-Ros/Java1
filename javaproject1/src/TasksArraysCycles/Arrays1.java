package ������������������;

/*
 * 
 * ������ �������� � ���������� ��������
 * ������: Array1, Enter
 * 
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Arrays1 {
	public static void main(String[] args) {
		Enter ent = new Enter();
		ent.enter1();
		Integer[] arrayone = {ent.a, ent.b, ent.c, ent.d};
		System.out.println("������ " + Arrays.toString(arrayone));
		
		Arrays.sort(arrayone, 0, 4);
		System.out.println("������ �� ����������� " + Arrays.toString(arrayone));
		
		Arrays.sort(arrayone, Collections.reverseOrder());
		System.out.println("������ �� �������� " + Arrays.toString(arrayone));
		
		System.out.println("������ ������� " + arrayone.length);
		
		int sum = 0;
		for( int num : arrayone) {
	       sum = sum+num;
	      }
	      System.out.println("����� ��������� ������� " + sum);
	      
		int mult = 1;
			for( int num : arrayone) {
				mult = mult*num;
		      }
		      System.out.println("������������ ��������� ������� " + mult);
	      
	      System.out.println("������� �������� ���������  ������� " + sum/arrayone.length);
	      
	    Integer max = arrayone[0];
	      for (int i = 0; i < arrayone.length; i++) {
	      if (arrayone[i] > max) {
              max = arrayone[i];
	      	}
	      }
	      
	      System.out.println("����� ������� ������� ������� " + max);
	      
	    Integer min = arrayone[0];
	      for (int i = 0; i < arrayone.length; i++) {
	      if (arrayone[i] < min) {
	    	  min = arrayone[i];
	      	}
	      }
	      
	      System.out.println("����� ��������� ������� ������� " + min);
	      
	      for (int i = 0; i < arrayone.length; i++) {
	      if (arrayone[i]%2==0) {
	      System.out.println("������ ������� ������� " + arrayone[i]);
	}
}
	      for (int i = 0; i < arrayone.length; i++) {
	      if (arrayone[i]%2-1==0) {
	      System.out.println("�������� ������� ������� " + arrayone[i]);
	}
}	      
	      
	}
}
