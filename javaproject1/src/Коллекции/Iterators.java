package ���������;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/*
 * 
 * ��������
 * �������� - �����, ������� ���������� �������� � ���������
 * ����� ������� �������� �/��� ������� ����� � ������ �� ����� � ��������
 * ����� �������� �������� �� �������
 * 
 */

public class Iterators {

public static void main(String[] args) {
        
        List Ferm = new ArrayList();
        Ferm.add("Cow");
        Ferm.add("Pig");
        Ferm.add("Horse");
        Ferm.add("Dog");
        Ferm.add("Cat");
        
        System.out.println("����: " + Ferm);
        
        ListIterator itr = Ferm.listIterator();// - ��������
                
        System.out.println("������� ����� �� ������ �� �����:"); 
        while(itr.hasNext())
        {
        	System.out.println("������ - " + itr.nextIndex() + " " + "������� - " + itr.next());//���������� ����. ������� � ��� ������  
        }
               
        System.out.println("������� ����� � ����� � ������:");
        while(itr.hasPrevious())
        {
        	System.out.println("������ - " + itr.previousIndex() + " " + "������� - " + itr.previous());//���������� ����. ������� � ��� ������          
        }
         
        System.out.println("������ �������� Cow � �������� 0 �� Sheep");
        while(itr.hasNext())//������ �������� �� �������
        {
        	Ferm.set(itr.nextIndex(), "Sheep");
        	System.out.println("������ - " + itr.nextIndex() + " " + "������� - " + itr.next());//���������� ����. ������� � ��� ������
            
        }

        }       
}