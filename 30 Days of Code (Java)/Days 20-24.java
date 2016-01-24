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

//////////////////////// Day 22: Binary Search Trees!

import java.util.*;
import jva.io.*;

class Node {
  Node left, right;
  int data;
  Node(int data) {
    this.data = data;
    left = right = null;
  }
}

class Solution {
  public static int getHeight(Node root) {
    if (root == null) return 0;
    if (root.left == null && root.right == null) return 1;

    int treeHeight = 1;
    ArrayList<Node> nodeArray = new ArrayList<Node>();
    nodeArray.add(root);

    boolean keepGoing = true;
    while (keepGoing) {
      keepGoing = (goDownALevel(nodeArray).size() != 0);
      if (keepGoing == true) treeHeight++;
    }
    return treeHeight;
  }

  public static ArrayList<Node> goDownALevel(ArrayList<Node> tree) {
    for (int i = tree.size(); i > 0; i--) {
      Node a = tree.remove(0);
      if (a.left != null && a.right != null) {
        tree.add(a.left);
        tree.add(a.right);
      }
      else if (a.left != null) {
        tree.add(a.left);
      }
      else if (a.right != null) {
        tree.add(a.right);
      }
    }
    return tree;
  }

  public static Node insert(Node root, int data) {
    if (root == null) {
      return new Node(data);
    }
    else {
      Node cur;
      if (data <= root.data) {
        cur = insert(root.left, data);
        root.left = cur;
      }
      else {
        cur = insert(root.right, data);
        root.right = cur;
      }
      return root;
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    Node root = null;
    while (T-- > 0) {
      int data = sc.nextInt();
      root = insert(root, data);
    }
    int height = getHeight(root);
    System.out.println(height);
  }

}

//////////////////////// Day 23: Review + Binary Trees!

public static void printLevelOrder(Node root) {  
  ArrayList<Node> nodeArray = new ArrayList<Node>();
  nodeArray.add(root);
  
  boolean keepGoing = true;
  while (keepGoing) {    
    for (Node node : nodeArray) {
      System.out.print(node.data + " ");
    }    
    keepGoing = (goDownALevel(nodeArray).size() != 0);      
  }
}

public static ArrayList<Node> goDownALevel(ArrayList<Node> tree) {
  for (int i = tree.size(); i > 0; i--) {
    Node a = tree.remove(0);
    if ((a.left != null) && (a.right != null)) {        
      tree.add(a.left);
      tree.add(a.right);
    } else if (a.left != null) {
      tree.add(a.left);
    } else if (a.right != null) {
      tree.add(a.right);
    }
  }
  return tree;
}

//////////////////////// Day 24: More Review + More Linked Lists!

public static Node removeDuplicates(Node head) {
  if (head == null) return head;
  
  Node firstNode = head;
  Node nodeToCheck = head.next;
  
  while (nodeToCheck != null) {
    if (firstNode.data != nodeToCheck.data) {
      firstNode = nodeToCheck;
      nodeToCheck = nodeToCheck.next;
    } else {
      firstNode.next = nodeToCheck.next;
      nodeToCheck = nodeToCheck.next;
    }
  }
  return head;
}


///////////// Code below is by agrawroh

Node temp = head;
while(temp.next != null) {
  if(temp.data == temp.next.data)
    temp.next = temp.next.next;
  else
    temp = temp.next;
}
