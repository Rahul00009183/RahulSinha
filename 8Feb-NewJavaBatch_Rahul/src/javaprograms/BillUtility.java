package javaprograms;
import java.util.Scanner;
public class BillUtility {
Scanner sc = new Scanner(System.in);
public void SuperMart()
{
	System.out.println("Please Enter the name");
	String name = sc.nextLine();
	System.out.println("Please Enter the Mobile Number");
	long mobile = sc.nextLong();
	System.out.println("Please Enter the product name");
	String P_name = sc.next();
	System.out.println("Please enter the product price");
	float P_price = sc.nextFloat();
	float Gst =(P_price*18)/100;
	float Total = Gst+P_price;
	System.out.println("Customer Name is" +name);
	System.out.println("Mobile Number is" +mobile);
	System.out.println("Product Name is" +P_name);
	System.out.println("Product Price is" +P_price);
	System.out.println("Gst 18% is" +Gst);
	System.out.println("Total Payble Amount is" +Total);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BillUtility obj = new BillUtility();
        obj.SuperMart();
	}

}
