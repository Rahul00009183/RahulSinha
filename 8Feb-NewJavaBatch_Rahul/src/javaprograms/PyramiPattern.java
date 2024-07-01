package javaprograms;

public class PyramiPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i,j,row=6;
     for (i=0; i<row; i++)
     {
    	 for (j=row-i; j>1; j--)
    	 {
    		 System.out.println(" ");
    	 }
    	 for (j=0; j<=i; j++)
    	 {
    		 System.out.println(" ");
    	 }
    	 System.out.println();
     }
	}

}
