package in.sp.main.Services;

import java.util.List;

import in.sp.main.entities.Student;

public interface StudentService {
	
	public boolean addStudentDetails(Student std);
	
	public List<Student> getAllStudent();
	
	public Student getStdDetails(long id);
	
	public boolean updateStdDetails(long id, float marks);
	
	public boolean deletestdDetails(long id);

}
