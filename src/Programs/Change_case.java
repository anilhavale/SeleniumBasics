package Programs;

import java.util.Scanner;

public class Change_case {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Sentence");
		String s1 = s.nextLine();
		String s2=" ";
		char[] ch = s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int sp=i;
			while(ch[i]!=' ')
			{
				i++;
			}
			
			int ep=i-1;
			if(ep>=sp) {
				if(ch[sp]>='a' && ch[sp]<='z') {
					s2 = s2+(char)(ch[sp]-32);
				}
				else
						s2 = s2 + ch[sp];

				for(int j=sp+1;j<=ep;j++) {
					if(ch[j]>='A'&&ch[j]<='Z') {
						s2 = s2+(char)(ch[j]+32);
					}
					else
						s2 = s2+ch[j];
				}
			}
		}
		
	}
}
