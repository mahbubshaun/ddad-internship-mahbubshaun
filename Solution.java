import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	
	public static long factorial(int n) {

		long res = 1;
		int temp = n;
		for (int i = 1; i <= n; i++) {
            res  *= i;
        }

		return res;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {


		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long result = factorial(n);

		System.out.println(result);

		scanner.close();
	}
}
