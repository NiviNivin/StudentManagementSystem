package com.nivin.StudentManagementSystem.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;


import com.nivin.StudentManagementSystem.entity.Student;
import com.nivin.StudentManagementSystem.service.StudentService;
import com.nivin.StudentManagementSystem.entity.Student;
public class StudentServiceTest {
	
	private static StudentService ss= null;
	@Test
	public void testAddStudent() {
		assertEquals("New Student added", ss.addStudent(new Student(101,"Ram", 10,"JAVA", 15000.00)));
		assertEquals("New Student added", ss.addStudent(new Student(102,"Roy", 10,"C", 10000.00)));
	}
	@Test
	public void testViewStudent() {
		assertNotNull(ss.viewStudent(101));
	}
	@Test
	public void testViewAllStudent() {
		assertNotNull(ss.viewAllStudent());
	}
	@Test
	public void testPayFees() {
		assertNotNull(ss.payFees(101, 15000.00));
	}
	@Test
	public void testDeleteStudent() {
		assertEquals("Student deleted", ss.deleteStudent(102));
	}
	@BeforeClass
	public static void beforeAll(){
		ss = new StudentService();
	}
}
