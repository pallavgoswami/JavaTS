package com.technosignialive.august;

public class Average {
    // average of 20 to 1 numbers
    public static void main(String[] args) {
        float sum = 0;
        for (int i = 20; i >= 1; i--) {
            sum += i;
        }
        float average = sum / 20;
        System.out.println(average);
    }
}
