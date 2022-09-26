package functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {
	
	static Predicate<Integer> p1 = (s)->{return s%2==0;};
	 static Predicate<Integer> p2 = (s)->s%2==0;

	public static void main(String[] args) {
		

	System.out.println(p2.test(5));
	System.out.println(p1.and(p2).test(10));
	}
	
}
