package Programs;

import java.util.Scanner;

public class Reverse_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a sentence :");
		String s1 = s.nextLine();
		String s2 = " ";
		char[] ch = s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			String temp =" ";
			while(i<ch.length&&ch[i]!=' ') {
				temp = ch[i]+temp;
				i++;
			}
			s2 = s2 + temp;
		}
		System.out.println(s2.trim());
		
	}

}
