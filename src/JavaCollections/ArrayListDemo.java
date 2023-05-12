package JavaCollections;
/** 
 * LinkedList of different datatypes
 * @Author : Indhumathi S
 * Date : 10-05-2023
*/

import java.util.*;

class EmployeeDetails{
	private String name;
	private int id;
	public EmployeeDetails(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
		return "EmployeeDetails [name=" + name + ", id=" + id + "]";
	}
	
}
public class ArrayListDemo {

		 public static void main(String []args) {
		  Scanner scan = new Scanner (System.in);

		  System.out.println("Enter size of integers : ");
		  int n = scan.nextInt();
		  System.out.println("Enter HashSet of Integers : ");	//HashSet of integers
		  HashSet <Integer> ll = new HashSet<Integer>();
		  for(int i=0 ; i< n ;i++) {
		   ll.add(scan.nextInt());
		  }
		  System.out.println(ll);
		  System.out.println("Enter delete position : ");
		  ll.remove(scan.nextInt());
		  System.out.println(ll);
		 
		  System.out.println(ll.size());
		 
		  System.out.println("Enter size of String : ");
		  int n1 = scan.nextInt();
		  System.out.println("Enter HashSet of strings");	//HashSet of strings
		  HashSet <String> s = new HashSet<String>();
		  for(int i=0 ; i< n1 ;i++) {
		   s.add(scan.next());
		  }
		  System.out.println(s);
		  System.out.println("Enter Insert String : ");
		  s.add(scan.next());
		  System.out.println(s);
		  
		  System.out.println("Enter size of Double : ");
		  int n2 = scan.nextInt();
		  System.out.println("Enter HashSet of Double : ");	//HashSet of double
		     HashSet <Double> db = new HashSet<Double>();
		     for(int i=0 ; i< n2 ;i++) {
		   db.add(scan.nextDouble());
		  }
		     System.out.println(db);
		     System.out.println("Enter an element to check occurance : ");
		  if(db.contains(scan.nextDouble())) {
		   System.out.println("Element occurs !");
		  } else {
		   System.out.println("Doesn't occurs !");
		  }
		  
		  System.out.println("Enter String : ");
		  HashSet <Character> ch = new HashSet<Character>();
		  String str = new String(scan.next());
		  for(int i = 0; i<str.length(); i++){
		   ch.add(str.charAt(i));
		  }
		  System.out.println(ch);

		  System.out.println("Enter count of Employee Details : ");	//employee details 
		  int n4 = scan.nextInt();
		  System.out.println("Enter  Employee name and id");
		  LinkedList<EmployeeDetails> emp = new LinkedList<EmployeeDetails>();
		  
		  for(int i=0;i<n4;i++) {
		   emp.add(new EmployeeDetails(scan.next(),scan.nextInt()));
		  }
		  
		  Iterator <EmployeeDetails> itr = emp.iterator();
		  while(itr.hasNext()) {
		   System.out.println(itr.next());
		  }
		  scan.close();
		 }
		
}



