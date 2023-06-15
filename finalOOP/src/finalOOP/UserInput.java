package finalOOP;
import java.util.Scanner;

public class UserInput extends FillInfo{
	
	private static int userChoice;
	private static char avgChoice;
	private static int marksChoice;
	
	UserInput()
	{
		this.userChoice = userChoice;
		this.avgChoice = avgChoice;
		this.marksChoice = marksChoice;
	}
	UserInput(char avgChoice)
	{
		this.avgChoice = avgChoice;
	}
	private static int userChoiceInput()
	{
		Scanner scan  = new Scanner(System.in);
		userChoice = scan.nextInt();
		return userChoice;
	}
	private static char avgChoiceInput()
	{
		Scanner scan  = new Scanner(System.in);
		avgChoice = scan.next().charAt(0);
		return avgChoice;
	}
	private static int marksChoiceInput()
	{
		Scanner scan  = new Scanner(System.in);
		marksChoice = scan.nextInt();
		return marksChoice;
	}
	public int getUserChoice() {
		
		return userChoiceInput();
	}
	
	public char getAvgChoice() {
		return avgChoiceInput();
	}
	
	public int getMarksChoice() {
		return marksChoiceInput();
	}
	
}
