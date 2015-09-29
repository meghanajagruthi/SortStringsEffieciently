


public class LargestPrimeFactor {

	
	public static boolean primeCheck(long number){ //prime number check using trial division method
		
		for(int i=2;i<Math.sqrt(number);i++){
			
			if(number%i==0){
				return false;
			}
			
		}
		return true;
	}
	public static void generatePrimeNumber(Long number){
		
		long i=Math.round(Math.sqrt(number));
		
		while(i>=2){  //generate factors and then check for the primality of the factors
			if(number%i==0){
				if(primeCheck(i)){
					System.out.println(i);
					break;
				}
			}
			i--;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("Hello world");
		generatePrimeNumber(600851475143L);
	}

}
