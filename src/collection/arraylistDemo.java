package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylistDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("Nagpur");
		list.add("Pune");
		list.add("Mumbai");
		list.add("Nagpur");
	    System.out.println("size of list is:"+list.size());
		//Traversing list through Iterator  
        Iterator itr=list.iterator();//iterator is interface
        while(itr.hasNext())
        {
        	System.out.println(""+itr.next());
        }
        System.out.println("--------------------");
        //get the element of 0th position
        System.out.println("use of get method:"+list.get(0));
        System.out.println("--------------------");
      //to add element on 3 index position
        list.add(3,"Chandrapur");//to add element on 3 index position
        Iterator itr1=list.iterator();
        while(itr1.hasNext())
        {
        	System.out.println(""+itr1.next());
        }
        System.out.println("--------------------");
       //to remove element on 3 index position
        System.out.println("to remove element from index pos:" +list.remove(4));
        System.out.println("to remove element from index pos:" +list.remove("Chandrapur"));//object can also write
        
        System.out.println("size of list is:"+list.size());
        Iterator itr2=list.iterator();
        while(itr2.hasNext())
        {
        	System.out.println(""+itr2.next());
        }
	}

}
