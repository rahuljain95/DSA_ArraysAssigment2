// Question 4
// You have a long flowerbed in which some of the plots are planted, and some are not.
// However, flowers cannot be planted in adjacent plots.
// Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

// Example 1:
// Input: flowerbed = [1,0,0,0,1], n = 1
// Output: true


public class FlowerBed {
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n=1;
        System.out.println(canPlaceFlowers(flowerbed,n));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int left = 0;
        int current = flowerbed[0];

        for(int i=1;i<flowerbed.length;i++)
        {
            if(current == 0 && left == current && current == flowerbed[i])
            {
                n--;
                left = 1;
            }
            else
            {
                left = current;
            }
            current = flowerbed[i];
        }

        if(left == 0 && current == 0)
            n--;

        return n<=0;
    }
    
}
