package Ejercicios;

public class RevisarPalindromo {
	
	public static boolean checkPalindrome(String inputString) {
		int inc = 0;
		int des = inputString.length()-1;
		boolean bError = true;
		
		while ((inc<des) && (bError)){
			if (inputString.charAt(inc)==inputString.charAt(des)){				
				inc++;
				des--;
			} else {
				bError = false;
			}
		}
		return bError;
		
	}
	
	public static void main(String[] args) {
		System.out.println(checkPalindrome("aba"));
		System.out.println(checkPalindrome("abab"));
	}

}
