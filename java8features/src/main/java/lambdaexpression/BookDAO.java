package lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	public List<Book> getBooks(){
		List<Book> lt = new ArrayList<>();
		lt.add(new Book(100,"sarath",300));
		lt.add(new Book(102,"jayakrishna",500));
		lt.add(new Book(130,"naveeen",400));
		
		return lt;
	}

}
