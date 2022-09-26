package functionalinterfaces;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {
	public static List<Student> getAllStudents(){
		
		Student student1 = new Student("sarath",2,3.6,"male",Arrays.asList("cricket","footboll","tabletennis"));
		Student student2 = new Student("ajay",3,4.5,"male",Arrays.asList("chess","shuttle","cricket"));
		Student student3 = new Student("mounika",3,3.9,"female",Arrays.asList("badminton","vollyboll","soccer"));
		
		List<Student> students = Arrays.asList(student1,student2,student3);
		
		
		
		return students;
		
	}

}
