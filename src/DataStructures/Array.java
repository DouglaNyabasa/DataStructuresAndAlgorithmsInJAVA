package DataStructures;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        // ADDING  && REMOVING operations has a 0(1) COMPLEXITY
        // creating a one dimensional ARRAY

        int[] array1 = new int[10];
        int count = 1;
        for(int i = 0; i< array1.length; i++){
            array1[i] = count;
            count++;
        }
        for (int j=0; j<array1.length;j++){
            System.out.println(array1[j] +"");
        }

        // creating a two-dimensional ARRAY

        int [][] array2 = new int[3][4];
        int count1 = 1;
        for(int i = 0; i< array2.length; i++){
            for (int j=0; j<array2[i].length;j++){
                array2[i][j] = count1;
                count1++;
       }

        }
        for(int i = 0; i< array2.length; i++){

            for (int j=0; j<array2[i].length;j++){
                System.out.print(array2[i][j] + "");
            }
            System.out.println();
        }
        //   Sorting Elements of an DataStructures.Array
        int Array[] = new int[]{3,5,6,7,1,2,9,4,8,10};
        for (int i=0;i<Array.length;i++ ){
            System.out.print(Array[i]);

        }
        Arrays.sort(Array);
        System.out.println();
        for (int i=0;i<Array.length;i++ ){
            System.out.print(Array[i]);

        }
        int indexValue = search(Array,8);
        if (indexValue == -1){
            System.out.println("element not found");
        }
        System.out.println("element found at index " + indexValue);
    }
    public static int search(int array1[], int key){
        for (int i=0; i<array1.length;i++){
            if(array1[i]== key){
                return i;
            }
        }
        return -1;
    }
}
