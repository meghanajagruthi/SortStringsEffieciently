
public class FibonacciSeries {

	public static void main(String args[]){
		int a=1,b=0;
		
		
		for(int i=0;i<10;i++){
			
			a=a+b;
			System.out.print(a+"   ");
			int temp=a;
			a=b;
			b=temp;
		}
	}
}
