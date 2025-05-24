package com.CodeAlpha.app;

import java.util.ArrayList;
import java.util.Scanner;
class Student{
	String name;
	int score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
public class CodeAlpha_StudentGradeTracker {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the number of students to be Enter : ");
			int noOfStudents=scan.nextInt();
			scan.nextLine();
			ArrayList<Student> studentsList = new ArrayList<>();
			for(int i=0;i<noOfStudents;i++) {
				System.out.println("Enter the name of Student number "+(i+1)+" : ");
				String name=scan.nextLine();
				System.out.println("Enter the score of "+name+" : ");
				int score=scan.nextInt();
				scan.nextLine();
				studentsList.add(new Student(name, score));
			}
			System.out.println("Student list with their score");
			displayGradSummary(studentsList);
			System.out.println("Average of All Students is :"+averageOfStudents(studentsList));
			System.out.println("Highest of All Students is :"+higestOfStudents(studentsList));
			System.out.println("Lowest of All Students is :"+lowestOfStudents(studentsList));
		}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}
	public static void displayGradSummary(ArrayList<Student> studentsList) {
		// TODO Auto-generated method stub
		for(Student student : studentsList) {
			System.out.println(student.getName() +" : "+student.getScore());
		}
		
	}
	public static float averageOfStudents(ArrayList<Student> e) {
		float sum=0;
		for(Student stu : e) {
			sum=sum+stu.getScore();
		}
		float avg=(sum/e.size());
		return avg;
	}
	public static float higestOfStudents(ArrayList<Student> e) {
		int higestScor=Integer.MIN_VALUE;
		for(Student stu : e) {
			if (stu.getScore()>higestScor) {
				higestScor=stu.getScore();
			}
		}
		return higestScor;
	}
	public static float lowestOfStudents(ArrayList<Student> e) {
		int lowestScor=Integer.MAX_VALUE;
		for(Student stu : e) {
			if (stu.getScore()<lowestScor) {
				lowestScor=stu.getScore();
			}
		}
		return lowestScor;
	}

}
