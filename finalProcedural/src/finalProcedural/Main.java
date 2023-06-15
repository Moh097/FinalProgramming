package finalProcedural;
import java.util.*;

public class Main {
	//initialize global variables to make all of the functions able to read it
	public static int userChoice;
	public static String[] students = {"student1", "student2"};
	public static String[] majors = {"computer science", "AI"};
	public static String[] subjects = {"Foc", "programming", "networking"};
	public static double[] marks1 = {90,95,85};
	public static double[] marks2 = {90,95,97};
	
	public static void main(String[] args) {

		while (true)
		{
			init();
		}
	}	
	
	public static void init()
	{
		mainAsk();
		choice();
		process(userChoice);
	}
	public static void mainAsk()
	{
		System.out.println("Welcome to our  system :) ");
		System.out.println("How can we help you? \n");
		System.out.println("1.listing the majors\n2.listing the subjects \n3.students marks,Avg \n");
	}
	public static int choice()
	{
		System.out.println("Please enter your choosen ask: ");
		Scanner scan = new Scanner(System.in);
		userChoice = scan.nextInt();
		return userChoice;
	}
	public static void process(int userChoice)
	{
		if (userChoice == 1)
		{
			printMajors(majors);
		}
		else if (userChoice == 2)
		{
			printSubject(subjects);
		}
		else if (userChoice == 3)
		{
			printMarks(students,subjects, marks1, marks2);
		}
		else
		{//catching exceptions
			System.out.println("invalid input, please choose between 1-3 \n");
			init();
		}

	}
	public static void printMajors(String majors[])
	{
		for (String major : majors)
		{
			System.out.print(major + " ");
		}
		System.out.println("");
	}
	public static void printSubject(String subjects[])
	{
		for (String subject : subjects)
		{
			System.out.print(subject + " ");
		}
		System.out.println("\n");
	}
	public static void printMarks(String students[],String subjects[], double marks1[], double marks2[])
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("we have " + students.length + " students which one you wanna print marks for? ");
		printStudents(students);
		
		int marksChoice = scan.nextInt();
		
		if (marksChoice  == 1)
		{
			for (int i = 0; i < marks1.length; i++)
			{
				System.out.println("the student got  " + marks1[i] + " in " + subjects[i]);
			}
			processAvg(marksChoice);
		}
		else if (marksChoice  == 2)
		{
			for (int i = 0; i < marks2.length; i++)
			{
				System.out.println("the student got  " + marks2[i] + " in " + subjects[i]);
			}
			processAvg(marksChoice);
		}
		else 
		{//catching exceptions
			System.out.println("invalid input, please choose between 1-3 \n");
			printMarks(students,subjects, marks1, marks2);
			
		}
		
		
	}
	public static void processAvg(int marksChoice)
	{
		char avgChoice;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("would you to like to know the student's avarage? (y/n)");
		avgChoice = scan.next().charAt(0);
		//System.out.println("here i am " + avgChoice);
		if (avgChoice == 'y' && marksChoice == 1)
		{
			//System.out.println("here i am 1");
			calcAvg(marks1);
		}
		else if (avgChoice == 'y' && marksChoice == 2)
		{
			//System.out.println("here i am 2");
			calcAvg(marks2);
		}
		else if (avgChoice == 'n')
		{
			//System.out.println("here i am n");
			System.out.println("thanks for your experience! ");
			System.exit(0);
		}
		else 
		{
			System.out.println("invalid input, please choose (y/n) \n");
			processAvg(marksChoice);
			
		}
	}
	public static void printStudents(String students[])
	{
		for (int i = 0; i < students.length; i++)
		{
			System.out.println(students[i]);
		}
	}
	public static void calcAvg(double marks[])
	{
		//System.out.println("here i am in calcAvg " + marks[0]);
		double sum  = 0;
		double avg;
		for (int i = 0; i<4;i++)
		{
			sum = sum + marks[i];
		}
		avg = sum / marks.length;
		
		System.out.println("the student Avg is: " + avg);
	}
	
}
