package Programs;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,2,3,4,5,6,4,9,10}
		int s = a.length;
		int[] b={}; 
		for(int i=0;i<s;i++){

		for(int j=i+1;j<s;j++){
			
				if(a[i]==a[j]){
				continue;
				}
				else
				{
				b.put(a[i]);
				}
		}
		}
		System.out.println(b);



	}

}
