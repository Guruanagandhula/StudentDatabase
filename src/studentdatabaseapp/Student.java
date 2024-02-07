package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses="";
	private int tuitionBalance=0;
	private static int costOfCourse=600;
	private static int id=1000;
	
	//constructor
	public Student() {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Student Firstname:");
		this.firstName=in.nextLine();
		System.out.print("Enter Student Lastname:");
		this.lastName=in.nextLine();
		System.out.print("1.Freshmen \n2.Sophmore \n3.Junior \n4.Senior \nenter the Student Class level:");
		this.gradeYear=in.nextInt();
		setStudentID();
		//System.out.println(firstName+" "+lastName+ " "+ gradeYear+" "+studentID);
		
		
	}
	//generate id
	private void setStudentID() {
		//grade level + ID
		id++;
		this.studentID = gradeYear+""+id;
	}
	
	//enroll in courses
	public void enroll() {
		//get inside loop
		while(1!=0) {
			System.out.print("Enter course to enroll(0 to quit) : ");
			Scanner in=new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q") ){
				courses=courses+"\n "+ course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else break;
			}
		
		//System.out.println("Enrolled in: " + courses );
		System.out.println("Tuition Balance: " +tuitionBalance);
	}
	//view balance 
	public void viewBalance() {
		// TODO Auto-generated method stub
		System.out.println("Your Balance is : $" +tuitionBalance);
	}
	
	//and pay tuition
	public void payTuition() {
		System.out.print("Enter Your payment: $");
		Scanner in=new Scanner(System.in);
		int payment=in.nextInt();
		
		tuitionBalance =tuitionBalance- payment;
		System.out.println("Thank you for your payment of: $"+payment);
		viewBalance();
	}
	//show status
	public String toString() {
		// TODO Auto-generated method stub
		return "Name : " +firstName + " " +lastName+
				"\nGrade Level:"+gradeYear+
				"\nStudent ID:"+studentID+
				"\nCourses Enrolled:"+courses+
				"\nBalance: $"+tuitionBalance;
		
	}
	
}
