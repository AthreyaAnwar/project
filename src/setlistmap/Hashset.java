package setlistmap;
import java.util.*;

public class Hashset {
	public static void main(String[] args) {
	
		
		Set<Integer> l = new TreeSet<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(40);
		l.add(50);
		
		Set<Integer> a = new HashSet<>();
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(90);
		
		l.removeAll(a);
			System.out.println(l);
		
	}
}
