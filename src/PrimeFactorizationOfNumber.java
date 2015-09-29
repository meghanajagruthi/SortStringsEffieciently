
public class PrimeFactorizationOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=52;
		for(int i=2;i<=Math.sqrt(n);i++){
			
			if(n%i==0){
				int count=0;
				while(n%i==0){
					n=n/i;
					count++;
				}
				System.out.println(i+"   "+count);
			}
			
		}
		if(n!=1)
		{
			System.out.println(n+"   "+1);
		}
	}

}
