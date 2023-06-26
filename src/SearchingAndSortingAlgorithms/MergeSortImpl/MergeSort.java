package SearchingAndSortingAlgorithms.MergeSortImpl;

public class MergeSort {
    public static void main(String[] args) {
        int array[] = {9, 5, 4, 2, 7, 8, 1, 3, 6, 10};

        mergeSort(array);

        for (int i =0;i<array.length;i++){
            System.out.println(array[i]+" ");
        }
    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if (length<=1)return;
        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i =0; //left Array
        int j =0;//right Array
        for (;i<length;i++){
            if (i<middle){
                leftArray[i]=array[i];
            }else {
                rightArray[j]=array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray,rightArray,array);

    }
    private static void merge(int[] leftArray,int[] rightArray,int[] array){
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i =0,R =0,L=0;
        while (L < leftSize && R < rightSize ){
            if (leftArray[L] < rightArray[R ]){
                array[i] = leftArray[L];
                i++;
                L++;
            }else {
                array[i] = rightArray[R];
                i++;
                R++;
            }
        }
        while (L< leftSize){
            array[i]=leftArray[L];
            i++;
            L++;
        }
        while (L< rightSize){
            array[i]=rightArray[R];
            i++;
            R++;
        }

    }
}
