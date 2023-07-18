// Question 2
// Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she started to gain weight, so she visited a doctor. 

// The doctor advised Alice to only eat n / 2 of the candies she has (n is always even). Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still following the doctor's advice. 

// Given the integer array candyType of length n, return the maximum number of different types of candies she can eat if she only eats n / 2 of them.

// Example 1:
// Input: candyType = [1,1,2,2,3,3]
// Output: 3

// Explanation: Alice can only eat 6 / 2 = 3 candies. Since there are only 3 types, she can eat one of each type.

import java.util.HashSet;
import java.util.Set;

public class Candy {
    public static int distributeCandies(int[] candyType) {

    Set<Integer>st=new HashSet<>();

    for(int i=0;i<candyType.length;i++){
        st.add(candyType[i]);
        if(st.size()>candyType.length/2)return candyType.length/2;
    }

    return st.size();

    }
    public static void main(String[] args) {
        int[] candyType = {1,1,2,2,3,3};
        System.out.println(distributeCandies(candyType));
    }
}