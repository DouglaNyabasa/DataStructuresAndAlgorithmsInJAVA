package TreeBasedDataStructures.PerfectBinaryTree;

//Perfect Binary Tree

//A perfect binary tree is a type of binary tree in which every internal node has exactly two child nodes and all the leaf nodes are at the same level.
public class PerfectBinaryTree {

    static class Node{
        int key;
        Node left,right;
    }


    //calculate the depth
    static int depth(Node node){
        int d =0;
        while (node !=null){
            d++;
            node = node.left;
        }
        return d;
    }

    static boolean isPerfect(Node root,int d,int level){

        //checking if the tree is empty
        if (root == null) {return  true;}
        //checking for children
        if (root.left == null && root.right == null){return (d ==level+1);}
        if (root.left ==null|| root.right==null){return false;}
        return isPerfect(root.left,d,level+1)&&isPerfect(root.right,d,level+1);
    }

    //creat a new node
    static Node newNode(int k){
        Node node = new Node();
        node.key=k;
        node.right = null;
        node.left = null;
        return node;

    }
    static boolean isPerfect(Node root) {
        int d = depth(root);
        return isPerfect(root, d, 0);
    }

    public static void main(String args[]) {
        Node root = null;
        root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);

        if (isPerfect(root) == true)
            System.out.println("The tree is a perfect binary tree");
        else
            System.out.println("The tree is not a perfect binary tree");
    }
}

