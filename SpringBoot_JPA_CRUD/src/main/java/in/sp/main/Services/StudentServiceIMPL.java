package in.sp.main.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.Repository.StudentRepository;
import in.sp.main.entities.Student;

@Service
public class StudentServiceIMPL implements StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public boolean addStudentDetails(Student std) {
		boolean status=false;
		try {
			studentRepository.save(std);
			status=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			status=false;
		}
		return false;
	}

	@Override
	public List<Student> getAllStudent() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student getStdDetails(long id) {
	Optional<Student> optional=	studentRepository.findById(id);
	if(optional.isPresent())
	{
		return optional.get();
	}
	else {
		return null;
	}
	
	}

	@Override
	public boolean updateStdDetails(long id, float marks) {
		Student std=getStdDetails(id);
		if(std != null)
		{
			std.setMarks(marks);
			studentRepository.save(std);
			
			return true;
		}
		return false;
	}

	@Override
	public boolean deletestdDetails(long id) {
		boolean status=false;
		try {
			studentRepository.deleteById(id);
			status=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
}
