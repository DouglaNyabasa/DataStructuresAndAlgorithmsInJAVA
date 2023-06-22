package SearchingAndSortingAlgorithms.InsertionSortImpl;

public class InsertionSortAlgo {
    public static void insertionSort(int[] array){
        for (int secondIndex = 1;secondIndex< array.length;secondIndex++){
            int leftIndex =secondIndex -1;
            int temp = array[secondIndex];
            while (leftIndex >=0 && array[leftIndex]>temp){
                array[leftIndex+1]=array[leftIndex];
                leftIndex--;
            }
            array[leftIndex+1]= temp;
        }

    }
    public static void main(String[] args) {

        int array[] = {9, 5, 4, 2, 7, 8, 1, 3, 6, 10};
        insertionSort(array);
        for (int i:array) {
            System.out.print(i);
        }
    }
}
