package SearchingAndSortingAlgorithms.binarySearchImpl;

//Binary Search is a searching algorithm for finding an element's position in a sorted array.
//Binary Search Algorithm can be implemented in two ways which are :
//
// 1) Iterative Method
// 2) Recursive Method (follows the divide and conquer approach)


//IT FOLLOWS THE DIVIDE AND CONQUER PARADIGM
// BEST CASE TIME COMPLEXITY IS 0(1)
// WORST CASE TIME COMPLEXITY IS 0(Log n)
// SPACE COMPLEXITY IS 0(1)

public class RecursiveMethod {

    public  int binarySearch(int Array[],int key,int low ,int high){

        if (high>=low){
            int mid = low +(high-low)/2;
            if (Array[mid]==key){
                return mid;
            } if (Array[mid]< key){
                return binarySearch(Array,key,mid+1,high);
            }if (Array[mid]>key){
                return binarySearch(Array,key,low,mid-1);
            }

        }return -1;
    }
    public static void main(String[] args) {
        RecursiveMethod recursiveMethod = new RecursiveMethod();
        int Array[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int index = recursiveMethod.binarySearch(Array,97,0, Array.length-1);
        if (index==-1){
            System.out.println("element not found");
        }else {
            System.out.println("element found at index :"+index);
        }
    }

//    public static int binarySearch(int[] array,int key,int first,int last){
//        int mid = (first+last)/2;
//        if (first<=last){
//            if (key==array[mid]){
//                return mid;}
//            if (key<array[mid]){
//                return binarySearch(array,key,first,mid-1);
//            }else {
//                return binarySearch(array,key,mid+1,last);}
//            }
//            return -1;
//        }
//    public static void main(String[] args) {
//
//        int[] array1=new int[]{1,2,3,4,5,6,7,8,9,10};
//        int index = binarySearch(array1,10,0,array1.length-1);
//        if (index == -1) {
//            System.out.println("element not found");
//        }else {
//            System.out.println("element found at index"+ " "+index);
//        }
//    }
}
