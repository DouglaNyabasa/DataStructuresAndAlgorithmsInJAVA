package SearchingAndSortingAlgorithms.QuickSortImpl;
//It follows the divide and conquer paradigm and works with recursion
// You can choose any random element as pivot element
// BEST CASE TIME COMPLEXITY IS 0(n log n)
// WORST CASE  TIME COMPLEXITY IS 0(n^2)
public class QuickSort {
    public static int partition(int[] array,int first,int last){
        int pivot = array[last];
        int i = first-1;
        for (int j=first;j<last;j++){
            if (array[j]<=pivot){
                i++;
                int temp = array[i];
                array[i]= array[j];
                array[j] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1]= array[last];
        array[last] = temp;
        return i+1;
    }
    static void QuickSort(int[] array,int first,int last){
        if (first<last){
        int middle= partition(array, first, last);
        QuickSort(array, first, middle-1);
        QuickSort(array, middle+1, last);
    }}
    public static void main(String[] args) {
        int array[] = {9, 5, 4, 2, 7, 8, 1, 3, 6, 10};
        QuickSort(array,0,array.length-1);
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }


}
