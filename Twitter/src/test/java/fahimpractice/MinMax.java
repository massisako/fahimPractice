package fahimpractice;

import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MinMax {
    //given array of int find the smallest and largest num.

    public static void main(String[] args) {
        int myArray[] = {73, 8, 9, 39, 71, 22, 48, 1, 5757};

        int min = myArray[0];
        int max = myArray[0];

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < min) min = myArray[i];
            if (myArray[i] > max) max = myArray[i];
        }

        System.out.println("the smallest number is : " + min);
        System.out.println("the largest number is : " + max);
    }

}
