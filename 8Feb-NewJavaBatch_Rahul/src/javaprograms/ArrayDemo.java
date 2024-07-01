package javaprograms;
import java.util.Scanner;
public class ArrayDemo {
public void arrayDemo ()
{
	int [] val = new int [5];
	Scanner sc = new Scanner (System.in);
	System.out.println("Please Enter the array numbers");
	for (int i=0; i<=4; i++)
	{
		val [i] = sc.nextInt();
	}
	for (int j=0; j<5; j++)
	{
		System.out.println(val[j]);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayDemo obj = new ArrayDemo();
     obj.arrayDemo();
	}

}
