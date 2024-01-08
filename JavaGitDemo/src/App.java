import java.io.*;
import java.util.Scanner;


public class App {

	public static void main(String[] args) {
		System.out.println(Thing.numberOfThings);
		Thing thing1 = new Thing(22);
		System.out.println(thing1.age);
		System.out.println(Thing.numberOfThings);
		Thing thing2 = new Thing(24);
		System.out.println(thing2.age);
		System.out.println(Thing.numberOfThings);
		
	}
}

class Thing {
	public static int numberOfThings;
	public int age;
	
	Thing(int age) {
		this.age = age;
		numberOfThings++;
	}
}
