
public class FibonacciRecursive {
	
	
	public  int generateFibo(int n){
		if(n==1){
		
			return 1;
		}
		if(n==2){
			
			return 1;
		} 
		return generateFibo(n-1)+generateFibo(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FibonacciRecursive fib =new FibonacciRecursive();
		int i=1;
		while(i<=10){
			System.out.print(fib.generateFibo(i)+"  ");
			i++;
		}
		
	}

}
