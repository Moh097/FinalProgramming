package finalOOP;
import java.util.*;

public class FillInfo {

    List<Students> studentList;
    
	Students student11 = new Students();
	Students student12 = new Students();
	Students student13 = new Students();
	Students student21 = new Students();
	Students student22 = new Students();
	Students student23 = new Students();

    public FillInfo()
    {
    	studentList = new ArrayList<>();
    	fill();
    }
    public void fill()
    {
    	student11.studentId = 1;
        student12.studentId = 1;
        student13.studentId = 1;
        student11.studentName = "student1";
        student12.studentName = "student1";
        student13.studentName = "student1";
        student11.studentMajor = "Computer Science";
        student12.studentMajor = "Computer Science";
        student13.studentMajor = "Computer Science";  
        student11.subject = "Foc";
        student12.subject= "Programming";
        student13.subject = "Networking";
        student11.mark = 90;
        student12.mark = 95;
        student13.mark = 98;
        
        studentList.add(student11);
        studentList.add(student12);
        studentList.add(student13);

        student21.studentId = 2;
        student21.studentId = 2;
        student21.studentId = 2;
        student21.studentName = "student2";
        student22.studentName = "student2";
        student23.studentName = "student2";
        student21.studentMajor = "AI";
        student22.studentMajor = "AI";
        student23.studentMajor = "AI";
        student21.subject = "Foc";
        student22.subject = "Programming";
        student23.subject = "Networking";
        student21.mark = 93;
        student22.mark = 97;
        student23.mark = 90;
        
        studentList.add(student21);
        studentList.add(student22);
        studentList.add(student23);

    }
    
	public void calcAvg(int studentChoosen) {
		// TODO Auto-generated method stub
		//System.out.println("whatever");
		
	}

}
