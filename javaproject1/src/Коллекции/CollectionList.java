package ���������;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 * 
 * LIST
 * list - ��������������� ������ � ���������� �����������
 * ArrayList - ������ � ������������ ������ ���������
 * LinkedList - ������ ���������, ��� ������ ������� ������ ������ � ������ �� ��������� � ���������� �������
 * ������� ArrayList �� LinkedList, � ArrayList ������ ���������� � ��������� ��������, � LinkedList � ���������� ������
 *  
 */

public class CollectionList {

	public static void main(String[] args) {
		
		List Ferm1 = new ArrayList();// ArrayList - ������ � ������������ ������ ���������
		
		Ferm1.add("cow");
		Ferm1.add(3);
		Ferm1.add("pig");
		Ferm1.add("cow");
		
		System.out.println(Ferm1);
		
		LinkedList Ferm2 = new LinkedList(); //LinkedList - ������ ���������, � ������� ����� ������ ���� ������ �� �������� ��������
		
		Ferm2.add("cow");
		Ferm2.add(3);
		Ferm2.add("pig");
		Ferm2.add(2,"cow");//���������� cow �� 2 ������� � ������
		
		System.out.println(Ferm2);
	}

}