package Algorithms;

public class BinarySearchAlgo {

    //IT FOLLOWS THE DIVIDE AND CONQUER PARADIGM
    // BEST CASE TIME COMPLEXITY IS 0(1)
    // WORST CASE TIME COMPLEXITY IS 0(Logn)
    // SPACE COMPLEXITY IS 0(1)
    public static int binarySearch(int[] array,int key,int first,int last){
        int mid = (first+last)/2;
        if (first<=last){
            if (key==array[mid]){
                return mid;}
            if (key<array[mid]){
                return binarySearch(array,key,first,mid-1);
            }else {
                return binarySearch(array,key,mid+1,last);}
            }
            return -1;
        }
    public static void main(String[] args) {

        int[] array1=new int[]{1,2,3,4,5,6,7,8,9,10};
        int index = binarySearch(array1,8,0,array1.length-1);
        if (index == -1) {
            System.out.println("element not found");
        }else {
            System.out.println("element found at index"+ " "+index);
        }
    }
}
