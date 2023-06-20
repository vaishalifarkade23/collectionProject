package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class sortInAscending {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<String> l=new ArrayList<String>();
		l.add("prachi");
		l.add("jyoti");
		l.add("aarti");
		l.add("pinky");
		String temp="";
		for(int i=0;i<l.size()-1;i++)
        {
        	for(int j=0;j<l.size();j++)
        	{
        		if(l.get(i).compareTo(l.get(j))<0)
        		{
        			temp=l.get(i);
        			l.set(i,l.get(j));
        			l.set(j, temp);
        		}
        	}
        }
		Iterator itr=l.iterator(); 
		{
			while(itr.hasNext())
			{
				System.out.println(""+itr.next());
			}
		}
	}

}
