package streams;

import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Taxservice {
	
	public static List<Employee> getTaxpayers(String input){
		 return (input.equalsIgnoreCase("tax")) ?
		 Database.getEmployees().stream().filter(t -> t.getSalary()>500000).collect(Collectors.toList())
		:
			 Database.getEmployees().stream().filter(t -> t.getSalary()<=500000).collect(Collectors.toList());


		
	}
	public static void main(String[] args) {
		System.out.println(getTaxpayers(" non tax"));
	}

}
