package javaprograms;
import java.util.Scanner;
public class Calculator_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Calculator_Demo obj = new Calculator_Demo();
  Scanner sc = new Scanner (System.in);
  System.out.println("Please Enter the two number");
  
  int a = sc.nextInt();
  int b = sc.nextInt();
  int out = obj.Addition(a, b);
  System.out.println(out);
	}

}
