package TreeBasedDataStructures;

import DataStructuresOrdinary.Node;

public class BinarySearchTree  {

    public static void main(String[] args) {

        BinarySolution binarySolution = new BinarySolution();
        binarySolution.insertKey('C');
        binarySolution.insertKey('I');
        binarySolution.insertKey('B');
        binarySolution.insertKey('G');
        binarySolution.insertKey('M');
        binarySolution.insertKey('A');
        binarySolution.preordertraversal(binarySolution.root);

    }
}
class Node1{
    char key;
    Node right,left;
    Node1(char key){
        this.key=key;
    }
}
class BinarySolution{
    Node root;
    void insertKey(char key){
        root = insertInTree(root,key);
    }

    Node insertInTree(Node root,char key) {
        if (root == null){
            root = new Node(key);
            return root;
        }
        if (key< root.key){
            root.left = insertInTree(root.left,key);
        }else if (key>root.key){
            root.right = insertInTree(root.right,key);
        }
        return root;
    }
    void preordertraversal(Node root){
        if (root !=null){
            System.out.print(root.key + " ");
            preordertraversal(root.left);
            preordertraversal(root.right);
        }
    }
}
