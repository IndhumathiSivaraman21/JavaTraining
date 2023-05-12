package JavaDrive;
/** 
 * Sort the person name using Treeset
 * @Author : Indhumathi S
 * Date : 06-05-2023
*/

import java.util.*;
class Person implements Comparable<Person>{
		private String name;
		
		public Person(String name) {
			super();
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String toString() {
			return name;
		}
		public int compareTo(Person o) {
		
			return (name.compareTo(o.name));
		}


	}
public class TreeSetPerson {

	 public static void main(String[] args) {
		 TreeSet<Person> Ts=new TreeSet<Person>();
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter count : ");
		 int n=sc.nextInt();
		 System.out.println("Enter the persons names:");
		 for(int i=1;i<=n+1;i++) {
			 Ts.add(new Person(sc.nextLine()));
		 }
		 System.out.println("Sorted TreeSet :");
		 Iterator<Person> itr=Ts.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 sc.close();
	 }

	}





