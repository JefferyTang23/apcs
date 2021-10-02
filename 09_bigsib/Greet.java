//Roaring 20s: Jeffery Tang (Mathias), Jefford Shau (Dylan), Nada Hameed (Ray)
//APCS
//HW09 -- Big Sibs Greeting
//2021-10-2

//DISCOVERIES:
//Using the command "javac" on Greet.java creates the file "BigSib.class"
//Using "java Greet" after deleting "BigSib.class" returns an error message
//UNRESOLVED QUESTIONS:
//Is a java file able to call a method from another java file that calls a method from yet another java file?

public class Greet{
	public static void main (String[] args) {
		BigSib.greet("Flim");
    	BigSib.greet("Flam");
    	BigSib.greet("Kazaam");
	}
}