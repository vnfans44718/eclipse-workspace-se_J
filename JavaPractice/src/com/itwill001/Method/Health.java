package com.itwill001.Method;

public class Health {
	// 헬스강사 정보 멤버변수 선언
	int height;
	int weight;
	String name;
	String lecture;
	int age;

	// 헬스강사 정보 멤버메쏘드 선언
	public void height1(int height) {
		this.height = height;

	}

	public void weight1(int weight) {
		this.weight = weight;
	}

	public void name1(String name) {
		this.name = name;
	}

	public void lecture1(String lecture) {
		this.lecture = lecture;
	}

	public void age1(int age) {
		this.age = age;
	}

	// 헬스강사 정보 출력 메소드
	public void headerprint() {
		System.out.printf("=========================================================\n");
		System.out.printf("%s %s %3s %s %s \n", "이름", "키", "무게", "수업", "나이");
	}

	public void print() {
		System.out.printf("=========================================================\n");
		System.out.printf("%s %d %d %s %d \n", this.name, this.height, this.weight, this.lecture, this.age);
	}
}
