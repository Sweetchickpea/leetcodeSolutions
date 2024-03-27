package NumberSystem;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
        Map<Integer,Boolean>hm=new HashMap<Integer,Boolean>();
        for(int i:nums){
            if(hm.containsKey(i)){
                return true;
            
            }
             hm.put(i,true);   
            } return  false;
    } 
    }