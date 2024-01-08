import java.io.*;
import java.util.Scanner;


public class App {

	public static void main(String[] args) {
		Person pearson = new Person(22, "pearson");
		Person parson = new Person(23, "parson");
		Person piercesSon = new Person(27, "Pierce's Son");
		Person[] persons = {pearson, parson, piercesSon};
		People people = new People(persons);
		people.printPeople();
		
	}
}

class Person {
	int age;
	String name;
	
	Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	void printPerson() {
		System.out.println("Person named " + this.name + " is " + this.age + " years old.");
	}
}

class People {
	Person[] people;
	
	People(Person[] people) {
		this.people = people;
	}
	
	void printPeople() {
		for (Person p : people) {
			p.printPerson();
		}
	}
}



