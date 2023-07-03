package TreeBasedDataStructures.BinarySearchTree;

//Binary Search Tree Complexities

//Time Complexity

//Operation	 BestCase	AverageCase WorstCase
//Search	O(log n)	O(log n)	O(n)
//Insertion	O(log n)	O(log n)	O(n)
//Deletion	O(log n)	O(log n)	O(n)

//Space Complexity

//The space complexity for all the operations is O(n).

//Binary Search Tree Applications

//1.In multilevel indexing in the database
//2.For dynamic sorting
//3.For managing virtual memory areas in Unix kernel

// OPERATIONS OS A Binary Search Tree(BST)

// 1) SEARCH OPERATION
// 2) INSERTION OPERATION
// 3) Deletion Operation
// IF(In the third case, the node to be deleted has two children.
// In such a case follow the steps below:
//*Get the inorder successor of that node.
//*Replace the node with the inorder successor.
//*Remove the inorder successor from its original position.)

class Node {
    char key;
    Node left, right;
    public Node(char key) {
        this.key=key;
    }
}

class BinarySolution{
    Node root;
    void insertKey(char key){
        root = insertInTree(root,key);
    }
    void preordertraversal(Node root){
        if (root !=null){
            System.out.println(root.key+" ");
            preordertraversal(root.left);
            preordertraversal(root.right);
        }
    }
    Node insertInTree(Node root, char key) {
        if (root==null){
            root= new Node(key);
            return root;
        }
        if (key<root.key){
            root.left=insertInTree(root.left,key);
        } else if (key> root.key) {
            root.right = insertInTree(root.right,key);

        }
        return root;
    }
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
}}




