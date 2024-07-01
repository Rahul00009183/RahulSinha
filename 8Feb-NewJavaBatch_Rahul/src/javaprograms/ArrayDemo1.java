package javaprograms;
import java.util.Scanner;
public class ArrayDemo1 {
public void array_Demo ()
{
	int []val = new int [5];
	Scanner sc = new Scanner(System.in);
	System.out.println("Please Enter the array number");
	int out =0;
	for (int i=0; i<=4; i++)
	{
		val[i]=sc.nextInt();
	}
	for (int j=0; j<5; j++)
	{
		out = out +val[j];
	}
	System.out.println(out);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayDemo1 obj = new ArrayDemo1();
    obj.array_Demo();
	}

}
