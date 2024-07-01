package javaprograms;
import java.util.Scanner;
public class Main {
Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr []= {12,13,1,10,34};
      int max = arr[0];
      for  (int i=0; i<arr.length; i++)
      {
    	  if (max <arr[i])
    	  {
    		  max=arr [i];
    	  }
      }
      System.out.println(max);
	}

}
