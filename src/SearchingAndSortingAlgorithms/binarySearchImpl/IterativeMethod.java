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
public class IterativeMethod {
    public int binarySearch(int Array[],int key,int low,int high){
        while (high>=low){
            int mid = low + (high-low)/2;
            if (Array[mid]==key){
                return mid;
            }if (Array[mid] < key){
                low = mid+1;
            }if (Array[mid]> key){
                high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        IterativeMethod iterativeMethod = new IterativeMethod();
        int Array[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int index = iterativeMethod.binarySearch(Array,16,0, Array.length-1);
        if (index == -1){
            System.out.println("element not found");
        }else {
            System.out.println("element found at index "+ index);
        }
    }

//    public static int binarySearch(int array[],int key){
//
//        int low =0;
//        int high = array.length -1;
//        while (high>=low){
//            int mid = low +(high-low)/2;
//            int value = array[mid];
//
//            if (value<key){
//                low= mid+1;
//            }
//            else if (value>key){
//                high=mid-1;
//            }
//            else {
//                return mid; //element found
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int array[] = new int[100];
//        int key = 50;
//        for (int i =0;i < array.length;i++){
//            array[i]=i;
//        }
//
//        int index = binarySearch( array, key);
//
//        if (index==-1){
//            System.out.println("element not found");
//        }else {
//            System.out.println("element found at index :"+index);
//        }
//
//    }




}
