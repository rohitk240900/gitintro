package com.cginternship;
import java.util.ArrayList;
import java.util.List;
/*input
 ===== 
 String input1="raja/pavan/anju"
 char input2='/'
 
 output
 ====== 
 List<String> output1=["ajar","navap","ujna"];
*/
//split the string using the second input and form a list by
//reversing the each and every string

public class StringDemo{
	public static List<String> getStrings(String input1, char input2){
		List<String> l=new ArrayList<String>();
		String s[]=input1.split(Character.toString(input2));
		for(int i=0;i<s.length;i++) {
			StringBuilder sb=new StringBuilder(s[i]);
			l.add(sb.reverse().toString());
		}
		return l;
	}
	public static void main(String[] args) {
		String input1="raja/pavan/anju";
		char input2 = '/';
		System.out.println(getStrings(input1,input2));
	}

}
