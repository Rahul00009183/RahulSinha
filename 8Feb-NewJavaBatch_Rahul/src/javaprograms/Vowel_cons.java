package javaprograms;
import java.util.Scanner;
public class Vowel_cons {

	public void getValidate(char input)
	{
		if(input=='a'|input=='e'|input=='i'|input=='o'|input=='u')
		{
			System.out.println(input+" is a vowel");
		}
		else
		{
			System.out.println(input+" is a consonant");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vowel_cons obj = new Vowel_cons();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input");
		char input = sc.next().charAt(0);
		obj.getValidate(input);
	}

}
