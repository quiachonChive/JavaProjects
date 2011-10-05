package test;

public class AlternatePairs {
	public static void main(String[] args) {
		String d = "chocolate";
		String str = (d.length() % 2 == 0 ? d : d + " ");
		String temp = "";
		for(int x = 0; x < str.length(); x+=4) {
			temp += str.substring(x, x+2);
		}
		System.out.println(temp);
	}

}
