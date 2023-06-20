package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlistDemo 
{
	public static void main(String args[])
	{  
	LinkedList<String> al=new LinkedList<String>();  
	al.add("sonu");  
	al.add("jyoti");  
	al.add("yashasri");  
	al.add("prachi");  
	Iterator<String> itr=al.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
}
}
