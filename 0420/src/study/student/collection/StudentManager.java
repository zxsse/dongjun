package study.student.collection;

import java.util.HashSet;



public class StudentManager 
{
	private HashSet<Student> hs;
	
	
	
	public StudentManager()
	{
		hs = new HashSet<Student>();
		
	
	}
	
	public void insert(Student std)
	{
		
		hs.add(std);
		
	}
	public void print()
	{
		for(Student tmp:hs)
		{
			
			System.out.println(tmp);
		}
	}

	public void deleate(Student student) {
		// TODO Auto-generated method stub
		
	}
	
	public void modify(Student std)
	{
		if(hs.remove(std))
			hs.add(std);
		
	}
	

	
	






}
