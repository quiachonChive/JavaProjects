package test;

public class DelSubstring {
	public static void main(String[] args) {
		String str = "add";
		String temp = "";
		if(str.length() > 3) {
			if(str.substring(1,4).equals("del")) {
				for(int x = 4; x < str.length(); x++) {
					temp += str.charAt(x);
				}
				System.out.println(str.charAt(0) + temp);
			}
		}
		System.out.println(str);
	}
}
