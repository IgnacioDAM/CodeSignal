package Ejercicios;

public class Siglo {

	public static int centuryFromYear(int year) {
		return 1 + (year - 1) / 100;
	}
	
	public static void main(String[] args) {
		System.out.println(centuryFromYear(2020));
		System.out.println(centuryFromYear(1));
		System.out.println(centuryFromYear(1713));
		System.out.println(centuryFromYear(101));
	}

}
