package test;

public class SelectedUpperCase {
	public static void main(String[] args) {
		String str = "ello";
		String temp = "";
		if(str.isEmpty()) {
			temp = "";
		} else if(str.length() < 3) {
			temp = str.toUpperCase();
		} else {
			temp += str.substring(0, str.length() - 3) + 
					   str.substring(str.length() - 3, str.length()).toUpperCase();
		}
		System.out.println(temp);
	}
}
