import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution2 {
	public static ArrayList<String> ar = new ArrayList<String>();
	public static void fib(int n) {

	
	
		ar.add("0");
		ar.add("1");
		int c=1;
		for (int i = 1; i <= c; i++) {
            
           
           
            int si=ar.size();
           
            	String f=ar.get(si-2);
            	String s=ar.get(si-1);
            	 if(Integer.parseInt(f)+Integer.parseInt(s) == i)
                 {
                 	ar.add(String.valueOf(i));
                 
                 
                 	//fibb series exist
                 }
            	 
            	 if(ar.size()==n)
            	 {
            		 break;
            	 }
            	 else{
            		 c++;
            		 
            	 }
			
        }

		for(int j=0;j<ar.size();j++)
		{
			if(j==(ar.size()-1))
			{
				System.out.print(ar.get(j));
			}else{
			System.out.print(ar.get(j)+",");
			}
		}
		
		
	}
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {


		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		fib(n);

	//	System.out.println(result);

		scanner.close();
	}
}
