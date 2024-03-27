package NumberSystem;

import java.util.HashSet;

public class ArrayIntersection1 {

	
		public static int[] intersection(int[] nums1, int[] nums2) {
	        HashSet<Integer>hs= new HashSet<Integer>();
	        
	        for(int i=0;i<nums1.length;i++) {
	        	hs.add(nums1[i]);
	        	
	        	for(int j=0;j<nums2.length;j++) {
	        		if(hs.contains(nums2[j])) {
	        			System.out.print(nums2[i]);
	        		}
	        	}
	        }
	        return nums2;

	        
		}
		

}