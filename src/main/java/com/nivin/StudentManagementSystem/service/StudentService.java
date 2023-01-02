package com.nivin.StudentManagementSystem.service;

import java.util.ArrayList;
import java.util.List;

//import com.nivin.EmployeeManagementSystem.entity.Employee;
import com.nivin.StudentManagementSystem.entity.Student;

public class StudentService {
		static ArrayList<Student> studList = new ArrayList<Student>();
		
		public String addStudent(Student s) {
			try {
				studList.add(s);
				return "New Student added";
			}catch (Exception e) {
				return "Something wrong";
			}
			
		}
		public Student viewStudent(int studId) {
			try {
				for(Student s:studList) {
					if(s.getStud_id()==studId) {
						return s;
				}
			}
			}catch (Exception e) {
				return null;
			}
			System.out.println("no student found");
			return null;	
		}
		
		//view all student without array list
//		public Student viewAllStudent() {
//			try {
//				for(Student s: studList) {
//					return s;
//				}
//			}catch (Exception e) {
//				return null;
//			}
//			return null;
//		}
		public List<Student> viewAllStudent() {
			try {
				return studList;
			} catch (Exception e) {
				return null;
			}
		}
		double balance_to_pay;
		 public String payFees(int sid, double pay) {
			 try {
				 for(Student s: studList) {
					 if(s.getStud_id()==sid) {
						 if(s.getFee_balance() > pay) {
							 balance_to_pay = s.getFee_balance() - pay;
							 s.setFee_balance(balance_to_pay);
							 return "fee paid \nDues for payment " + balance_to_pay;
						 }else if (s.getFee_balance() < pay){
							 balance_to_pay = (pay - s.getFee_balance());
							 s.setFee_balance(0);
							 return "fee paid full \nbalance refunded : " + balance_to_pay;
						 }else {
							 s.setFee_balance(0);
							 return "fee paid full";
						 }
					}
//					 else {
//						 return "not found";
//					 }
				 }
			 }catch (Exception e) {
				 return "Something wrong";
			}
			 return "Something wrong";
		 }
		 
		 public String deleteStudent(int sid) {
			 try {
				 for(Student s: studList) {
					 if(s.getStud_id()==sid) {
						 studList.remove(s);
						 return "Student deleted";
					 }
				 }
			 }catch (Exception e) {
				 return "invalid Student id";
			}
			 return "invalid operation";
		 }
		
}
