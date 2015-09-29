import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* The efficient solution is 
 * sample input -4 5 6 12 13 17 20 21
  sample output - [4-6, 12-13, 17, 20-21]
 */
public class SequencedIntegers {

	public static String generateSequences(Integer index,Integer array[]){
		int startIndex=index;
		int endIndex=index;
		for(int i=startIndex;i<array.length-1;i++){
			if(array[i]==(array[i+1]-1)){
				endIndex=i+1;
				
			}
			else{
				break;
			}
		}
		if(startIndex==endIndex){
			return index.toString();
		}
		else{
			return startIndex+"-"+endIndex;
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input[]=br.readLine().split(" ");
		Integer inputArray[]=new  Integer[input.length];
		ArrayList<String> result=new ArrayList<String>();
		for(int i=0;i<input.length;i++){
			inputArray[i]=Integer.parseInt(input[i]);
		}
        
		for(int i=0;i<inputArray.length;i++){
			
			String tempResult=generateSequences(i,inputArray);
			if(tempResult.indexOf("-")==-1){
				i=Integer.parseInt(tempResult);
				result.add(inputArray[i].toString());
			}
			else{
				String indArray[]=tempResult.split("-");
				int startIndex=Integer.parseInt(indArray[0]);
				int endIndex=Integer.parseInt(indArray[1]);
				i=endIndex;
			    result.add(inputArray[startIndex]+"-"+inputArray[endIndex]);
			}
			
			
		}
		System.out.println(result.toString());
	}

}
