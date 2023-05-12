package JavaDrive;

import java.util.*;
/** 
 * Check wheather the key value exist in HashMap
 * @Author : Indhumathi S
 * Date : 06-05-2023
*/

public class HashMapCollection {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
				
			hm.put(sc.next(), sc.nextInt());
			hm.put(sc.next(), sc.nextInt());
			hm.put(sc.next(), sc.nextInt());
			hm.put(sc.next(), sc.nextInt());
				
			System.out.println("Enter key : ");	
				
			if(hm.containsKey(sc.next())){
				System.out.println("HashMap has the key");
			}
			else {
				System.out.println("HashMap does not has the key");
			}
			
			System.out.println("Enter value : ");	
			if(hm.containsValue(sc.nextInt())) {
				System.out.println("HashMap has the value");
			}else {
				System.out.println("HashMap doesn't has the value");
			}
			
			System.out.println("Map Entry Set : ");
			for(Map.Entry<String,Integer> me : hm.entrySet()) {
				System.out.println("Key : " + me.getKey() +" Value : " + me.getValue());
			}
			sc.close();
	}
}
	
			
			