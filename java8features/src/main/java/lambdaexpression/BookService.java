package lambdaexpression;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
	
	public List<Book> getbooksinsort(){
		List<Book> lst = new BookDAO().getBooks();
		Collections.sort(lst, new MyComparator());

		return lst;
		
	}
	public static void main(String[] args) {
		System.out.println(new BookService().getbooksinsort());
	}
	
	class MyComparator implements Comparator<Book>{

		@Override
		public int compare(Book o1, Book o2) {
			
			return o1.getName().compareTo(o2.getName());
		}
		
	}

}
