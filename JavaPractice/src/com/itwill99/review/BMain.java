package com.itwill99.review;

class B {

	int x;
	int y;

	public B() {
		
	}

	public void m1() {
		System.out.println("m1 호출");
	}

	public void m2() {
		System.out.println("m2 호출");
	}

}

public class BMain {

	public static void main(String[] args) {
		B b1 = new B();
		b1.x = 5;
		b1.y = 6;

		System.out.println(b1.x + "" + "," + b1.y);
		b1.m1();
		b1.m2();

	}

}
