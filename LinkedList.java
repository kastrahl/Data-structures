public class LinkedList{
    public class Node{
        int value;
        Node next;
        public Node(int data){
            value=data;
            next=null;
        }
    }
    Node root;

    public Node addrecursive(Node current,int data){
        if(current==null){
            return new Node(data);
        }
        else{
            while(current.next!=null){
                current.next;
            }
            current.next = new Node(data);
        }
        return current;
    }
    public void add(int value){
        root = addrecursive(root,value);
    }
    private static LinkedList createLinkedList(){
        LinkedList ll=new LinkedList();
        ll.add(1);
        ll.add(4);
        ll.add(7);
        return ll;
    }
    private boolean containsNodeRecursive(Node current,int value){
        if(current==null)
            return false;
        else
        if(current.value==value)
        return true;
        return containsNodeRecursive(current.next, value);
    }

    public static void main(String [] args){
        LinkedList ll =  createLinkedList() ;            //creating the binary tree by method  
        Boolean b = ll.containsNode(7); 
        System.out.println(b);
        System.out.println("\nInorder traversal of linked list is " );
        ll.printInorder();
    }
}