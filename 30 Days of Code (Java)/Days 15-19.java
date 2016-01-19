//////////////////////// Day 15: Linked List!

public static Node insert(Node head, int data) {
  if (head == null) {
    head = new Node(data);
  } else {
    Node temp = head;

    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = new Node(data);
  }
  return head;                
}

//////////////////////// Day 16: Sorting!

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();        
    int[] numbers = new int[length];

    for (int i = 0; i < length; i++) {
      numbers[i] = sc.nextInt();
    }

    Arrays.sort(numbers);        
    String answer = "";
    int minDiff = Integer.MAX_VALUE;

    for (int i = 0; i < length - 1; i++) {
      int new_diff = Math.abs(numbers[i] - numbers[i + 1]);
      if (new_diff < minDiff) {
        answer = numbers[i] + " " + numbers[i + 1];
        minDiff = new_diff;
      } else if (new_diff == minDiff) {
        answer += " " + numbers[i] + " " + numbers[i + 1];
      }
    }
    System.out.println(answer);
  }
}

//////////////////////// Day 17: Exceptions!

class NegativeNumberException extends Exception {
  public NegativeNumberException(String exception) {
    super(exception);
  }
}

class Calculator {
  
  public int power(int n, int p) throws NegativeNumberException {
    if (p < 0 || n < 0) {
      throw new NegativeNumberException("n and p should be non-negative");
    } else {
      return (int)Math.pow(n, p);
    }
  }
}

//////////////////////// Day 18: Queues & Stacks!

class Palindrome {
  
  List<Character> charStack = new ArrayList<Character>();
  List<Character> charQueue = new ArrayList<Character>();
  
  void pushCharacter(char ch) {
    charStack.add(ch);
  }
  
  void enqueueCharacter(char ch) {
    charQueue.add(ch);
  }
  
  char popCharacter() {
    return charStack.remove(charStack.size() - 1);
  }
  
  char dequeueCharacter() {
    return charQueue.remove(0);
  }    

}

//////////////////////// Day 19: Interfaces!

import java.io.*;
import java.util.*;
interface AdvancedArithmetic {
  int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
  List<Integer> divisors = new ArrayList<>();
  
  public int divisorSum(int n) {
    for (int i = 1; i <= n / 2; i++) {
      if (n % i == 0) divisors.add(i);
    }

    int sum = 0;
    for (int e: divisors) { sum += e; }
    return sum;
  }
}

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    in n = sc.nextInt();
    AdvancedArithmetic myCalculator = new Calculator();
    int sum = myCalculator.divisorSum(n);
    System.out.println("I implemented: AdvancedArithmetic\n" + sum);
  }
}