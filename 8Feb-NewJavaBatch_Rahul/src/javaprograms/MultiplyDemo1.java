package javaprograms;
import java.util.Scanner;
public class MultiplyDemo1 {
	int a,b,c;
	float f,r,e;
	Scanner sc = new Scanner(System.in);
public void Multi()
{
	System.out.println("Please Enter the two number for multiply");
	a = sc.nextInt();
	b = sc.nextInt();
	c = a+b;
	System.out.println("Multiply output is" +c);
	
}
public void div()
{
 System.out.println("Please Enter the two input for div");
 f = sc.nextFloat();
 r = sc.nextFloat();
 e = f/r;
 System.out.println("div output is" +e);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MultiplyDemo1 obj = new MultiplyDemo1();
    obj.Multi();
    obj.div();
	}

}
