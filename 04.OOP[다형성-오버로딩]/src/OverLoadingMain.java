
class OverLoading {

	public void method() {
		System.out.println("public void method");
	}
	public void method(int a) {
		System.out.println("public void method(int a)");
	}
	
	public void method(String a) {
		System.out.println("public void method(String a)");
	}
	
	public void method(int a, int b) {
		System.out.println("public void method(int a, int b)");
	}
	
	public void method(int a, String b) {
		System.out.println("public void method(int a, String b)");
	}
	
	public void method(int a, int b, int c) {
		System.out.println("public void method(int a, int b, int c)");
	}
	
}

public class OverLoadingMain {

	public static void main(String[] args) {
		OverLoading overLoading= new OverLoading();
		overLoading.method();
		overLoading.method(123);
		overLoading.method("김수한무~");
		overLoading.method(100,200);
		overLoading.method(100,"이백");
		overLoading.method(1,2,3);
	
		

	}

}
