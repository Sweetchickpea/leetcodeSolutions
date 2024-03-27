package NumberSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	 public List<List<String>> groupAnagrams(String[] strs) {
	        Map<String, List<String>> hm= new HashMap<>();

	        for(String s:strs){
	            char[] ch= s.toCharArray();
	            Arrays.sort(ch);
	            String nstr= new String(ch);
	            if(!hm.containsKey(nstr)){
	                hm.put(nstr, new ArrayList<>());
	            }
	            hm.get(nstr).add(s);
	        }
	        return new ArrayList<>(hm.values());
	    }
	}
