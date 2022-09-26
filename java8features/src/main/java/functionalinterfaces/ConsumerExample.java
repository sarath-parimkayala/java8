package functionalinterfaces;


import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	
	public static void printlist() {
		Consumer<Student> c2 = (student) -> System.out.println(student);
		List<Student> studentlist = StudentDatabase.getAllStudents();
		studentlist.forEach(c2);
	}
	
	public static void printNameandActivities() {
		Consumer<Student> c3 = (student)->System.out.print(student.getName());
		Consumer<Student> c4 = (student)->System.out.println(student.getActivities());
		List<Student> studentlist = StudentDatabase.getAllStudents();
		studentlist.forEach(c3.andThen(c4));
	}

	public static void main(String[] args) {
		Consumer<String> c1 = (s) ->System.out.println(s.toUpperCase());
		c1.accept("java8 expert sarath");
		printlist();
		printNameandActivities();
		

	}

}
