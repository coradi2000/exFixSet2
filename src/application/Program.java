package application;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Course;

public class Program {

	public static void main(String[] args) throws IOException {


		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("How many students for course A? ");
		int students = sc.nextInt();
		
		Set<Course> setA = new HashSet<>();
		for (int i=0; i < students; i++) {
			int id = sc.nextInt();
			setA.add(new Course(id));
			
		}
		
		System.out.print("How many students for course B? ");
		students = sc.nextInt();
		
		Set<Course> setB = new HashSet<>();
		for (int i=0; i < students; i++) {
			int id = sc.nextInt();
			setA.add(new Course(id));
			
		}
		
		System.out.print("How many students for course C? ");
		students = sc.nextInt();
		
		Set<Course> setC = new HashSet<>();
		for (int i=0; i < students; i++) {
			int id = sc.nextInt();
			setC.add(new Course(id));
			
		}
		
		Set<Course> total = new HashSet<>(setA);
		total.addAll(setB);
		total.addAll(setC);
		System.out.println("Total users: " + total.size());
		sc.close();

	}

}


