
public class UnaryOperator {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		
		int ar = -a;
		int br = +b;
		System.out.println(a);
		System.out.println(ar);
		System.out.println(b);
		System.out.println(br);

		boolean myTurn = true;
		System.out.println(myTurn);
		myTurn = !myTurn;
		System.out.println(myTurn);
		
		int kor=90;
		System.out.println("국어점수가 유효한지여부:"+(kor>=0 && kor<=100));
		System.out.println("국어점수가 유효안한지여부:"+!(kor>=0 && kor<=100));
		
		System.out.println("------------[++i, --j]-----------");
		int i=5;
		int j=5;
		++i;// i = i+1;
		--j;// j = i-1;
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("------------[++i, --j]-----------");
		i=5;// 위에서 이미 변수 선언했으니 초기화
		j=5;
		i++;// i = i+1;
		j--;// j = i-1;
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("----------[++i,j++]--------------------------");
		i=5;
		j=5;
		
		int ir= ++i;//앞쪽에 붙이면 i에 1을 더한  값을 먼저 하고 그 값을 ir에 넣음, i=i+1 --> jr=i;
		int jr= j++;//j값을 증가시키는 것을 나중에 함 , ir=j --> j=j+1;
		//대입 연산자가 들어가면 ++의 부호 위치에 따라 조금 값이 달라질 수 있음
		
		System.out.println(ir);
		System.out.println(jr);
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("-----------------------");
		
		i=5;
		j=5;
		System.out.println(++i);
		System.out.println(j++);
		System.out.println(i);
		System.out.println(j);
		

	}

}
