package program;

public class Sigin implements Login {

	public void username() {
		System.out.println("Anwar");
	}

	@Override
	public void password() {
	System.out.println("12345");
	}

	public static void main(String[] args) {
		Sigin a = new Sigin();
		a.username();
		a.password();
	}
}
