package DataStructuresOrdinary;

import java.util.Iterator;
import java.util.Stack;

public class StackSolution {
    public static void main(String[] args) {

        // Creating a STACK DATA-STRUCTURE
        // PUSH && POP operations has a 0(1) COMPLEXITY

        Stack<Integer> stack = new Stack<>();

        stack.push(4);
        stack.push(2);
        stack.push(3);
        stack.push(1);
        stack.push(5);
        System.out.println("\n STACK AFTER PUSHING "+ stack);
        stack.pop();
        System.out.println("\n STACK AFTER POP " + stack);
        System.out.println(stack.peek());
        boolean status = stack.empty();
        System.out.println(status);
        int indexfound = stack.search(3);
        System.out.println(indexfound);

        // Iterate over a stack
        System.out.println("Iterating the stack");
        Iterator iterator = stack.iterator();
        while (iterator.hasNext()){
            Object s2 = iterator.next();
            System.out.print(s2);
        }
        // checking stack size
        System.out.println();
        System.out.println(stack.size());

        stack.sort(null);
        System.out.println(stack);

         int array[];
         int top;
         int capacity;

        //create the stackSolution
//        Stack( int size){
//            array = new int[size];
//            capacity = size;
//            top = -1;
//        }
//        // add elements to the stackSolution
//        public void push ( int x){
//            if (isFull()) {
//                System.out.println("DataStructuresOrdinary.StackSolution is filled");
//                System.exit(1);
//            }
//            System.out.println("Insert" + x);
//            array[++top] = x;
//        }
//        private boolean isFull () {
//            return top == capacity - 1;
//        }
//        public int pop () {
//            if (isEmpty()) {
//                System.out.println("DataStructuresOrdinary.StackSolution is empty");
//                System.exit(1);
//            }
//            return array[top--];
//        }
//        public Boolean isEmpty () {
//            return top == -1;
//        }
//
//        public int size () {
//            return top + 1;
//        }
//
//        public void printStack () {
//            for (int i = 0; i <= top; i++) {
//                System.out.println(array[i]);
//            }

        }

    }

