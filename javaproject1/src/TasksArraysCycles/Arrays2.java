package ������������������;

//*
//* ������ �������� � ���������
//*

import java.util.Arrays;
import java.util.Collections;

public class Arrays2 {

	public static void main(String[] args) {
	
		Integer [] arr = {8,4,15,16,42,54,23};	//������� ������ arr �� 7 ��������� 
		int c = 0;
		int d = 1;
		int e = 0;
		int g = 0;
	 	int h = 5;
	 	int u = 0;
						
		//*
		//����� ������� arr
		//*
		
		System.out.println("������ " + Arrays.toString(arr));
		
		 //*
		 //�����/������������ ��������� ������� arr
		 //*
		 
		 for (int i = 0; i < arr.length; ++i) {		
				c = c + arr[i];
				d = d * arr[i];
			}
		 System.out.println("����� ��������� ������� " + c);
		 System.out.println("������������ ��������� ������� " + d);
		
		 //*
		 //������ ������� arr
		 //*
		 
		System.out.println("������ ������� " +arr.length);	
		
		//*
		 //������/�������� ������� ������� arr
		 //*
		
		 for (int i = 0; i < arr.length; i++) {
		      if (arr[i]%2==0) {	  
		      System.out.println(arr[i] + " ������ ������� �������");}
		      else  
		    	  System.out.println(arr[i] + " �������� ������� �������"); 
		      }		
		 
         //*
		 //����� e/���-�� g ������ ��������� ������� arr
		 //*
		 
		 for (int i = 0; i < arr.length; i++) {
		      if (arr[i]%2==0) {
		    	  e = e + arr[i];
		    	  g = g + 1;
		      }
		 }
		 System.out.println("����� ������ ��������� ������� " + e); 
		 System.out.println("���-�� ������ ��������� " + g);
		 
		 //*
		 //������ ar �� ������ ��������� ������� arr
		 //*
		 
		 Integer [] ar;
		 ar = new Integer[g]; 
   	     g=0;
  	for (int i = 0; i < arr.length; i++) {
	      if (arr[i]%2==0) {
	    	  ar[g] = arr[i];
	    	  g++; 	 
	      }
	 }		 		 
		 System.out.println("������ �� ������ ��������� " + Arrays.toString(ar));
		 
		//*
		//����� �������/��������� ������� ������
		//*
		 
		 for (int i = 0; i < arr.length; i++) {
			 			 
		      if (u<arr[i]) {
		    	  u = arr[i];
		      }
		 }  
		 System.out.println("����� ������� ������� ������� " + u);
		 
		 for (int i = 0; i < arr.length; i++) {
		      if (h>arr[i]) {
		    	  h = arr[i];
		      }
		 }  
		 
		 System.out.println("����� ��������� ������� ������� " + h);	
		 
		 //*
		 // ������ �� �����������/��������
		 //*
		 
		    Arrays.sort(arr, 0, arr.length);
			System.out.println("������ �� ����������� " + Arrays.toString(arr));
	
			Arrays.sort(arr, Collections.reverseOrder());
			System.out.println("������ �� �������� " + Arrays.toString(arr));
		  }		 
}