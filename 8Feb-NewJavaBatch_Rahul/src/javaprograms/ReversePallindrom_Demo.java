package javaprograms;
import java.util.Scanner;
public class ReversePallindrom_Demo {
	public void pallandrome(String inp)
	{
		String act = inp;
		char[] ch  = inp.toCharArray();
		String str = "";
		for(int i=ch.length-1; i>=0; i--)
		{
			str = str + ch[i];
		}
		if(str.equalsIgnoreCase(act))
		{
			System.out.println("Given word is a pallendrome");
		}
		else
		{
			System.out.println("Given word is not a pallendrome");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReversePallindrom_Demo obj= new ReversePallindrom_Demo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a value");
		String value = sc.next();
		obj.pallandrome(value);
	}

}
