package ppp;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Iterator;
	import java.util.ListIterator;

	public class ArrayListdemo
	{

		public static void main(String[] args)
		{
			ArrayList<String> al = new ArrayList<String>();
			al.add("Pune");
			al.add("Mumbai");
			al.add("Mahad");
			al.add("Wagholi");
			al.add("Solapur");
			al.add("Raigad");
			al.add("Thane");
			
			Iterator<String> itr=al.iterator();
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			System.out.println("***********************************");
			
			Collections.sort(al);
			
			itr=al.iterator();
			
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			System.out.println("***********Using Iterator**********");
			
			ListIterator<String> li=al.listIterator();
			
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
			for(String s:al)
				System.out.println(s);
			
		}
	}

