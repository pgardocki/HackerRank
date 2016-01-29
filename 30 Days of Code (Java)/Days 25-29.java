//////////////////////// Day 25: Running Time and Complexity!

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    for (int i = in.nextInt(); i > 0; i--) {
      int toCheck = in.nextInt();
      String prime = isPrime(toCheck) ? "Prime" : "Not prime";
      System.out.println(prime);
    }
  }
  
  static boolean isPrime(int num) {
    if (num == 2) return true;
    if (num <= 1 || num % 2 == 0) return false;    
    
    double i = Math.sqrt(num);
    for (int j = 3; j <= i; j += 2) {
      if (num % j == 0) return false;
    }
    return true;
  }
}

//////////////////////// Day 26: Testing Part I + Implementations!

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  public static void main(String[] args) {
    // Calculate Library Late Fees
    Scanner in = new Scanner(System.in);
    
    int userReturnDay = in.nextInt();
    int userReturnMonth = in.nextInt();
    int userReturnYear = in.nextInt();
    
    int libraryDueDay = in.nextInt();
    int libraryDueMonth = in.nextInt();
    int libraryDueYear = in.nextInt();
    
    if (libraryDueYear - userReturnYear < 0) {
      System.out.println("10000");
    } else if (libraryDueMonth - userReturnMonth < 0) {
      int fine = (userReturnMonth - libraryDueMonth) * 500;
      System.out.println(fine);
    } else if (libraryDueDay - userReturnDay < 0) {
      int fine = (userReturnDay - libraryDueDay) * 15;
      System.out.println(fine);
    } else {
      System.out.println("0");
    }    
  }
}

//////////////////////// Day 27: Testing Part II!

public class Solution {
  
  public static void main(String[] args) {
    System.out.println("5");
    System.out.println("3 3");
    System.out.println("-1 0 1");
    System.out.println("4 3");
    System.out.println("-2 -1 0 2");
    System.out.println("5 3");
    System.out.println("-2 0 1 2 3");
    System.out.println("6 3");
    System.out.println("-3 -2 -1 0 1 2");
    System.out.println("7 3");
    System.out.println("-1 0 1 2 3 4 5");
  }
}

//////////////////////// Day 28: Introduction to Databases & More Review!

import java.util.Scanner;
import java.util.regex.*;

public class Solution {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());
    while(testCases > 0) {
      String pattern = in.nextLine();
      try {
        Pattern.compile(pattern);
        System.out.println("Valid");
      } catch (PatternSyntaxException e) {        
        System.out.println("Invalid");
      }
      testCases -= 1;       
    }
  }
}

//////////////////////// Day 29: Look at Everything We've Learned!

