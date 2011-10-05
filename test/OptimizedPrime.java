package test;

import java.util.Arrays;

public class OptimizedPrime {
	public static void main(String[] args) {
		int n = 100;
		boolean[] array = new boolean[n];
		Arrays.fill(array, true);
		
		for(int x = 2; x < array.length; x++) {
			for(int y = x*2; y < array.length; y+=x) {
				if(array[y] == false)
					continue;
				array[y] = false;
			}
			
			if(array[x] == false) {
				continue;
			} else {
				System.out.println(x);
			}
			
		}
	}
}
