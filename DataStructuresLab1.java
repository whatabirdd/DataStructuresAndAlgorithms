/*
 * IT-2660 - Lab 1
 * Student Name: Austin Zimmer
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("hello, world!");

        Lab1 lab = new Lab1();
        System.out.println(lab.increment(1));

        int[] myArray = {5, 9, 3, 12, 7, 3, 11, 5};
        int z = 0;
        while (z < myArray.length) {
            System.out.print(myArray[z] + " ");
            z++;
        }
        System.out.println();
        for(int i = myArray.length - 1;i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println("\n" + myArray[0] + " " + myArray[7]);

        lab.maxi(10, 5);
        lab.mini(8,9);
        lab.sum(myArray);
        lab.average(myArray);
        lab.maxa(myArray);
        lab.mina(myArray);
    }
}

// Add all of the methods here
class Lab1 {
    public int increment(int num) {
        return ++num;
    }
    void maxi(int a, int b) {
        if (a > b) {
            System.out.println("Max (int): " + a);
        } else {
            System.out.println("Max (int): " + b);
        }
    }
    void mini(int a, int b) {
        if (a < b) {
            System.out.println("Min (int): " + a);
        } else {
            System.out.println("Min (int): " + b);
        }
    }
    int sum(int[] nums) {
        int s = 0;
        for (int i = 0;  i < nums.length; i++) {
            s += nums[i];
        }
        return s;
    }
    void average(int[] nums) {
        int avg, sum = 0;
        int length = nums.length;
        for(int num : nums) {
            sum += num;
        }
        avg = sum / length;
        System.out.println("Average: " + avg);
    }
    void maxa(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("Max (array): " + max);
    }
    void mina(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("Min (array): " + min);
    }
}
