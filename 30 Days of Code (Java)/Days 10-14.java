//////////////////////// Day 10: Binary Numbers!

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int num = sc.nextInt();
            String base2 = "";
            while (num > 0) {
                base2 = (num % 2) + base2;
                num /= 2;
            }
            System.out.println(base2);
        }
    }
}

//////////////////////// Day 11: 2D-Arrays + More Review!

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int maxSum = Integer.MIN_VALUE;      
        for (int col = 0; col < 4; col++) {
            for (int row = 0; row < 4; row++) {
                int sum = arr[col][row] + arr[col][row + 1] + arr[col][row + 2] + 
                		  arr[col + 1][row + 1] + 
                		  arr[col + 2][row] + arr[col + 2][row + 1] + arr[col + 2][row + 2];
                if (sum > maxSum) maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
}

//////////////////////// Day 12: Inheritance!

class Grade extends Student{
    private int score;
    
    public Grade (String fname, String lname, int p, int s) {
        super(fname, lname, p);
        this.score = s;
    }
    
    public char calculate() {
        if (this.score < 40) {
            return 'D';
        } else if (this.score >=40 && this.score < 60) {
            return 'B';
        } else if (this.score >=60 && this.score < 75) {
            return 'A';
        } else if (this.score >=75 && this.score < 90) {
            return 'E';
        } else { return 'O'; }
    }    
   
}

//////////////////////// Day 13: Abstract Classes!

class MyBook extends Book {
    int price;
    
    public MyBook (String title, String author, int p) {
        super(title, author);
        price = p;
    }
    
    void display() {
        System.out.println("Title: " +title+ "\nAuthor: " +author+ "\nPrice: " +price);
    }
        
}

//////////////////////// Day 14: All about Scope!

public Difference(int[] array) {
    elements = array;
    Arrays.sort(elements);
}   

public void computeDifference() {
    maximumDifference = elements[elements.length - 1] - elements[0];
}