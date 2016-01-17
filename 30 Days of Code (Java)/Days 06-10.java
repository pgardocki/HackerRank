//////////////////////// Day 6 Data Types!

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for (int i = 0; i < n; i++) {
            String spaces = "";
            String hashTag = "";
            for (int j = i + 1; j < n; j++) { spaces += " "; }
            for (int k = n - i - 1; k < n; k++) {hashTag += "#"; }
            System.out.println(spaces + hashTag);            
        }
    }
}

//////////////////////// Day 7 Arrays!

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];

        for(int i=0; i < N; i++){
            arr[i] = in.nextInt();
        }

        int new_arr[] = new int[N];

        for (int j = 0; j < N; j++) {
            new_arr[j] = arr[N - j - 1];
        }

        String answer = Arrays.toString(new_arr).replace(",", "").replace("[", "").replace("]", "").trim();
        System.out.println(answer);
    }
}

//////////////////////// Day 8: Dictionaries and Maps!

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh) {

    	Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();

        for(int i=0;i<N;i++) {
      		String name = in.nextLine();
        	int phone = in.nextInt();
        	in.nextLine();
        	phoneBook.put(name, phone);
        }

        while(in.hasNext()) {
        	String s = in.nextLine();
        	if (phoneBook.get(s) == null) {
            	System.out.println("Not found");
        	} else {
            	System.out.println(s+"="+phoneBook.get(s));
        	}
        }
    }
}

//////////////////////// Day 9: Recursion!

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = find_gcd(a,b);
        System.out.println(gcd);
    }

    static  int find_gcd(int a,int b) {
        if (b == 0) return a;
        return find_gcd(b, a%b);
    }
}

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