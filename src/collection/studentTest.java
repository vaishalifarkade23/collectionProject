package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class studentTest {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Student> list =new ArrayList<Student>();
		Student s1=new Student();
		s1.setId(1);
		s1.setName("prachi");
		s1.setEmail("vaishalifarkade143@gmail.com");
		Student s2=new Student();
		s2.setId(2);
		s2.setName("jyoti");
		s2.setEmail("jyoti@gmail.com");
		list.add(s1);
		list.add(s2);
		System.out.println("iterate using iterator interface");
		Iterator itr=list.iterator();
		
		while(itr.hasNext())
		{
			//System.out.println(itr.next());//next method return object
			Student s=(Student)itr.next();
			System.out.println("Student Id:"+s.getId()+"\nStudent Name:"+s.getName()+"\nStudent email:"+s.getEmail());
		}
		System.out.println("------------------------------------------------------------");
		System.out.println("iterate using forEach() method");
		list.forEach(s -> {
			System.out.println("Student Id:"+s.getId()+"\nStudent Name:"+s.getName()+"\nStudent email:"+s.getEmail());
		});
		System.out.println("------------------------------------------------------------");
		System.out.println("iterate using for loop");
		for(Student s:list){
			System.out.println("Student Id:"+s.getId()+"\nStudent Name:"+s.getName()+"\nStudent email:"+s.getEmail());
		}
		System.out.println("------------------------------------------------------------");
		System.out.println("iterate using forEachRemaining() method:");
		 Iterator<Student> itr1=list.iterator();  
        itr1.forEachRemaining(s ->{
        	System.out.println("Student Id:"+s.getId()+"\nStudent Name:"+s.getName()+"\nStudent email:"+s.getEmail());
        });
	}

}
