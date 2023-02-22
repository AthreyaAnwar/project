package program;

public class Task1 {
public static void main(String[] args) {
	String s = "Java is a Programming Language";  
	int c =0;
	for (int i = 0; i < s.length(); i++) {
	if(s.charAt(i)=='a') {
		c++;
		System.out.println(i);
	}
	}
	System.out.println(c);
	 
	  }
}


