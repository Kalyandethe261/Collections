package ppp;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListdemo
{

		public static void main (String[] args)
		{
			LinkedList<String> ll = new LinkedList<String>();
			ll.add("Pune");
			ll.add("Mumbai");
			ll.add("Mahad");
			ll.add("Wagholi");
			ll.add("Solapur");
			ll.add("Raigad");
			ll.add("Thane");
			
			Iterator<String> itr=ll.iterator();
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			System.out.println("****************Sorted LinkedList*******************");
			
			Collections.sort(ll);
			
			itr=ll.iterator();
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			System.out.println("***********Using Iterator**********");
			
			ListIterator<String> li=ll.listIterator();
			
			while(li.hasNext())
			{
				System.out.println(li.next());
				
			}
			
			System.out.println("***************Using Previous*************");
			
			while(li.hasPrevious())
			{
				System.out.println(li.previous());
				
			}
			System.out.println("************Inhance for*****************");
			for(String s:ll)
				System.out.println(s);
			
		}
	

		}

