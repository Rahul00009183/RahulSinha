package javaprograms;
import java.util.Scanner;
public class Voting_age_validateDemo {

	public void getAgeValidation(int age)
	{
		if(age<18)
		{
			System.out.println(age+" is not eligible");
		}
		else if(age>=18&age<=60)
		{
			System.out.println(age+" is eligible");
		}
		else 
		{
			System.out.println(age+" is retired !");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voting_age_validateDemo obj = new Voting_age_validateDemo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the age");
		int age = sc.nextInt();
		obj.getAgeValidation(age);
	}

}
