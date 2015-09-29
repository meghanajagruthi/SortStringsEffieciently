import java.util.Random;


public class ShuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		int array[]={2,4,5};
		for(int i=0;i<array.length;i++){
			
			int j=rand.nextInt((array.length));
			
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+"  ");
		}

	}

}
