package Studentdemo;

import java.util.ArrayList;
import java.util.List;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentDetails> elist = new ArrayList<StudentDetails>();
		elist.add(new StudentDetails("tony","IMS","tony@gmail.com"));
		elist.add(new StudentDetails("Robert","IET","robert@gmail.com"));
		elist.add(new StudentDetails("john","IMS","john@gmail.com"));
	
		System.out.println(elist);
		for(StudentDetails s1:elist) {
			System.out.println(s1.getEname());
		}
	}
	 

}
