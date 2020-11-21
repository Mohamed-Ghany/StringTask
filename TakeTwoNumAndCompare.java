import java.util.Scanner;

public class TakeTwoNumAndCompare {
//Requirement : Create program that take 2 names from User and print if they are equal or not 
	public static void main(String[] args) {
		
		String nameOne;   //create variable with name "nameOne"
		String nameOTwo;  //create variable with name "nameOTwo"
		
		Scanner enterName = new Scanner(System.in);  //create Scanner object
		
		System.out.println("Enter the 1st Name :");
		nameOne =enterName.next();
		
		System.out.println("Enter the 2bd Name :");
		nameOTwo =enterName.next();
		
		System.out.println("\nThe 1st Name Entered is :"+nameOne+"\nThe 2nd Name Entered is :"+nameOTwo); // print the 1st and 2nd names to be more clear
		
		System.out.println("\nIs 1st name = 2nd name ?"); //will use two comparison one if we haven't ignore case sensitive & other if we ignored it.
		boolean equal1 =nameOne.equals(nameOTwo);
		System.out.println(equal1);
		
		System.out.println("\nIs 1st name = 2nd name [ignoring case sensetive] ?"); //comparison in case we  ignore case sensitive 
		boolean equal2 = nameOne.equalsIgnoreCase(nameOTwo);
		System.out.println(equal2);
		
		enterName.close(); // To close the Scanner
	}
	
}
