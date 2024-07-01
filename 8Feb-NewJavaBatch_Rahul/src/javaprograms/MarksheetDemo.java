package javaprograms;
import java.util.Scanner;
public class MarksheetDemo {
	public float percentage(float total)
	{
		 float per= (total*100)/500;
		 return per;
	}
	
	public void getdetails(String sname, String fname, String colname, String course, int rno, int hinmark,
			int scimark, int engmark, int com_mark, int matmark)
	{
	   System.out.println("Student Name"+sname);
	  System.out.println("Fathers Name"+fname);
	  System.out.println("College Name"+colname);
      System.out.println("Selected course"+course);
      System.out.println("Roll No.       ........... : " +rno);
	  System.out.println("Hindi Marks    : " +hinmark);
	  System.out.println("Science Marks  : " +scimark);
	  System.out.println("English Marks  : " +engmark);
	  System.out.println("Computer Marks : " +com_mark);
	  System.out.println("Math Marks     : " +matmark);
	    
	  int total=(hinmark+scimark+engmark+com_mark+matmark);
	  System.out.println("Total ........ : " +total);
	  
	  MarksheetDemo obj=new MarksheetDemo();
	  float per=obj.percentage(total);
	
	  System.out.println("Percentage.... : " +per); 

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Student's Name");
		String sname = sc.nextLine();
		System.out.println("Please Enter the Father's Name");
		String fname = sc.nextLine();
		System.out.println("Please Enter the College Name");
		String colname = sc.nextLine();
		System.out.println("Please Enter the Course Name");
		String course = sc.nextLine();
		System.out.println("Please Enter the Roll No.");
		int rno = sc.nextInt();
		System.out.println("Please Enter the Hindi Marks");
		int hinmark = sc.nextInt();
		System.out.println("Please Enter the Science Marks");
		int scimark = sc.nextInt();
		System.out.println("Please Enter the English Marks");
		int engmark = sc.nextInt();
		System.out.println("Please Enter the Computer Name");
		int com_mark = sc.nextInt();
		System.out.println("Please Enter the MathMark");
		int mat_mark = sc.nextInt();	
		sc.close();
		
		MarksheetDemo obj=new MarksheetDemo();
				
		obj.getdetails(sname,fname,colname,course, rno,  hinmark,
				 scimark, engmark, com_mark, mat_mark);
	}

}
