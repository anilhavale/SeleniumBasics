package Programs;

public class Factorial {

	public static void main(String[] args) {
		int n =7;
		int fact =1;
		int i=1;
		while(n>=i) {
			fact = fact*i++;
		}
		System.out.println(fact);
	}
}
