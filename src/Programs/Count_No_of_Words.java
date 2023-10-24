package Programs;

public class Count_No_of_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		String s ="Mango is a fruit";
		char [] ch =s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int sp =i;
			
			while(ch[i]!=0) {
				i++;
				if(i==ch.length) {
					break;
				}
			}
			int ep=i-1;
			if(ep>=sp) {
				count++;
			}
		}
		System.out.println(count);
	}
}
