package javaprograms;
import java.util.Scanner;
public class DivisionsDemo {
	int a,b,c;
	float d,e,f;
	Scanner sc = new Scanner(System.in);
	public void add()
	{
		System.out.println("Please Enter the two number for add");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a+b;
		System.out.println("Addition output is" +c);
	}
	public void div()
	{
	 System.out.println("Please Enter the two input for div");
	 d = sc.nextFloat();
	 e = sc.nextFloat();
	 f = d/e;
	 System.out.println("div output is" +f);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    DivisionsDemo obj= new DivisionsDemo();
    obj.add();
    obj.div();
	}

}
