package chizhenko;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String myStr;
		
		System.out.println("Введите строку");
		myStr = sc.nextLine();
		sc.close();
		
		System.out.println("В строке " + returnCountOfWords(myStr)  + " слов.");
		
	}
	
	static int returnCountOfWords(String pStr) {
		
		String str = pStr.trim();
		
		int counter = 0;
		char[] charArray = str.toCharArray();
		for (int i=0; i<charArray.length;i++) {
			if (charArray[i]==' ') {
				counter = counter + 1;
			}
		}
		
		return counter + 1;
	}

}
