//Jeffery Tang
//APCS
//HW08 -- Greetings to 3 people
//2021-09-30

//DISCOVERIES:
//The space between the method name and the parameter(s) list is optional.
//Recalled that the "s" in "String" must be capitalized for it to be correctly recognized.
//UNRESOLVED QUESTIONS:
//Is it possible to run Java code without having to use "javac" every time the code is modified?

public class Greet{
	public static void main (String[] args) {
		greet("Mathias");
		greet("Mr. Mykolyk");
		greet("Sonic the Hedgehog");
	}
	public static void greet(String x) {
		System.out.println("Hey " + x + ", how are you doing today?");
	}
}
