public class BinaryTree{

    public class Node{
        int value;
        Node left;
        Node right;
        public Node(int data){
            this.value = data;
            left = null;
            right = null;
        }
    }
    
    Node root;
    BinaryTree() { 
        root = null; 
    }
    
    public Node addrecursive(Node current,int value){
        if(current==null){
            return new Node(value);
        }else
        if(value<current.value){
            int n=current.value;
            current.left=addrecursive(current.left,value);
        }else
        if(value>current.value){
            int n=current.value;
            current.right=addrecursive(current.right,value);
        }else
        {
            return current;
        }
        return current;
    }

    public void add(int value) {
        root = addrecursive(root, value);
    }

    private static BinaryTree createBinaryTree(){
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        return bt;
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        } 
        if (value == current.value) {
            return true;
        } 
        return value < current.value
          ? containsNodeRecursive(current.left, value)
          : containsNodeRecursive(current.right, value);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(this.root, value);
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }
    
    void printInorder() {                       //wrapper class for access without passing node
        traverseInOrder(this.root); 
    }

    public static void main(String [] args){
        BinaryTree bt =  createBinaryTree() ;            //creating the binary tree by method  
        Boolean b = bt.containsNode(7); 
        System.out.println(b);
        System.out.println("\nInorder traversal of binary tree is " );
        bt.printInorder();
    }
}