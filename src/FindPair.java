import java.util.HashSet;

import java.util.Set;

/**

* @author Sekhar Dutta

* 

*/

public class FindPair {

private static void printPair(int[] arr, int sum) {

Set<Integer> set = new HashSet<Integer>();

for (Integer e : arr) {

if (set.contains(e)) {

System.out.println("Pair: " + e + ", " + (sum - e));

break;

} else {

set.add(sum - e);

}

}

}

/**

* @param args

*/

public static void main(String[] args) {

// TODO Auto-generated method stub

int[] arr = { 2, 5, 21, 16, 43, 8 };

int sum = 45;

printPair(arr, sum);

}

}