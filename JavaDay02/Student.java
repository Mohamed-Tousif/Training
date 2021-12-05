package com.sonata;

public class Student {
	
			int stdId;
			String stdName;
			String stdClass;
			
			
			public void display() {
				System.out.println("Student Id :"+stdId);
				System.out.println("Student Name:"+stdName);
				System.out.println("Student class:"+stdClass);
			}

		public static void main(String[] args) {
			Student b1 = new Student();
			Student b2 = new Student();
			
			b1.stdId=123;
			b1.stdName="Name 1";
			b1.stdClass="First";
			
			b2.stdId=456;
			b2.stdName="Name 2";
			b2.stdClass="Second";
			
			b1.display();
			b2.display();
		}

	}


