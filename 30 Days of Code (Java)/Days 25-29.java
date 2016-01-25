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



//////////////////////// Day 27: Testing Part II!

//////////////////////// Day 28: Introduction to Databases & More Review!

//////////////////////// Day 29: Look at Everything We've Learned!
