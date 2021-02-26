package org.tcs;

//			Class name
public class CourseDetails {
	
	//	1.Type the method name, press ctrl+space bar
	
	//			method name
	private void javaCourse() {
		System.out.println("Java course");
	}
	
	// 2.Press ctrl+space bar,select the method from that options
	
	//			method name
	public void oracleCourse() {
		System.out.println("Oracle course");
	}
	
	private void apiCourse() {
		// TODO Auto-generated method stub
	}
	private void seleniumCourse() {
		System.out.println("Selenium");

	
	}
	
	public static void main(String[] args) {
		//object creation
		
		CourseDetails c=new CourseDetails();
		
		//Method calling
		
		c.javaCourse();
		c.oracleCourse();
	}

}
