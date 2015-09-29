import java.util.ArrayList;


public class FiboArray {

	public static  void generateFibo(int number){
		ArrayList<Integer> array=new ArrayList<Integer>();
		array.add(1);
		array.add(1);
		for(int i=2;i<number;i++){
			array.add(array.get(i-1)+array.get(i-2));
		}
		System.out.println(array.toString());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      generateFibo(10);
	}

}
