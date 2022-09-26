package streams;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	public static List<Employee> getEmployees(){
		
		List<Employee> lst = new ArrayList<>();
		lst.add(new Employee(1,"sarath","ece",1200000));
		lst.add(new Employee(2,"jayakrishna","cse",700000));
		lst.add(new Employee(3,"naveen","bcom",400000));
		lst.add(new Employee(4,"swathi","ece",500000));
		
		return lst;
		
	}

}
