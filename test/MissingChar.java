package test;

public class MissingChar {
	public static void main(String[] args) {
		String str = "kitten";
		String temp = "";
		int n = 2;
		for(int x = 0; x < str.length(); x++) {
			if(x == n) {
				continue;
			}
			temp += "" + str.charAt(x);
		}
		System.out.println(temp);
	}
}