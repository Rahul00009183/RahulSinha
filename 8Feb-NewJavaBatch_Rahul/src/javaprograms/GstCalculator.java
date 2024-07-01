package javaprograms;
import java.util.Scanner;
public class GstCalculator {
	public float getGst (float input)
	{
		float gst = (input*18)/100;
		return gst;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    GstCalculator obj = new GstCalculator();
    Scanner sc = new Scanner (System.in);
    System.out.println("Please Enter the input");
    int input = sc.nextInt();
    float out = obj.getGst(input);
    System.out.println(out);
	}

}
