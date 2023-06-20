package collection;

import java.util.*;

public class vectorDemo
{
	public static void main(String args[]){  
		Vector<String> v=new Vector<String>();  
		v.add("Maharashtra");  
		v.add("Gujrat");  
		v.add("Delhi");  
		v.add("telangane");  
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
		  

}
