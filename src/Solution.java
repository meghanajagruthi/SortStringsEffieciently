import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Solution {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     String input[]=br.readLine().split(" ");
     Integer array[]=new Integer[Integer.parseInt(input[0])];
     Arrays.fill(array, 0);
     Integer ops=Integer.parseInt(input[1]);
     while(ops>0){
    	 String temp[]=br.readLine().split(" ");
    	 int startIndex=Integer.parseInt(temp[0]);
    	 int endIndex=Integer.parseInt(temp[1]);
    	 int number =Integer.parseInt(temp[2]);
    	 for(int i=startIndex-1;i<endIndex;i++){
    		 array[i]=array[i]+number;
    		 
    	 }
    	 ops--;
    	}
     
     int maxValue=0;
     for(int i=0;i<array.length;i++){
    	 if(array[i]>maxValue){
    		 maxValue=array[i];
    	 }
    	 
     }
     System.out.println(maxValue);
	}

}
