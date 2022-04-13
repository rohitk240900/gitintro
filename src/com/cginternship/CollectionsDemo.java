package com.cginternship;
import java.util.HashMap;
/*Create a program to get the HashMap from the given input string array 
 where the key for the HashMap is first three letters of array element in Upper Case 
 and the value of HashMap is the element itself
Input:{“goa”,”kerala”,”gujarat”} [string array]
Output:{{GOA,goa},{KER,kerala},{GUJ,Gujarat}} [hashmap]
*/
public class CollectionsDemo {
	public static HashMap<String, String> getEntries(String array[]) {
		HashMap<String,String> hm=new HashMap<>();
		for(int i=0;i<array.length;i++) {
			hm.put(array[i].substring(0,3).toUpperCase(),array[i]);
		}
		return hm;
	}
	public static void main(String[] args) {
		String array[] = { "goa", "kerala", "gujarat" };
		System.out.println(getEntries(array));
	}
}