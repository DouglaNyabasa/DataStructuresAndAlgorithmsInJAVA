package SearchingAndSortingAlgorithms.SelectionSortImpl;
//Time Complexities:
//
//Worst Case Complexity: O(n2)
//If we want to sort in ascending order and the array is in descending order then, the worst case occurs.

//Best Case Complexity: O(n2)
//It occurs when the array is already sorted

//Average Case Complexity: O(n2)
//It occurs when the elements of the array are in jumbled order (neither ascending nor descending).

//
//Space Complexity:
//
//Space complexity is O(1) because an extra variable temp is used.
public class SelectionSort{

    public static void main(String[] args) {

        int array[] = {9, 5, 4, 2, 7, 8, 1, 3, 6, 10};
        selectionSort(array);
        for (int i:array) {
            System.out.print(i);

        }
    }

    private static void selectionSort(int[] array) {
        for (int i=0; i< array.length-1;i++){
            int min =i;
            for (int j= i +1; j< array.length;j++){
                if (array[min]>array[j]){
                    min=j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min]= temp;
        }
    }

}
