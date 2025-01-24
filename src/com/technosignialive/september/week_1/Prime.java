package com.technosignialive.september.week_1;

// prime number has 2 factors
// Natural Number > 1 which has only 2 factors, 1 and itself
// 1 is neither prime nor composite

public class Prime {
    public static void main(String[] args) {
        int count = 0;
        int num = 23;
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not a Prime Number");
            }
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}
