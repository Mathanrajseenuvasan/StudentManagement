package First;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyStudentApp {
	static Scanner getvalue = new Scanner(System.in);

	static List<Student> listOfStudent = new ArrayList<>();

	public static void menu() {
		System.out.println("1.Add \n2.Update \n3.show \n4.Delete");

		int value = getvalue.nextInt();

		switch (value) {
		case 1:
			System.out.println("Welcome to add Student Details");
			addStudent();
			break;
		case 2:
			update();
			break;
		case 3:
			System.out.println("Show all Student Details");
			show();
			break;
		default:
			System.out.println("I AM DEFAULT...!!!");
		}
	}

	    static void addStudent() {
		Student student = new Student();
		System.out.println("Enter student name : ");
		student.setName(getvalue.next());
		System.out.println("Enter Student age:");
		student.setAge(getvalue.nextInt());
		System.out.println("Enter your score");
		student.setScore(getvalue.nextInt());
		listOfStudent.add(student);
		System.out.println(listOfStudent.size());
		add();
	}
	
	    static void add() {
		System.out.println("Do you want to add another student then pressn yes");
		String answer = getvalue.next();
		if(answer.equals("no")) {
			System.out.println("thanks for adding details");
		}else {
		menu();
		}
	}

	public static void show() {
		for (Student xxx : listOfStudent) {
			System.out.println(xxx.toString());
			System.out.println(xxx.toString());
			System.out.println(xxx.getName());
			
		}
	}
	
	public static void update() {
		Student student1 = new Student();
		System.out.println("Enter the student name you want to make changes");
		String cname = getvalue.next();
		if (cname == student1.getName()) {
			System.out.println("name matched");
			}
		
	
	}
	public static void delete() {
		
		
	}

	public static void main(String[] args) {
		// MyStudentApp student =new MyStudentApp();
		menu();

	}

}
