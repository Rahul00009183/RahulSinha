package javaprograms;
import java.util.HashSet;
import java.util.Set;
public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer> hset = new HashSet<>();
      hset.add(2);
      hset.add(4);
      hset.add(6);
      hset.add(7);
      System.out.println(hset);
      //hset.clear();
      //hset.contains(6);
      for(int dd:hset)
      {
    	  System.out.println(dd);
      }
      }

}
