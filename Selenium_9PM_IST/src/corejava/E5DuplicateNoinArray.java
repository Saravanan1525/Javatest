package corejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



public class E5DuplicateNoinArray {

	public static void main(String[] args) {
		 int arr[] = {101,4,222,38,102,222,7,8,38,3,04,07};
	        int n = arr.length;
	        printDuplicates(arr, n);
	    }
	    // function to find and print duplicates
	    private static void printDuplicates(int[] arr, int n)
	    {
	        Map<Integer,Integer> map = new HashMap<>();
	        int count = 0;
	        boolean dup = false;
	        for(int i = 0; i < n; i++){
	            if(map.containsKey(arr[i])){
	                count = map.get(arr[i]);
	                map.put(arr[i], count + 1);
	            }
	            else{
	                map.put(arr[i], 1);
	            }
	        }
	         
	        for(Entry<Integer,Integer> entry : map.entrySet())
	        {
	            // if frequency is more than 1
	            // print the element
	            if(entry.getValue() > 1){
	                System.out.print(entry.getKey()+ " ");
	                dup = true;
	            }
	        }
	        // no duplicates present
	        if(!dup){
	            System.out.println("-1");
	        }

	}

}
