package test;

public class Greates {
	public static void main(String[] args) {
		int a = 12, b = 3, c = 9;
		int temp = 0;
		if(a > b) {
			temp = a;
		} else {
			temp = b;
		}
		
		if(temp < c) {
			temp = c;
		}
		System.out.println(temp);
	}

}
