package test;

public class Modulo {
	public static void main(String[] args) {
		int a = Modulo.mod(79, 5);
		System.out.println(a);
	}
	
	public static int mod(int dividend, int divisor) {
		while(true) {
			dividend -= divisor;
			if(dividend < divisor) 
				break;
		}
		int result = dividend;
		return result;
	}
}
