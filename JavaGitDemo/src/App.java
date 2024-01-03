import java.io.*;
import java.util.Scanner;


public class App {

	public static void main(String[] args) {
		// program to take input in fahrenheit and convert to celcius
		double f, c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit:");
		f = scan.nextDouble();
		c = (5.0/9.0)*(f-32);
		System.out.println(c);
	}

}
