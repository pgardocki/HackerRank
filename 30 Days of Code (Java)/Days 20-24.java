//////////////////////// Day 20: Review + More String Methods!

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String toSolve = sc.nextLine();
      String delimiter = "[!,?.\\_'@ ]+";
      
      StringTokenizer st = new StringTokenizer(toSolve, delimiter);
      int totalWords = st.countTokens();
      
      System.out.println(totalWords);
      
      while (st.hasMoreTokens()) {
        System.out.println(st.nextToken());
      }
    }
}

//////////////////////// Day 21: Generics!

class Printer {
  public <E> void printArray(E[] array) {
    for (E element : array) {
      System.out.println(element);
    }
  } 
}

//////////////////////// Day 22: Heaps and Binary Trees!

//////////////////////// Day 23: Review + More BST's!

//////////////////////// Day 24: More Review + More Linked Lists!
