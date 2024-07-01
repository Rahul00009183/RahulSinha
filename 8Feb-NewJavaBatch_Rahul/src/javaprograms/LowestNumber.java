package javaprograms;
import java.util.Scanner;
public class LowestNumber {
 public void lowestNum(int num[])
 {
	 int low = num[0];
	 for (int j =1; j<num.length; j++)
	 {
		 if(num[j]<low)
		 {
			 low = num[j];
		 }
	 }
	 System.out.println("Lowest Number from series is"+low);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   LowestNumber obj = new LowestNumber();
   int[]num=new int[5];
   Scanner sc = new Scanner(System.in);
   System.out.println("Please Enter the Valid Input");
   for (int j=0; j<num.length; j++)
   {
	   num[j] = sc.nextInt();
   }
   obj.lowestNum(num);
	}

}
