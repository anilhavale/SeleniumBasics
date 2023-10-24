package Programs;

import java.util.Scanner;

public class Reverse_sentence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 =s.nextLine();
		String s2 = " ";
		char[] ch = s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			s2 = ch[i]+s2;
		}
		
		System.out.println(s2);
		
		String[] s3 = s1.split(" ");
		String s4 = " ";
		for (String string : s3) {
			s4 = string+" "+s4;
		}
		System.out.println(s4);
	}
}
