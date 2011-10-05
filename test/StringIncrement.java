package test;

public class StringIncrement {
	public static void main(String[] args) {
		String str = "miracle";
		String temp = "";
		int inc = 2;
		for(int x = 0; x < str.length(); x+=inc) {
			temp += str.charAt(x);
		}
		System.out.println(temp);
	}

}
