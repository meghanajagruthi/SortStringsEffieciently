import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DateFormatter{
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int inputTest=Integer.parseInt(br.readLine());
        ArrayList<String> months=new ArrayList<String>();
        months.add("Jan");
        months.add("Feb");
        months.add("Mar");
        months.add("Apr");
        months.add("May");
        months.add("Jun");
        months.add("Jul");
        months.add("Aug");
        months.add("Sept");
        months.add("Oct");
        months.add("Nov");
        months.add("Dec");
        while(inputTest>0){
            String input[]=br.readLine().split(" ");
            
            int index=months.indexOf(input[1]);
            String date=input[2]+"-"+index+"-"+input[0].substring(0,input[0].length()-2);
          SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMM-dd");
			Date actualDate = formatter.parse(date.trim());
            System.out.println(formatter.format(actualDate));
            inputTest--;
        }
    }
}