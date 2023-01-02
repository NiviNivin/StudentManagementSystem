package com.nivin.StudentManagementSystem.entity;

public class Course {
		private int course_id;
		private String course_name;
		private double course_fee;
		
		public Course(int course_id, String course_name, double course_fee) {
			super();
			this.course_id = course_id;
			this.course_name = course_name;
			this.course_fee = course_fee;
		}
		public int getCourse_id() {
			return course_id;
		}
		public void setCourse_id(int course_id) {
			this.course_id = course_id;
		}
		public String getCourse_name() {
			return course_name;
		}
		public void setCourse_name(String course_name) {
			this.course_name = course_name;
		}
		public double getCourse_fee() {
			return course_fee;
		}
		public void setCourse_fee(double course_fee) {
			this.course_fee = course_fee;
		}
		@Override
		public String toString() {
			return "Course id=" + course_id + ", Course name=" + course_name + ",Course fee=" + course_fee ;
		}
		
}
