package javaprograms;
import java.util.Scanner;
public class GFC {

	static int recursive_function(int n, int rev)
	{
		if (n<10)
		{
			return rev*10+n;
		}
		else {
			int last_digit = n%10;
			rev = rev*10+last_digit;
			return recursive_function(n/10,rev);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=82340987 ;
		int rev = recursive_function (n,0);
		System.out.println("Reverse of n="+rev);
       if (n==rev)
    	   System.out.println("Palindrome=yes");
       else
       {
    	   System.out.println("Palindrome=No");
       }
	}

}
