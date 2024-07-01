package javaprograms;
import java.util.Scanner;
public class Marksheet_Division 
	{
		String name,fathername,collegename;
		Float percentage, rollno,hindi,english,science,computer,maths,total;
		
		
		Scanner sc = new Scanner(System.in );
		 
		public void getmarksheetdetails()
		{
			
			System.out.println("please enter the name");
			  name=sc.nextLine();
			System.out.println("please enter the fathername");
			  fathername=sc.next();
			System.out.println("please enter the  collegename ");
			  collegename=sc.next();
			 System.out.println("please enter the rollno");
			   rollno=sc.nextFloat();
			System.out.println("please enter the hindi marks");
			    hindi=sc.nextFloat();
			System.out.println("please enter the english marks ");
			    english=sc.nextFloat();
		    System.out.println("please enter the science marks");
		        science=sc.nextFloat();
		     System.out.println("please enter the computer marks");
		         computer=sc.nextFloat();
		    System.out.println("please enter the maths marks");
		         maths=sc.nextFloat();    
		           total=hindi+english+science+computer+maths; 
		         
		         percentage =(total*100)/500;
		     
		         System.out.println("Marksheet");
		         
		     System.out.println("name is "+name);  
		     System.out.println("fathername is "+fathername);
		     System.out.println("collegename is " +collegename);
		     System.out.println("rollno is" +rollno);
		     System.out.println("hindi marks in" +hindi);
		     System.out.println("english marks in" +english);
		     System.out.println("science marks in" +science);
		     System.out.println("computer marks in " +computer);
		     System.out.println("maths marks in " +maths);
		        if(hindi<33|english<33|science<33|computer<33|maths<33)
		     {
		    	 System.out.println("you are fail");
		     }
		     else
		     {    
		    	       String divison="";
		    	    
		    	   
		    	    if (percentage>=33&percentage<=45)
		    	    {
		    	     	divison=("third divison");
		    	    }
		    	    else if (percentage>=45&percentage<=65)
		    	    {
		    	    	divison=("second divison");
		    	    }
		    	    else       
		    	    {
		    	    	divison=("first divison");
		    	    }	
		    	    System.out.println("total marks out of 500/" +total);
		   	     System.out.println("percentage is" +percentage);
		   	  System.out.println("you are pass with "+divison);
		   	  
		   	   
		    	      
		     }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Marksheet_Division obj=new  Marksheet_Division();
		   obj.getmarksheetdetails();

	}

}
