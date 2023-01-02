package com.nivin.StudentManagementSystem.service;

import java.util.ArrayList;


import com.nivin.StudentManagementSystem.entity.Course;

public class CourseService {
	static ArrayList<Course> courselist = new ArrayList<Course>();
	
	public String addCourse(Course c) {
		try {
			courselist.add(c);
			return "Course added";
		}catch (Exception e) {
			return "Something wrong";
		}
	}
	
	public static Course getCourse(String course_name) {
		try {
			for(Course c:courselist) {
				if(c.getCourse_name().equalsIgnoreCase(course_name)) {
					return c;
				}
			}
		}catch (Exception e) {
			return null;
		}
		return null;
	}
	public Course viewCourse(int Course_Id) {
		try {
			for (Course c:courselist) {
				if (c.getCourse_id() == Course_Id) {
					return c;
				}
			}
		} catch (Exception e) {
			return null;
		}
		return null;
	}
	
	public ArrayList<Course> viewAllCourse(){
		try {
			return courselist;
		}catch (Exception e) {
			return null;
		}
	}
	public String updateCourseFee(int course_id, double new_course_fee) {
		try {
			for (Course c : courselist) {
				if (c.getCourse_id() == course_id) {
					
					c.setCourse_fee(new_course_fee);
					return "Course fee Updated";
				}
			}
			return "Invalid Course ID";
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public String deleteCourse(int course_id) {
		try {
			for (Course c : courselist) {
				if (c.getCourse_id() == course_id) {
					courselist.remove(c);
					return "Course Deleted";
				}
			}
			return "Invalid Course ID";
		}catch(Exception e) {
			return "Something Wrong";
		}
	}
	
}
