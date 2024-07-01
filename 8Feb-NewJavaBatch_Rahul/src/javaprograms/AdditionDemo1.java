package javaprograms;
import java.util.Scanner;
public class AdditionDemo1 {
int a,b,c;
float d,e,f;
Scanner sc = new Scanner(System.in);
public void Add()
{
	System.out.println("Please Enter the two number for add");
	a = sc.nextInt();
	b = sc.nextInt();
	c = a+b;
	System.out.println("Addition output is" +c);
}
public void Sub()
{
  a = 90;
  b = 59;
  c = a-b;
  System.out.println(c);
}
public void Divi()
{
	d = 12;
	e = 5;
   float f =d/e;
   System.out.println(f);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  AdditionDemo1 obj = new AdditionDemo1();
  //obj.Add();
  obj.Sub();
  //obj.Divi();
	}

}
