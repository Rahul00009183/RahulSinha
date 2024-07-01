package javaprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;
public class MapDemoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
LinkedHashMap<Integer,Character> map = new LinkedHashMap<Integer,Character>();
           map.put(1,'a');
           map.put(2, 'b');
           map.put(3,'c');
Set<Entry<Integer,Character>> set = map.entrySet(); 
 for(Entry<Integer,Character>dd:set)
	
	{
     System.out.println (dd.getKey()+""+dd.getValue());
}

	}
}
