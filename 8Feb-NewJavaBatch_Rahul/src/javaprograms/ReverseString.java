package javaprograms;
import java.util.Scanner;
public class ReverseString {
 public void reversestring (String input)
 {
	 char [] arr = input.toCharArray();
	 String rev = " " ;
	 for(int i=arr.length-1; i>=0; i--)
	 {
		 rev = rev+arr[i];
	 }
	 System.out.println(rev);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ReverseString obj = new ReverseString();
  Scanner sc = new Scanner(System.in);
  System.out.println("Please Enter a valid input");
  String name =sc.next();
  obj.reversestring(name);
	}

}
