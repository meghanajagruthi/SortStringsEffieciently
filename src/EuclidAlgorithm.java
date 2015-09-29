
public class EuclidAlgorithm {

	public static  int gcd(int a,int b){
		int dividend=(a>=b?a:b);
		int divisor=(a<=b?a:b);
		while(divisor!=0){
			int remainder=dividend%divisor;
			dividend=divisor;
			divisor=remainder;
		}
		
		return dividend;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(gcd(400,124));
	}

}
