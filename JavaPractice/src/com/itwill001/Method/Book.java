package com.itwill001.Method;

public class Book {
	/*
	
	 * 
	 * <<속성>>
	 *  책번호
	 *  책제목
	 *  책분류
	 *  책설명
	 */

	int bookNumber;
	String bookTitle;
	String bookCategory;
	String bookDescription;

	/*
	* <<기능>>
	*   
	
	*   - 책정보대입
	*   
	*/

	public void bookInfo(int bookNumber, String bookTitle, String bookCategory, String bookDescription) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
		this.bookCategory = bookCategory;
		this.bookDescription = bookDescription;
	}

	// - 책정보출력

	public void headerprint() {
		System.out.println("====================================================");
		System.out.printf("%s %s %20s %10s\n", "책 번호", "책 제목", "책 분류", "책 설명");

	}

	public void print() {
		System.out.println("====================================================");
		System.out.printf("%d \t%s \t%s \t%s\n", bookNumber, bookTitle, bookCategory, bookDescription);

	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

	public String getBookDescription() {
		return bookDescription;
	}

	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}

}