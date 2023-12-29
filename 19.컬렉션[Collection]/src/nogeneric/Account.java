package nogeneric;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Account {
	
	private int no;      //계좌번호
	private String owner;//계좌주이름
	private int balance; //계좌잔고
	private double iyul; //계좌이율


	/*
	 * 계좌데이를 대입
	 */
	
	/*
	 * 입금
	 */
	public void deposit(int money) {
		this.balance=this.balance+money;
		//this.balance+=money;
	}
	/*
	 * 출금
	 */
	public void withDraw(int money) {
		this.balance=this.balance-money;
		//this.balance-=money;
		
	}
	/*
	 * 계좌헤더출력
	 */
	public static void headerPrint() {
		System.out.println("----------------------");
		System.out.printf("%s %s %4s %3s\n","번호","이름","잔고","이율");
		System.out.println("----------------------");
	}
	/*
	 *계좌정보출력 
	 */
	public void print() {
		System.out.printf("%4d %-4s %6d %4.1f\n",this.no,this.owner,this.balance,this.iyul);
	}
	/*
	 << getter,setter,toString 메쏘드생성단축키>>
	  alt + s         --> r
	  alt + shift + s --> r
	  
	  alt + shift + s --> s
	 */
	
	
	
	
	
}