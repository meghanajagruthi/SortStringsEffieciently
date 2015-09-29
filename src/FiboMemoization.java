import java.util.Arrays;


public class FiboMemoization {
	
	int array[]=new int[100];
	
	public FiboMemoization(){
		Arrays.fill(array, -1);
		array[0]=1;
		array[1]=1;
	}
	
	public int memoization(int n){
		
		if(n==1){
			return array[0];
		}
		if(n==2){
			return array[1];
		}
		int sum=array[n-1];
		if(sum==-1){
			sum=memoization(n-1)+memoization(n-2);
			array[n-1]=sum;
			return sum;
		}
		return sum;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FiboMemoization fm=new FiboMemoization();
		int i=1;
		while(i<=10){
			System.out.print(fm.memoization(i)+"  ");
			i++;
		}
	}

}
