package ���������;

import java.util.ArrayList;

/*
 * 
 * ���������
 * �������� - ��� ������ ArrayList
 * ���� �� ������� ��������, �� � ArrayList ����� ���� ������ ����� �����
 * 
 */

public class Generic {

	public static void main(String[] args) {
		
		ArrayList Car = new ArrayList(); //����� ArrayList, �� �� ������ ��������(����. int) � <>
		
		Car.add("one");
		Car.add("two");
		Car.add("tree");
		Car.add("tree");
		Car.add("tree");
		Car.add(3);
		Car.add(28);
		
		System.out.println(Car);
		
		ArrayList<String> Ferm = new ArrayList<>();//�������� <String>
		
		Ferm.add("Cow");
		Ferm.add("Dog");
		Ferm.add("Pig");
		//Ferm.add(4); - ������ ��������, �� � AL ��� String
		System.out.println(Ferm);
		
		
	}

}
