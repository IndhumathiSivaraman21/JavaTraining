package JavaDrive;

/** 
 * Display the second word in uppercase.import
 * @Author : Indhumathi S
 * Date : 06-05-2023
*/

import java.util.*;
public class StringUppercase {
	public static void secondStringUpper(String str) {
		String s[]=str.split(" ");
		if(s.length>2)
			System.out.println(s[1].toUpperCase());	//convert second string to lowercase
		else
			System.out.println("LESS");
	}
	public static void main(String args[]) {
		System.out.println("Enter a Sentence : ");
		Scanner read=new Scanner(System.in);
		String str=read.nextLine();	//read input
		secondStringUpper(str);
		read.close();
		
	}
}
