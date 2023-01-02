package com.nivin.StudentManagementSystem.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import com.nivin.StudentManagementSystem.entity.Course;

public class CourseServiceTest {
	
	private static CourseService cs= null;
	
	@Test
	public void testAddStudent() {
		assertEquals("Course added", cs.addCourse(new Course(1001,"JAVA", 15000.00)));
		assertEquals("Course added", cs.addCourse(new Course(1002,"C", 10000.00)));
	}
	@Test
	public void testViewCourse() {
		assertNotNull(cs.viewCourse(1001));
	}
	@Test
	public void testViewAllCourse() {
		assertNotNull(cs.viewAllCourse());
	}
	@Test
	public void testUpdateCourseFee() {
		assertNotNull(cs.updateCourseFee(1002, 16000.00));
	}
	@Test
	public void testDeleteCourse() {
		assertEquals("Course Deleted", cs.deleteCourse(1002));
	}
	@BeforeClass
	public static void beforeAll(){
		cs = new CourseService();
	}
}
