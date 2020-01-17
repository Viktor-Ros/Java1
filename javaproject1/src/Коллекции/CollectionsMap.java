package ���������;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

/*
 * 
 * MAP
 * map - �������, �������� ��������� �������� � �����, �.�. ����, ���� ������ ����������
 * HashMap - ��������������� �������
 * TreeMap - ������������� �������, ��������� ��� HashMap, ������ ������ � ����� ������
 * ������� HashMap �� TreeMap - HashMap �������� ������� TreeMap
 * 
 */


public class CollectionsMap {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> Ferm1 = new HashMap<>();//HashMap ����� ��� �������� ������ 
		       //int - ��� ������, str - ��� ��������
		
	  Ferm1.put(11,"Cow");
	  Ferm1.put(12,"Pig");
	  Ferm1.put(13,"Pig");
	  Ferm1.put(13,"Dog");//Dog(�� Pig) ����� ��� ������� 13, ��. ����� ���������
	  Ferm1.put(14,"Cat");
	 
	System.out.println(Ferm1);
	
	Ferm1.remove(14);
	Ferm1.remove("�ow");//�������� � ���������(get) �� HashMap ���������� ������ �� �����, �.�. cow �� ��������
	System.out.println(Ferm1);
	System.out.println(Ferm1.get(11));// ����� �������� � ������ 1
	
	
	Set keys = Ferm1.keySet();//��������� ������ � �������� ���������� ��������
	System.out.println("����� " + keys);
	ArrayList<String> values = new ArrayList<>(Ferm1.values());
	System.out.println("�������� " + values);
	
	if (!Ferm1.isEmpty()) { //�������� �� ������� ��������� � ����
		System.out.println(Ferm1);//���� ��������� ���, �� ������ � ������� �� ����� 
	}
	
	HashMap<Integer, String> Ferm2 = new HashMap<>();
	
	  Ferm2.put(21,"Horse");
	  Ferm2.put(22,"Chiken");
	  Ferm2.put(23,"Pig");
	  Ferm2.put(24,"Pig");
	  Ferm2.put(25,"Pig");
	
	Ferm1.putAll(Ferm2);// ����������� ����� � ����(Ferm1), ���� �����-�� ����� �����, �� ������ �������� ��������
	System.out.println(Ferm1);
	
	
	
	
	HashMap<Integer, String> Ferm3 = new HashMap<>();//TreeMap - ������ �������� �� ������� ������

	Ferm3.put(11,"Cow");
	Ferm3.put(14,"Pig");
	Ferm3.put(13,"Pig");
	Ferm3.put(12,"Cat");

	System.out.println("������������� ��� " + Ferm3);
		     
	}

}
