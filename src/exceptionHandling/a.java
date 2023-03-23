package exceptionHandling;

import org.openqa.selenium.grid.Main;

public class a {

	public static void main(String[] args) throws Exception {
		
			h();
		
	}
	public static void h() throws Exception {
		i();
		System.out.println(10/0);

		throw new Exception();
	}
	public static void i() {
		System.out.println("hello");
	}
}
