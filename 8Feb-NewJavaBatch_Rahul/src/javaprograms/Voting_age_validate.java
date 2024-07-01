package javaprograms;
import java.util.Scanner;
public class Voting_age_validate {
	public void getAgeValidation(int age)
	{
		if(age<18)
		{
			System.out.println(age+" is not eligible");
		}
		else 
		{
			System.out.println(age+" is eligible");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voting_age_validate obj = new Voting_age_validate();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the age");
		int age = sc.nextInt();
		obj.getAgeValidation(age);
	}

}
