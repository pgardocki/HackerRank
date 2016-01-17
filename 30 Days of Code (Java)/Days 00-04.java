//////////////////////// Day 0: Print Hello World!

public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World." + "\n" + "Welcome to 30 Days of Code.");
  }
}

//////////////////////// Day 1: Data Types!

public class DataTypesPractice {

    public static void main(String[] args) {
        System.out.println("Primitive : double");
        System.out.println("Primitive : char");
        System.out.println("Primitive : boolean");
        System.out.println("Primitive : int");
        System.out.println("Referenced : String");
        System.out.println("Primitive : boolean");
        System.out.println("Primitive : double");
        System.out.println("Primitive : char");
        System.out.println("Referenced : String");
    }
}

//////////////////////// Day 2: Arithmetic!

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class Arithmetic {

    public static void main(String[] args) {
    
      Scanner sc = new Scanner(System.in);
      double M = sc.nextDouble(); // original meal price
      int T = sc.nextInt();       // tip percentage
      int X = sc.nextInt();       // tax percentage
      
      double tip = (M * T) / 100;
      double tax = (M * X) / 100;
      int total = (int) Math.round(M + tip + tax);
      
      System.out.println("The final price of the meal is $" + total + ".");
    }
}

//////////////////////// Day 3: If-Else Statements!

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();            
        String ans = "";
        if (n % 2 == 1) ans = "Weird";
        else
        {
           if (n >= 2 && n <= 5) ans = "Not Weird";
           else if (n >= 6 && n <= 20) ans = "Weird";
           else 
           {
               ans = "Not Weird";
           }
        }
        System.out.println(ans);
    }
}

//////////////////////// Day 4: Logical Operators + Class vs. Instance!

public class Person {
  
    int age;	

	public Person(int initial_Age) {
  		
        if (initial_Age < 0) {
            this.age = 0;
            System.out.println("This person is not valid, setting age to 0.");
        } else {
            this.age = initial_Age;
        }
	}

	public void amIOld() {
  		
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
	}

	public void yearPasses() {
  		// Increment the age of the person in here
        this.age++;
	}