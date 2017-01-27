import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;

public class RunLengthEncoding {
	
	void findRunLengthEncoding(String input){
		HashMap<Character,Integer> table = new HashMap<Character,Integer>(input.length());
		for(char c:input.toCharArray()){
//			table.compute(c, (key,val)->{
//				if(val == null)
//					return 1;
//				else
//					return val + 1;
//			});
			if(!table.containsKey(c))
				table.put(c,1);
			else
				table.put(c, table.get(c)+1);
		}
		StringBuffer out = new StringBuffer();
		for(Entry<Character,Integer> entry: table.entrySet()){
			out.append(entry.getKey());
		}
		System.out.println(out.toString());
	}
	
	void findRunLengthEncoding1(String input){
		int count = 1,i;
		StringBuffer b = new StringBuffer();
		for(i = 1; i< input.length();i++){
			if(input.charAt(i) == input.charAt(i-1))
				count++;
			else{
				b.append(input.charAt(i-1)+""+count);
				count = 1;
			}
				
		}
		b.append(input.charAt(i-1)+""+count);
		System.out.println(b.toString());
	}
	

}
