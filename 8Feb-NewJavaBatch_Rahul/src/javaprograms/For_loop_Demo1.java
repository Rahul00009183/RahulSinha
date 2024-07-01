package javaprograms;
import java.util.Scanner;
public class For_loop_Demo1 {
	public void getNum(int num)
	{
		for(int i = 1; i<=10; i++)
		{
			System.out.println(i*num);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	For_loop_Demo1 obj = new For_loop_Demo1 ();
	Scanner sc = new Scanner (System.in);
	System.out.println("Please Enter any value");
	int num = sc.nextInt();
	obj.getNum(num);
	}
	
}
