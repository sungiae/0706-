package com.sist.lang;
/*
 *   Object ==> clone() : 복제 (있는 그대로 메모리 복제 => 새로운 메모리 생성)
 *   원형) protected Object clone() => clone을 사용할 때는 반드시 예외처리를 하고 사용한다
 *       => 응용) 스프링 (기본 : 싱글턴 , 메모리를 따로 생성 => prototype)
 *                     =========== 메모리 한개만 사용이 가능 (DAO,XML)
 *       => 얕은 복사 (참조=>별칭)
 *            = class A
 *              => A a=new A();
 *              => A b=a;          ==> 메모리 공간이 1개 (이름만 2개)
 *          깊은 복사 
 *            = class A
 *              => A a=new A();
 *              => A b=a.clone();  ==> 매모리 공간이 2개 (a메모리, b메모리 각각 따로 생성)
 */
class Box implements Cloneable
{
	private int width=100;
	private int height=200;
	// 메소드를 통해서 접근이 가능하게 한다 (캡슐화) => 변수 기능(읽기 or 쓰기)
	// source - getter and setter
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	// 특별한 경우가 아니면 오버라이딩하지 않는다 (외부라이브러리, 소프트웨어 패턴:prototype패턴)
	// 소프트웨어패턴 (스프링 : 8개패턴)
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
public class MainClass1 {

	public static void main(String[] args) {
		Box a=new Box(); // a=> width=100 , height=200;
		a.setWidth(1000);
		a.setHeight(2000); // a=> width=1000, height=2000;
		System.out.println("a.width="+a.getWidth()+", a.height="+a.getHeight());
		Box b=new Box(); // b=> width=100 , height=200;
		System.out.println("b.width="+b.getWidth()+", b.height="+b.getHeight());
		try
		{
			 Box c=(Box)a.clone(); // 형변환 해야되는거 주의
			 System.out.println("c.width="+c.getWidth()+", c.height="+c.getHeight());
			 
		}catch(Exception ex){}
	}

}
