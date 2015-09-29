import java.util.*;

//O(n*loglog n)

public class SieveOfEratosthenis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean array[] = new boolean[21];
		Arrays.fill(array, true);
		array[0] = false;
		array[1] = false;
		for (int i = 2; i <= Math.sqrt(20); i++) { //since factors can be found already when it is less than square root of number

			for (int j = 2; (j * i) <= 20; j++) {
				array[j * i] = false;
			}
		}

		for (int i = 0; i <= 20; i++) {
			if (array[i])
				System.out.print(i+"  ");
		}
	}

}
