package com.nivin.StudentManagementSystem.entity;

public class Student {
	private int stud_id;
	private String stud_name;
	private int stud_class;
	private String stud_course;
	private double fee_balance;
	
	
	public Student(int stud_id, String stud_name, int stud_class, String stud_course, double fee_balance) {
		super();
		this.stud_id = stud_id;
		this.stud_name = stud_name;
		this.stud_class = stud_class;
		this.stud_course = stud_course;
		this.fee_balance = fee_balance;
	}
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public int getStud_class() {
		return stud_class;
	}
	public void setStud_class(int stud_class) {
		this.stud_class = stud_class;
	}
	public String getStud_course() {
		return stud_course;
	}
	public void setStud_course(String stud_course) {
		this.stud_course = stud_course;
	}
	public double getFee_balance() {
		return fee_balance;
	}
	public void setFee_balance(double fee_balance) {
		this.fee_balance = fee_balance;
	}
	@Override
	public String toString() {
		return "Student Details \nid=" + stud_id + "\nname=" + stud_name + "\nclass=" + stud_class
				+ "\ncourse name =" + stud_course + "\nbalance fee =" + fee_balance ;
	}
	
}
