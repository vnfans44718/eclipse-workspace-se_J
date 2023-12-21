
public class VariableTypes1 {

	public static void main(String[] args) {
		int i1,i2,i3,i4,i5,i6;
		i1=88;
		i2=99;
		i3=2147483647;
//		부호 비트를 제외한 나머지 비트가 1로 채워질 경우의 숫자
		i4=0b01111111111111111111;
//      
		i5=i1;
		i6=i2;
        System.out.println("------int----------");
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
        
        long l1 = 232;
        long l2 = 2147483648L;
//        정수의 범위를 넘어서는 리터럴을 쓸 수 없으니 L 기호로 표현
        
        System.out.println(l1);
        System.out.println(l2);
        
        double d1,d2,d3;
        d1=3.141592;
        d2 = 123456789123456789123456789.0;
        d3=1.23456789123456789;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        
  
        float f1 = 0.1F;
//              float f1 = 0.1, 4바이트 실수 이기때문에 에러 ,double로 타입을 줘야
//         Char을 넣으면 테이블을 참조하여 인코딩과 디코딩
        
       char c1;
       c1='A';
       char c2='가';
       char c3='힣';
       char c4='1';
       char c5=c1;
  System.out.println("--------char--------");
  System.out.println(c1);
  System.out.println(c2);
  System.out.println(c3);
  System.out.println(c4);
  System.out.println(c5);
  
  
  System.out.println("----------------------------");
  char m1,m2,m3,m4,m5,m6,m7,m8,m9;
  m1='A';
  m2= 65;
  m3= 0x0041;
  m4= '\u0041';
//  \는 유니코드로 표현시 u가 문자의 u가 아니라 유니코드의 u라는 것을 알려줌
  m5= '\u000E';
		  
		  
		  
//  데이터 소실이 발생하지 않는다면 작은 값을 큰 변수에 넣는 것은 가능, 
//  65는 정수로 4바이트이나 2바이트로 표현할 시에도 데이터 소실이 없어 값을 넣는게 가능, 예외적인 상황
  
  
  System.out.println(m1);
//  System.out.println(m2);
//  The local variable m2 may not have been initialized, m2는 변수 선언했지만 초기화는 안됨
  System.out.println(m2);    
  System.out.println(m3);
  System.out.println(m4);
  System.out.println(m5);
  

  
  boolean bool1=true;
  boolean bool2=false;
  boolean bool3=true;
  boolean bool4=bool3;
  
  System.out.println("---------boolean--------");
System.out.println(bool1);  
System.out.println(bool2);  
System.out.println(bool3);  
System.out.println(bool4);  
  
  
  
  
  
  
  
  System.out.println("--------------문자열형(String)-------------");
  
  String str1="오늘은";
  String str2="수요일";
  String str3="타입을 공부합니다.";
  
  System.out.println(str1);
  System.out.println(str2);
  System.out.println(str3);
  
  /*
   * 문자열 결합 연산자 (+)
   * 
   */
  
  String str4 = str1+ " "+str2+" "+str3+" !";
  System.out.println(str4);
		  
  String name="김경호";
  int age=34;
  char gender='m';
  double height=182.36;
  double weight=65.;
  
  String myInfo=name+" "+age+" "+gender+" "+height+" "+weight;
  
  System.out.println("--------------------");
  System.out.println("이름 나이 성별 키 몸무게");
  System.out.println("--------------------");
  System.out.println("myInfo");
  System.out.println(name+" "+age+" "+gender+" "+height+" "+weight);
  
  
  
  
  
	}

}
