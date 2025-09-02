package com.Project.autowired.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class One {
//@Autowired  // field injection
//	Two ob;

//   @Autowired //method level injection 
//	public void setTwo(Two ob) {
//		this.ob=ob;
//	}
//   @Autowired// constructor injection 
//   public One(Two ob) {
//	   this.ob=ob; 
//   }
   @Autowired
   ConfigurationExample ob;
	public void view() {
		System.out.println(ob.a);
	}
	
	

}
