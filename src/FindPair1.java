import java.util.Arrays;


public class FindPair1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={1, 4, 45, -6, -6, 10, 8};
		int sum=4;
		int start=0;
		int end=array.length-1;
		Arrays.sort(array);
		while(start<end){
			if(array[start]+array[end]==sum){
				System.out.println(array[start]+","+array[end]);
				break;
			}
			else if(array[start]+array[end]<sum){
				start++;
			}
			else if(array[start]+array[end]>sum){
				end--;
			}
		}

	}

}
