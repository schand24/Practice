import java.util.HashMap;
import java.util.Map.Entry;

public class GetListItemshasAllCharacters {
	void listAllListItems(String[] list,String word){
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(char c: word.toCharArray()){
			map.compute(c, (key,val)->{
				if(val == null)
					return 1;
				else
					return val+1;
			});
		}
		for(String str : list){
			boolean flag = true;
			HashMap<Character,Integer> temp = new HashMap();
			temp.putAll(map);
			for(char c : str.toCharArray()){
				if(temp.containsKey(c))
					temp.put(c, temp.get(c)-1);
			}
			for(Entry<Character,Integer> entry:temp.entrySet()){
				if(entry.getValue() != 0)
					flag = false;
			}
			if(flag){
				System.out.println(str);
			}
			
				
		}
	}
}
