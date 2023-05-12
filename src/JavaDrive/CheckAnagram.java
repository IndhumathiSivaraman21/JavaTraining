package JavaDrive;

import java.util.Scanner;

/** 
 * Check whether the two strings are anagram or not
 * @Author : Indhumathi S
 * Date : 06-05-2023
*/
import java.util.*;
public class CheckAnagram {
	
	public static boolean isAnagram(String str1,String str2) {
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(ch1.length==ch2.length) {
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] != ch2[i]) {
					return false;
				}
			}
			return true;
			
		}else
			return false;
	}
	
	public static void main(String args[]) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter two String : ");
		String str1=read.next();
		String str2=read.next();
		boolean b=isAnagram(str1,str2);
		if(b==true) 
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
			
		read.close();
		
	}
}
