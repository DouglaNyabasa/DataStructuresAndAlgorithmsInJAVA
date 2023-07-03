package TreeBasedDataStructures.BinaryTree;

//Binary Tree

//A binary tree is a tree data structure in which each parent node can have at most two children. Each node of a binary tree consists of three items:
//
//data item
//
//address of left child
//
//address of right child

//Binary Tree Applications

//For easy and quick access to data
//In router algorithms
//To implement heap data structure
//Syntax tree

public class BinaryTree {
    public static void main(String[] args) {
        TreeTraversal treeTraversal = new TreeTraversal();
        treeTraversal.root = new Node('A');
        treeTraversal.root.left = new Node('B');
        treeTraversal.root.right =  new Node('C');
        treeTraversal.root.left.left =  new Node('D');
        treeTraversal.root.left.right = new Node('E');
        treeTraversal.preordertraversal(treeTraversal.root );
        System.out.println();
        treeTraversal.postordertraversal( treeTraversal.root );
        System.out.println();
        treeTraversal.inordertraversal(treeTraversal.root );
    }
}

