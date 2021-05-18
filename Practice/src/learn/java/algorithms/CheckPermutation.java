package learn.java.algorithms;

import java.util.Arrays;

public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(permutation("bac", "cab"));
	}

	private static boolean permutation(String str1, String str2) {
		// TODO Auto-generated method stub
		
		int[] letters = new int[128];
		
		char[] str_array = str1.toCharArray();
		for(char c : str_array) {
			letters[c]++;
			//System.out.println(letters[c]);
		}
		
		for(int i=0; i<str2.length(); i++) {
			
			int c = (int)str2.charAt(i);
			letters[c]--;
			if(letters[c]<0) {
				return false;
			}
		}
		
		return true;
	}

	/*private static boolean permutation(String str1, String str2) {
		// TODO Auto-generated method stub
		return sort(str1).equals(sort(str2));
	}

	private static String sort(String str) {
		// TODO Auto-generated method stub
		char[] content = str.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}*/
	
	

}
