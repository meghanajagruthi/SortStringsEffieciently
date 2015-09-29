import java.util.Arrays;


public class ReverseWordsSwap { //Not efficient

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ster="Happy independence day";
		String array[]=ster.split(" ");
		
		for(int i=0 , j=array.length-1;i<=j;i++,j--){
			String temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}
		System.out.println(Arrays.toString(array));
	}

}
