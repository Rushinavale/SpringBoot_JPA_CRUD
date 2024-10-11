package in.sp.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.main.Services.StudentService;
import in.sp.main.Services.StudentServiceIMPL;
import in.sp.main.entities.Student;

@SpringBootApplication
public class SpringBootJpaCrudApplication {

	public static void main(String[] args) {
		
	ApplicationContext context=	SpringApplication.run(SpringBootJpaCrudApplication.class, args);
	
	StudentService stdService =context.getBean(StudentServiceIMPL.class);
//--------------------------Insert  operation---------------------------------------	
//	Student st=new Student();
//	st.setName("vikraant jadhav");
//	st.setRollno(105);
//	st.setMarks(99.5f);
//	
//	boolean status=stdService.addStudentDetails(st);
//	
//	
//		System.out.println("Student data inserted succesfully");

	
//-------------------Select Operation---------------------------
//	List<Student> stdList= stdService.getAllStudent();
	
//	for(Student std : stdList)
//	{
//		System.out.println("ID: "+std.getId());
//		System.out.println("Name : "+std.getName());
//		System.out.println("rollno: "+ std.getrollno());
//		System.out.println("Marks: "+ std.getMarks());
//		
//		System.out.println("_____________________________________________");
//	}
	
//------------------select operation 2---------------------
//	
//	Student std=stdService.getStdDetails(2l);
//	System.out.println("ID: "+std.getId());
//	System.out.println("Name : "+std.getName());
//	System.out.println("rollno: "+ std.getRollno());
//	System.out.println("Marks: "+ std.getMarks());
	
//------------------update opration-------------------------------
	
//	stdService.updateStdDetails(1l, 70.5f);
//	System.out.println("Updated successfully");
	
//-----------------delete opration------------------------------------------
	stdService.deletestdDetails(1l);
	System.out.println("Deleted successfully");
	
		
		
	}

}
