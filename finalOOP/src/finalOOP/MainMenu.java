package finalOOP;

import java.util.*;

public class MainMenu extends FillInfo{
	static UserInput input = new UserInput();
	Scanner scan = new Scanner (System.in);
	
	public void init()
	{
	    while (true) {
	    	int userChoice;
	    	
	        mainAsk();
	        try {	//making sure that user choose one of the options
	        	userChoice = input.getUserChoice();
	            if (!(userChoice > 0 && userChoice < 4)) {
	                throw new IllegalArgumentException("invalid choice, please try agian and choose only between 1-3\n");
	            }
	            process(userChoice);
	        } catch (InputMismatchException e) {//for Scanner
	            System.out.println("invalid choice, please try agian and choose only between 1-3\n");
	            mainAsk();
	            userChoice = input.getUserChoice();
	            process(userChoice);
	        } catch (IllegalArgumentException e) {//for argument
	        	System.out.println(e.getMessage());
	            mainAsk();
	            userChoice = input.getUserChoice(); 
	            process(userChoice);
	        }
	    }

	}
	public static void mainAsk()
	{
		System.out.println("Welcome to our  system :) ");
		System.out.println("How can we help you? \n");
		System.out.println("1.listing the majors\n2.listing the subjects \n3.students marks,Avg \n");
	}
	
	public void process(int userChoice)
	{
		if (userChoice == 1)
		{
			printMajors();
		}
		else if (userChoice == 2)
		{
			int studentChooosen;
			try {//making sure the user choose a right choice
			System.out.println("which student you wanna get the subjects for");
			System.out.println(student11.studentName + " or " + student21.studentName);
			studentChooosen = scan.nextInt();
			if (!(studentChooosen > 0 && studentChooosen < 3))
			{
				throw new IllegalArgumentException("invalid choice, please try agian and choose only between 1-3\n");
			}
				printSubject(studentChooosen);
			} catch (InputMismatchException e)//this one for the non expected inputs such as strings...etc
			{
				System.out.println("invalid choice, please try agian and choose only between 1-3\n");
				System.out.println("which student you wanna get the subjects for");
				System.out.println(student11.studentName + " or " + student21.studentName);
				scan.nextLine(); //to clear the exception since it is used
				studentChooosen = scan.nextInt();
				printSubject(studentChooosen);
			} catch (IllegalArgumentException e)//this one for the out of range inputs
			{
				System.out.println(e.getMessage());
				System.out.println("which student you wanna get the subjects for");
				System.out.println(student11.studentName + " or " + student21.studentName);
				studentChooosen = scan.nextInt();
				printSubject(studentChooosen);
			}
		}
		else if (userChoice == 3)
		{
			int studentChooosen;
			try
			{
				System.out.println("which student you wanna list the subject 1 or 2");
				studentChooosen = scan.nextInt();
				if (!(studentChooosen > 0 && studentChooosen < 3))
				{
					throw new IllegalArgumentException("invalid choice, please try agian and choose only between 1-3\n");
				}
			
			print(studentChooosen);
			} catch (InputMismatchException e)//this one for the non expected inputs such as strings...etc
			{
				System.out.println("invalid choice, please try agian and choose only between 1-3\n");
				System.out.println("which student you wanna list the subject 1 or 2");
				scan.nextLine();
				studentChooosen = scan.nextInt();
				print(studentChooosen);
			} catch (IllegalArgumentException e)//this one for the out of range inputs
			{
				System.out.println(e.getMessage());
				System.out.println("which student you wanna list the subject 1 or 2");
				studentChooosen = scan.nextInt();
				print(studentChooosen);
			}
		}

	}
	
	public void printSubject(int studentChoosen)
	{
		if (studentChoosen == 1)
		{
			System.out.println(student11.subject + ", " + student12.subject + ", " + student13.subject);
		}
		else if (studentChoosen == 2)
		{
			System.out.println(student21.subject + ", " + student22.subject + ", " + student23.subject);
		}
	}
	public void print(String students[])
	{
		for (int i = 0; i < students.length; i++)
		{
			System.out.println(students[i]);
		}
	}
	public void print(int studentChoosen)
	{
		char avgChoice;
				
		if (studentChoosen  == 1)
		{	
			System.out.println("the student got  " + student11.mark + " in " + student11.subject);
			System.out.println("the student got  " + student12.mark + " in " + student12.subject);
			System.out.println("the student got  " + student13.mark + " in " + student13.subject);
		}
		else if (studentChoosen  == 2)
		{
			System.out.println("the student got  " + student21.mark + " in " + student21.subject);
			System.out.println("the student got  " + student22.mark + " in " + student22.subject);
			System.out.println("the student got  " + student23.mark + " in " + student23.subject);
		}
		
		System.out.println("would you to like to know the student's avarage? (y/n)");
		try {
		    avgChoice = scan.next().charAt(0);
		    if (!(avgChoice == 'y' || avgChoice == 'n')) {
		        throw new IllegalArgumentException("Invalid choice. Please try again");
		    }
		    if (avgChoice == 'y')
		    {
		        processAvg(studentChoosen);    
		    } 
		    else if (avgChoice == 'n')
		    {
		        System.out.println("Thanks for your experience!");
		        System.exit(0);
		    }
		} catch (InputMismatchException e)
		{
		    System.out.println(e.getMessage());
		    scan.nextLine();
		    avgChoice = scan.next().charAt(0);
		    
		    if (avgChoice == 'y')
		    {
		        processAvg(studentChoosen);
		    }
		    else if (avgChoice == 'n')
		    {
		        System.out.println("Thanks for your experience!");
		        System.exit(0);
		    }
		}	
	}
	public void processAvg(int studentChoosen)
	{
		if (studentChoosen  == 1)
		{
			//System.out.println("here i am 1");
			calcAvg(1);
		}
		else if (studentChoosen  == 2)
		{
			//System.out.println("here i am 2");
			calcAvg(2);
		}
	}
	
	@Override
	public void calcAvg(int studentChoosen)
	{
		//System.out.println("here i am Avg");
		double sum  = 0;
		if (studentChoosen == 1)
		{
			sum = student11.mark + student12.mark + student13.mark;
			student11.average = sum / 3;
			student12.average = sum / 3;
			student13.average = sum / 3;
			System.out.println("the student Avg is: " + student11.average);
		}
		else if (studentChoosen == 2)
		{
			sum = student21.mark + student22.mark + student23.mark;
			student21.average = sum / 3;
			student22.average = sum / 3;
			student23.average = sum / 3;
			System.out.println("the student Avg is: " + student21.average);
		}
				
	}
	
	public void printMajors()
	{
		System.out.println(studentList.get(0).studentMajor + ", " + studentList.get(3).studentMajor);
	}	
}
