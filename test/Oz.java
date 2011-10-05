package test;

public class Oz {
	public static void main(String[] args) {
		String str = "zzzzz";
		String temp = "";
		
		if(str.length() >= 2){
			if(str.charAt(0) == 'o') {
				temp += str.charAt(0);
			} 
			
			if(str.charAt(1) == 'z') {
				temp += str.charAt(1);
			}
		}
		System.out.println(temp);
	}
}
