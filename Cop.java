package Practice;

import java.util.Scanner;
public class Cop {
	static String isDivisible(long n)
	{
		long temp = n;
	
		int sum = 0;
		while (n != 0)
		{
			int k = (int) n % 10;
			sum += k;
			n /= 10;
		}
	
		if (temp % sum == 0)
			return "YES";
	
		return "NO";
	}
	
	public static void main(String []args)
	{
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isDivisible(n));
		sc.close();
	}
}


