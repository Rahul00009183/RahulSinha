package javaprograms;
import java.util.Scanner;
public class ReverseString_demo {
	String out="";
	public void getReverse(String input )
	{
		//input="ajayrathore";
		//out=erohtaryaja
		char[] c = input.toCharArray();
		//c[]=a,j,a,y,s,i,n,g,h,r,a,t,h,o,r,e
		int size = c.length;
		
		for(int k=size-1;k>=0;k--)
		{
			out=out+c[k];
		}
		System.out.println(out);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString_demo obj = new ReverseString_demo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input");
		String input = sc.next();
		obj.getReverse(input);
	}

}
