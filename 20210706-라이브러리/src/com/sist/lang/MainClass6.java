package com.sist.lang;

import java.lang.reflect.Method;

// getClass() : Ŭ������ ���� �б�
/*
 *    ��ü ���� ==> new
 *    new => ������� �ʰ� ��ü ������ ���� (Ŭ������ �˰� ������)
 *    
 *    new => ���ռ��� ���� ���α׷� (�������̸� ������� �ʴ´�(�ǰ����))
 *    ======================================================
 *    �ڡ� Class.forName("com.sist.lang.MainClass6") �ڡ�
 */
class Board
{
	public void display()
	{
		System.out.println("Board:display() call...");
	}
	public void display1()
	{
		System.out.println("Board:display() call...");
	}
	public void display2()
	{
		System.out.println("Board:display() call...");
	}
}
public class MainClass6 {

		// Ŭ���� ������ҿ� ���� ���� �������� - getClass
//	            ======= ������ (�������, ������, �޼ҵ�)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board b=new Board();
		b.display();
		Class bb=b.getClass(); 
		Method[] methods=bb.getDeclaredMethods();
		for(Method m:methods) {
			System.out.println(m.getName()); // �޼ҵ尡 ���� ���ִ��� Ȯ��
		}
//		try {
//			Object obj=bb.getDeclaredConstructor().newInstance();
//		}catch(Exception ex) {}
		
	}

}
