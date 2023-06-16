import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class LinkedListSolution {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(4);
        linkedList.add(4,5);

        linkedList.remove(3);

        Iterator iteratorObj = linkedList.iterator();
        while (iteratorObj.hasNext()){
            System.out.print(iteratorObj.next() +" ");
        }
        System.out.println();
        System.out.println(linkedList.size());
        boolean search = linkedList.contains(4);
        System.out.println(search);

        System.out.println();
        //Copying elements from one data structure to another

        Stack<String> stack1 = new Stack<>();
        LinkedList<String> linkedList2 = new LinkedList<>();

        stack1.push("douglas");
        stack1.push("nyabasa");

        linkedList2.addAll(stack1);
        Iterator iteratorObj1 = linkedList2.iterator();
        while (iteratorObj1.hasNext()){
            System.out.print(iteratorObj1.next() +" ");
        }
    }








}
