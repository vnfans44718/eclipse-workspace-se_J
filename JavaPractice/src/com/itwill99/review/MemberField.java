package com.itwill99.review;

/*
 * 1.객체를 생성할 클래스
 * 2.데이타타입
 */
public class MemberField {

	/*
	1. 멤버변수4개생성
	*/

	private int no;
	private String name;
	private String number;
	private char grade;

	public MemberField() {

	}

	public MemberField(int no, String name, String number, char grade) {

		this.no = no;
		this.name = name;
		this.number = number;
		this.grade = grade;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public void headerPrint() {
		System.out.println("번호 이름 전화번호 학점");
	}

	public void print() {
		System.out.printf("%d %s %s %c", no, name, number, grade);
	}

}