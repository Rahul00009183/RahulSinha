package javaprograms;
import java.util.Scanner;
public class BillutilityDemo {
	public void Indiamart(Float Price, Float GSTt,String Customer_name, Long Phone_number,String Product) 
	{
		
		Float GST =Price*18/100;
		Float Final_Bill=Price+GSTt;
		
		System.out.println("Customer Name  "+Customer_name);
		System.out.println("Contact number  "+Phone_number);
		System.out.println("Product  "+Product);
		System.out.println("Product price  "+Price);
		System.out.println("GST on product  "+GSTt);
		System.out.println("Final bill to pay  "+Final_Bill);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the CustomerName");
		String Customer_name = sc.next();
		System.out.println("Please enter Contact No.");
		Long Phone_number = sc.nextLong();
		System.out.println("Please enter the Product name");
		String Product = sc.next();
		System.out.println("Please enter the product Price");
		Float Price =sc.nextFloat();
		Float GSTt=Price*18/100;
		BillutilityDemo obj=new BillutilityDemo();
		obj.Indiamart(Price, GSTt, Customer_name, Phone_number, Product);
		
	}

}
