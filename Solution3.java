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



public class Solution3 {
	public static ArrayList<String> ar = new ArrayList<String>();
	public static void fib(String n) {

	
		
		
		//checking for palindrome
		
		n=n.toLowerCase();
		String pal="";
	    for(int i=n.length()-1;i>=0;i--)
	    {
	    	char c=n.charAt(i);
	    
	    	pal=pal.concat(String.valueOf(c));
	    }
		//System.out.print(pal);
		
		if(n.equals(pal))
		{
			//its a palindrome
			if(n.length()%2==0)
			{
				System.out.print("Even Palindrome");
			}else{
				System.out.print("Odd Palindrome");
			}
			
		}else{
			//not palindrome
			System.out.print("Not a Palindrome");
		}
		
		
	}
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {


		String n = scanner.next();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		 fib(n);

	//	System.out.println(result);

		scanner.close();
	}
}
