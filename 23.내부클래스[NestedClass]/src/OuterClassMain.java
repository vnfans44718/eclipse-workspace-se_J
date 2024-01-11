
public class OuterClassMain {

	public static void main(String[] args) {
	OuterClass outerClass=new OuterClass();
	OuterClass.InnerClass innerClass= outerClass.new InnerClass();
	System.out.println(innerClass);
	innerClass.inner_member_field=34;
	
	
	}

}
