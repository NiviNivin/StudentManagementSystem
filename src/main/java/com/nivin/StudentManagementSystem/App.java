package com.nivin.StudentManagementSystem;

import java.util.Scanner;

import com.nivin.StudentManagementSystem.entity.Course;
import com.nivin.StudentManagementSystem.entity.Student;
import com.nivin.StudentManagementSystem.service.CourseService;
import com.nivin.StudentManagementSystem.service.StudentService;

public class App 
{
    public static void main( String[] args )
    {
       CourseService cs= new CourseService();
       StudentService ss =new StudentService();
       Scanner sc = new Scanner(System.in);
       //int choice = sc.nextInt();
       int ch;
       do {
    	   System.out.println("Welcome to Student Mananagement System");
    	   System.out.println("---------------------------------------");
    	   System.out.println("\nSelect Your Choice :");
    	   System.out.println("1 Student management \n2 Course management");
    	   ch = sc.nextInt(); 
    	   switch(ch) {
    	   case 1 :
    		   	   System.out.println("Student Management Portal");
    	   		   System.out.println("--------------------------");
    		   do {
    			   System.out.println("1 Add Student \n2 View Student \n3 View All Student"
    			   		+ " \n4 pay course fee" + "\n5 Delete student");
    			   int c1 = sc.nextInt();
    			   switch(c1) {
    			   case 1:
    				   	System.out.println("Enter new Student details");
    				   	System.out.println("Enter the Student id");
    				   	int sid = sc.nextInt();
    				   	System.out.println("Enter the Student name");
    				   	String sname = sc.next();
    				   	System.out.println("Enter the class");
    				   	int sclass = sc.nextInt();
    				  
    				   	//need to view all course
    				   	System.out.println("Select a course:");
    				   	
    				   	for(Course c: cs.viewAllCourse()) {
    	    				   System.out.println(c.getCourse_id()+" "+c.getCourse_name()+" "+c.getCourse_fee());
    	    				   }
    				   	System.out.println("Enter the course name");
    				   	String scourse = sc.next();
    				   	System.out.println("Enter the couse fee");
    				   	double sfee = sc.nextDouble();
    				   	System.out.println(ss.addStudent(new Student(sid,sname,sclass,scourse,sfee)));
    				   	break;
    			   case 2:
    				   System.out.println("Enter the Student id to search");
    				   sid = sc.nextInt();
    				   System.out.println(ss.viewStudent(sid));
    				   break;
    			   case 3:
    				   System.out.println("Viewing All Students");
    				   for(Student s: ss.viewAllStudent()) {
    				   System.out.println(s.getStud_id()+" "+s.getStud_name()+" "+s.getStud_class()+" "+s.getStud_course());
    				   }
    				   break;
    			   case 4:
    				   System.out.println("Fee payment Section");
    				   System.out.println("Enter the student id");
    				   sid = sc.nextInt();
    				   System.out.println("Enter the amount paying");
    				   sfee = sc.nextDouble();
    				   System.out.println(ss.payFees(sid, sfee));
    				   break;
    			   case 5:
    				   System.out.println("Deleting a student");
    				   System.out.println("Enter the student id");
    				   sid = sc.nextInt();
    				   System.out.println(ss.deleteStudent(sid));
    				   break;   
    			   }
    			   System.out.println();
    			   System.out.println("Would you like to continue? press '1' otherwise press '2'");
  					ch = sc.nextInt();
    			   
    		   }while(ch==1);
    		   break;
    	   
    	   case 2 : System.out.println("Course Management Portal");
    	   			System.out.println("-------------------------");
    	   
    		   do {
    			   System.out.println("1 Add Course \n2 View Course \n"
    			   		+ "3 View All Course \n4 Update Course \n5 Delete Course");
    			   int c1 = sc.nextInt();
    			   switch(c1) {
    			   case 1:
    				   System.out.println("Add new course");
    				   System.out.println("Enter the course id");
    				   int cid=sc.nextInt();
    				   System.out.println("Enter the course name");
    				   String cname=sc.next();
    				   System.out.println("Enter the course fee");
    				   double cfee=sc.nextDouble();
    				   System.out.println(cs.addCourse(new Course(cid, cname, cfee)));
    				   break;
    			   case 2:
    				   System.out.println("Enter the course id to view");
    				   cid=sc.nextInt();
    				   System.out.println(cs.viewCourse(cid));
    				   break;
    			   case 3:
    				   System.out.println("Viewing All course");
    				   for(Course c: cs.viewAllCourse()) {
    				   System.out.println(c.getCourse_id()+" "+c.getCourse_name()+" "+c.getCourse_fee());
    				   } break;
    			   case 4:
    				   System.out.println("Updating a course");
    				   System.out.println("Enter the course id to update");
    				   cid=sc.nextInt();
    				   System.out.println("Enter the new course fee");
    				   cfee =sc.nextDouble();
    				   System.out.println(cs.updateCourseFee(cid, cfee));
    				   break;  
    			   case 5:
    				   System.out.println("Deleting a course");
    				   System.out.println("Enter the course id for deletion");
    				   cid=sc.nextInt();
    				   System.out.println(cs.deleteCourse(cid));
    				   break;
    			   }
    			   System.out.println();
    			   System.out.println("Would you like to continue? press '2' otherwise press '1'");
  					ch = sc.nextInt();
    		   }while(ch==2);
    		   
    	   }  
    	   
       }while(ch == 1 || ch == 2 );
       
       
    }
}
