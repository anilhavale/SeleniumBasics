package Programs;

public class C_n_w {

	public static void main(String[] args) {
		int count =0;
		String s = "Mango is a fruit";
		String[] ch = s.split(" ");
		System.out.println(ch.length);
		String s2 = " ";
		for (String c : ch) {
			s2 =c+ " " +s2;
		}
		System.out.println(s2.length());
	System.out.println(s2.trim());
	System.out.println(s2.length());
	}
}
