package Programs;

public class Prime {

	static boolean prime(int a) {
		int i=2;
		while(a>i) {
			if(a%i==0) {
				return false;
			}
			i++;
		}
		return true;
	}


	public static void main(String[] args) {
		boolean isprime = prime(110);
		if(isprime) {
			System.out.println(isprime);
		}
		else
			System.out.println(isprime);
	}

}

