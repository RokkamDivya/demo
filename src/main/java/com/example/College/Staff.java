package com.example.College;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Staff implements Collage{
	@Autowired
	@Qualifier("student")
	private Collage ob;
	@Autowired
	@Qualifier("faculty")
	private Collage ob1;
	
	public void Clginfo() {
		System.out.println("I am Staff");
		ob.Clginfo();
		ob1.Clginfo();
		}
}
