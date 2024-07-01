package javaprograms;

public class Array_Demo1 {
public  void getDays()
{
	String [] d = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Frisday","Satursday"};
	for (int i =0; i<=6; i++)
	{
		System.out.println(d[i]);
	}
}

//	System.out.println("Size of the given array :" +d.length);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Array_Demo1 obj = new Array_Demo1();
     obj.getDays();
	}

}
