package Programs;

public class Odds {
	
	static void odd(int a, int b) {
		while(a<=b) {
			if(a%2==1) {
				System.out.println(a);
			}
			a++;
		}
	}

	public static void main(String[] args) {
	
		odd(25,100);
	}
}
