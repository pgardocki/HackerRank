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



//////////////////////// Day 18: Queues & Stacks!

//////////////////////// Day 19: Interfaces!