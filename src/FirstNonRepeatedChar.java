import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Character,Integer> hashMap=new LinkedHashMap<Character,Integer>();
        String str="abzddab";
        char array[]=str.toCharArray();
        for(int i=0;i<array.length;i++){
        	if(hashMap.get(array[i])==null)
        	   hashMap.put(array[i], 1);
        	else
        	{
        		int count=hashMap.get(array[i]);
        		count=count+1;
        		hashMap.put(array[i],count);
        	}
        }
        
        for(int i=0;i<hashMap.size();i++){
        	
        	if(hashMap.get(array[i])==1){
        		System.out.println(array[i]);
        		break;
        	}
        }
	}

}
