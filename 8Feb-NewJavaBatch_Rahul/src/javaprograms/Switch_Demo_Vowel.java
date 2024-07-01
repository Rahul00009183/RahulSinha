package javaprograms;
import java.util.Scanner;

public class Switch_Demo_Vowel {
public void getValidateVowel(char input) // input = u
{
	switch (input)
	{
	case 'a' :
	{
       System.out.println(input+ "is a vowel");
       break;
	}
	case 'e' :
	{
		  System.out.println(input+ "is a vowel");
	       break;
	}
	case 'i' :
	{
		  System.out.println(input+ "is a vowel");
	       break;
	}
	case 'o' :
	{
		  System.out.println(input+ "is a vowel");
	       break;
	}
	case 'u' :
	{
		  System.out.println(input+ "is a vowel");
	       break;
	}
	 default :
	 {
		 System.out.println(input+ "is a consonant");
	 }
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switch_Demo_Vowel obj = new Switch_Demo_Vowel ();
		Scanner sc = new Scanner (System.in);
		System.out.println("Please Enter the input");
		char input = sc.next().charAt(0);
		obj.getValidateVowel(input);

	}

}
