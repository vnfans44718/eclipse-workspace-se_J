
public class IfNested {

	public static void main(String[] args) {
		/*
		 * 학점계산(A(90~100),B(80~89),C(70~79),D(60~69),F(0~59))
		 */
		int kor = 78;
		System.out.println("-------nested if---------");
		char hakjum='F';
		if(kor>=90 && kor<=100) {
			hakjum='A';
		}else {
			/**** B,C,D,F *****/
			if(kor>=80 && kor< 90) {
				hakjum='B';
			}else {
				/**** C,D,F *****/
				if(kor>=70 && kor< 80) {
					hakjum='C';
				}else {
					/*** D,F ***/
					if(kor>=60 && kor< 70) {
						hakjum='D';
					}else {
						hakjum='F';
					}
				}
			}
			
		}
		
		System.out.printf("1.학점은 %c 입니다\n",hakjum);
		
		System.out.println("----------else if-----------");
		hakjum='F';
		if(kor>=90 && kor<=100) {
			hakjum='A';
		}else if(kor>=80 && kor<90) {
			hakjum='B';
		}else if(kor>=70 && kor<80) {
			hakjum='C';
		}else if(kor>=60 && kor<70) {
			hakjum='D';
		}else {
			hakjum='F';
		}
		System.out.printf("2.학점은 %c 입니다",hakjum);
		
		
		
		

	}

}
