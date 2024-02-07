package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//ask how many students
		System.out.print("Eneter the number of new Students to enroll:");
		Scanner in=new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students=new Student[numOfStudents];
		
		//create number of students
		for(int n=0;n<numOfStudents;n++) {
			students[n] =new Student();
			students[n].enroll();
			students[n].payTuition();
			
		}
		for(int n=0;n<numOfStudents;n++) {
			System.out.println(students[n].toString());
		}

	}

}
