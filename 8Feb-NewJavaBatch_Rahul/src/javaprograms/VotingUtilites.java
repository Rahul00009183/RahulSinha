package javaprograms;
import java.io.FileInputStream;
import java.util.Scanner;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class VotingUtilites {
	public void getdata(String name, int age) 
	{
		if (age<18) 
		{
			System.out.println("SORRY! Your are not Eligibile for Voting");
		} 
		else 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Choice one of them");
			System.out.println("1. Aadhar Card Number");
			System.out.println("2. Voter Card Number");
			int choice = sc.nextInt();
			if (choice == 1) 
			{
				System.out.println("Please Enter your Aadhar card number");
				long AadharNumber = sc.nextLong();
			}
			else if(choice==2)
			{
				System.out.println("Please Enter your Voter card number");
				long Vote = sc.nextLong();
			}
		}
	}
		public String getReadData(String path,int sheetno,  int rowno, int colno)
		{ 
			String value ="";
			try 
			{
				FileInputStream fis = new FileInputStream(path);
				XSSFWorkbook wb = new XSSFWorkbook(fis);
			    XSSFSheet sheet = wb.getSheetAt(sheetno);
			    value = sheet.getRow(rowno).getCell(colno).getStringCellValue();
			} 
			catch (Exception e) 
			{
				System.out.println("issue in  get read data : " + e);
			}
			return value;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in); 
		System.out.println("Please enter your name");
		String name = sc.next();
		System.out.println("Please enter your age");
		int age = sc.nextInt();
		String path = "C:\\Users\\Rahul Sinha\\eclipse-workspace\\8Feb-NewJavaBatch_Rahul\\src\\TestBaba.xlsx";
		VotingUtilites obj = new VotingUtilites();
		obj.getdata(name, age);
		for(int i=2; i<=10;i++ )
		{
		String out = obj.getReadData(path,2, i, 2);
		System.out.println(out);
		}
	}

}
