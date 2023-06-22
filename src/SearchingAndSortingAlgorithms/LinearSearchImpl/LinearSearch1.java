package SearchingAndSortingAlgorithms.LinearSearchImpl;


public class LinearSearch1 {

    //FIRST IMPLEMENTATION EXAMPLE
    public static int linearSearch(int[] Array, int key) {

        for (int i = 0; i <= Array.length; i++) {
            if (Array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int Array[] = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        int index = linearSearch(Array, 9);
        if (index == -1) {
            System.out.println("element not found" );
        } else {
            System.out.println("element found at index :" + index);
        }

    }
}
