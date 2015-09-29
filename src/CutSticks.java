import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CutSticks {

	public static int findMin(Integer inputArray[]){
		int min=Integer.MAX_VALUE;
		for(int i=0;i<inputArray.length;i++){
			if(inputArray[i]<min&&inputArray[i]>0){
				min=inputArray[i];
			}
		}
		return min;
	}
	public static Integer[] reduceStickLength(Integer inputArray[],Integer minValue){
		int count=inputArray.length;
		for(int i=0;i<inputArray.length;i++){
			if((inputArray[i]-minValue)<0){
				inputArray[i]=0;
				count--;
			}
			inputArray[i]=inputArray[i]-minValue;
		}
		if(count==0){
			System.out.println("DONE");
		}
		else{
			System.out.println(count);
		}
		return inputArray;
	}
	public static void genCutSticks(String input[]){
		Integer inputArray[]=new Integer[input.length];
		for(int i=0;i<input.length;i++){
			inputArray[i]=Integer.parseInt(input[i]);
		}
		for(int i=0;i<inputArray.length;i++){
			int minValue=findMin(inputArray);
			if(minValue!=Integer.MAX_VALUE){
			reduceStickLength(inputArray, minValue);
			}
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String testCase=br.readLine();
		String input[]=br.readLine().split(" ");
		genCutSticks(input);

	}

}
