package eventDriven;
import java.util.*;
public class MainMenu extends fillInfo{
	Scanner scan = new Scanner (System.in);
	
	public String printMajors()
	{
		//GUI text = new GUI();	
		StringBuilder s = new StringBuilder();
		s.append("1." + studentList.get(0).studentMajor + "\n" + "2." + studentList.get(3).studentMajor);
		String string = s.toString();
		
		return string;
	}
	public String print(int studentChoosen)
	{
		String string = "";
		if (studentChoosen == 1)
		{
			StringBuilder s = new StringBuilder();
			s.append("1." + student11.subject + "\n" + "2." + student12.subject + "\n" + "3." + student13.subject);
			string = s.toString();
		}
		else if (studentChoosen == 2)
		{
			StringBuilder s = new StringBuilder();
			s.append("1." + student21.subject + "\n" + "2." + student22.subject + "\n" + "3." + student23.subject);
			string = s.toString();
			
		}
		return string;
	}
	
	public String printMarks(int studentChoosen)
	{
		String string = "";
		StringBuilder s = new StringBuilder();
		if (studentChoosen  == 1)
		{	
			s.append("the student got  " + student11.mark + " in " + student11.subject + "\n" + "the student got  " + student12.mark + " in " + student12.subject + "\n" + "the student got  " + student13.mark + " in " + student13.subject);
			string = s.toString();
		}
		else if (studentChoosen  == 2)
		{
			s.append("the student got  " + student21.mark + " in " + student21.subject + "\n" + "the student got  " + student22.mark + " in " + student22.subject + "\n" + "the student got  " + student23.mark + " in " + student23.subject);
			string = s.toString();
		}
		
		return string;
	}
	public String print(String students[])
	{
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < students.length; i++)
		{
			s.append(students[i]);
		}
		
		String string = s.toString();
		return string;
	}
	
	@Override
	public double calcAvg(int studentChoosen)
	{
		double sum  = 0;
		double finalAvg = 0;
		if (studentChoosen == 1)
		{
			sum = student11.mark + student12.mark + student13.mark;
			student11.average = sum / 3;
			student12.average = sum / 3;
			student13.average = sum / 3;
			finalAvg = student13.average = sum / 3;
		}
		else if (studentChoosen == 2)
		{
			sum = student21.mark + student22.mark + student23.mark;
			student21.average = sum / 3;
			student22.average = sum / 3;
			student23.average = sum / 3;
			finalAvg = student23.average = sum / 3;
		}
				return finalAvg;
	}	
	
}
