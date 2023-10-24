package Programs;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =100;
		int b =1000;
		int count =0;
		while(a<=b) {
			if(a%2==0) {
				count++;
			}
			a++;
		}
		System.out.println(count);
	}

}
