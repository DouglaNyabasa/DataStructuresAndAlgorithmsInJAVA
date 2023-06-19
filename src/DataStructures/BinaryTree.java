package DataStructures;

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
class TreeTraversal{
    Node root;
    // PreOrder Traversal
    // YOU FIRST TRAVERSE THE ROOT NODE
    // THEN  LEFT NODE
    // AND LASTLY THE RIGHT NODE
    void preordertraversal(Node n){
        if (n!=null){
            System.out.print(n.key + " ");
            preordertraversal(n.left);
            preordertraversal(n.right);

        }
    }
    // PostOrder Traversal
    // YOU FIRST TRAVERSE THE LEFT  NODE
    // THEN RIGHT  NODE
    // AND LASTLY THE  ROOT NODE
    void postordertraversal(Node n){
        if (n!=null){
            preordertraversal(n.left);
            preordertraversal(n.right);
            System.out.print(n.key + " ");

        }
    }

    // InOrder Traversal
    // YOU FIRST TRAVERSE THE LEFT NODE
    // THEN ROOT NODE
    // AND LASTLY THE RIGHT NODE
    void inordertraversal(Node n){
        if (n!=null){
            preordertraversal(n.left);
            System.out.print(n.key + " ");
            preordertraversal(n.right);


        }
    }
}

class Node{
    char key;
    Node left,right;
    Node(char key){
        this.key=key;
    }


}
