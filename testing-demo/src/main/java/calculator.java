
public class calculator {

	public static void main(String[] args) {
		System.out.println("result of addition is:" + add(10,5));
		System.out.println("result of subtraction is:" + substract(10,5));
		System.out.println("result of multiplication is:" + multiply(10,5));
		System.out.println("result of division is:" + divide(10,5));
	}
	
	public static int add(int a,int b) {
		return a+b;
	}
	
	public static int substract(int a,int b) {
		if(a>b) {
			return a-b;
		}else {
			return b-a;
		}
	}
	
	public static int multiply(int a,int b) {
		return a*b;
	}
	
	public static int divide(int a,int b) {
		if(b!=0) {
			return a/b;
		}else {
			throw new ArithmeticException();
		}
	}

}
