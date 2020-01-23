package ���������;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 * 
 * SET
 * set - ��������� ��������� ��� ����������
 * HashSet - ��������������� ��������� ��� ����������, ����� ��� �������� ������ ���������, ����������� ������� �������� ������
 * TreeSet - ������������� ��������� ��� ����������, ��������� ��� HashSet, ������ ������ � ����� ������
 * ������� HashSet �� TreeSet - HashSet �������� �������
 *  
 */

public class CollectionSet {

	public static void main(String[] args) {
		
		HashSet<String> Ferm1 = new HashSet<>();// HashSet ����� ��� �������� ������ �������� � ���������
		
		Ferm1.add("cow");
		Ferm1.add("3er");
		Ferm1.add("pig");
		Ferm1.add("cow");
		Ferm1.add("27g");
		
		System.out.println("HashSet " + Ferm1);
		
		TreeSet<String> Ferm2 = new TreeSet<>(); //TreeSet - ������ �������� �� �������, �� ��������� ��� HashSet
		Ferm2.add("cow");
		Ferm2.add("3er");
		Ferm2.add("pig");
		Ferm2.add("cow");
		Ferm2.add("27g");
		
		System.out.println("TreeSet " + Ferm2); 

	}

}