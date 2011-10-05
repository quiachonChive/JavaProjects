package test;

public class NotString {
	public static void main(String[] args) {
		String str = "chive";
		if(str.substring(0, 3).equalsIgnoreCase("not")) {
			System.out.println(str);
		} else {
			System.out.println("not " + str);
		}
	}

}
