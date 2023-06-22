package SearchingAndSortingAlgorithms.bubbleSortImpl;

//IT HAS A RUN TIME OF O(N^2) (QUADRATIC)
// Bubble sort is a sorting algorithm that compares two adjacent elements and swaps them until they are in the intended order.
//Just like the movement of air bubbles in the water that rise up to the surface, each element of the array move to the end in each iteration.
//
// 1. Time Complexities

//Worst Case Complexity: O(n2)
//If we want to sort in ascending order and the array is in descending order then the worst case occurs.

//Best Case Complexity: O(n)
//If the array is already sorted, then there is no need for sorting.

//Average Case Complexity: O(n2)
//It occurs when the elements of the array are in jumbled order (neither ascending nor descending).

//2. Space Complexity
// is O(1) because an extra variable is used for swapping.
//In the optimized bubble sort algorithm, two extra variables are used. Hence, the space complexity will be O(2).
public class BubbleSort {

    static void bubbleSort(int array[]){
       for (int i=0;i< array.length -1;i++){
           for (int j=0;j< array.length -i -1;j++){
               if (array[j]>array[j+1]){
                   int temp = array[j];
                   array[j] = array[j+1];
                   array[j+1] = temp;
               }
           }
       }
    }

    public static void main(String[] args) {

        int array[]= {0,9,8,6,5,4,3,2,1,7};
        bubbleSort(array);
        for (int i :array){
            System.out.print(i);
        }
    }
}
