package First;

import java.util.ArrayList;
import java.util.Scanner;

public class MyStudentApp {
	static Scanner getvalue = new Scanner(System.in);

	static ArrayList<Student> listOfStudent = new ArrayList<>();

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
			menu();
			break;
		case 4:
			delete();
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
		if (answer.equals("no")) {
			System.out.println("thanks for adding details");
			menu();
		} else {
			addStudent();
		}
	}

	public static void show() {
		for (Student stu : listOfStudent) {
			System.out.println(stu);

		}
	}

	public static void update() {
		Student student1 = new Student();
		System.out.println("Enter the student name you want to make changes");
		String cname = getvalue.next();

		for (int i = 0; i < listOfStudent.size(); i++) {

			if (cname.equals(listOfStudent.get(i).getName())) {
				System.out.println("name matched");
				System.out.println(listOfStudent.get(i));
				System.out.println("Enter name");
				student1.setName(getvalue.next());
				System.out.println("Enter age");
				student1.setAge(getvalue.nextInt());
				System.out.println("Enter score");
				student1.setScore(getvalue.nextInt());
				listOfStudent.set(i, student1);
				menu();
			}

		}
	}

	public static void delete() {
		Student student2 = new Student();
		System.out.println("Enter the student name you want to delete");
		String sname = getvalue.next();

		for (int i = 0; i < listOfStudent.size(); i++) {
			if (sname.equals(listOfStudent.get(i).getName())) {
			listOfStudent.remove(i);
			menu();
			
		}
			}
		}
	

	public static void main(String[] args) {
		// MyStudentApp student =new MyStudentApp();
		menu();

	}

}
