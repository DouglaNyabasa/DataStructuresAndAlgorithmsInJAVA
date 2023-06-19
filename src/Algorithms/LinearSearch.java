package Algorithms;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        int array[] = new int[]{2,4,6,3,1,5,8,7,9};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the element you are searching");
        int key = input.nextInt();
        int count =0;
        for (int i=0; i< array.length; i++){
            if (array[i] == key){
                System.out.println("element found at index "+ i);
                count++;
            }
        }
        if (count ==0){
            System.out.println("element not found");
        }
    }
}
