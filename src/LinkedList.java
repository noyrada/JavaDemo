public class LinkedList {
    public static void main(String[] args){

    }
    //linked list of integer

    //Node class
    public class Node{
        public int item;
        public Node next;

        Node(){
            item = 0;
            next = null;
        }
        Node(int n){
            item = n;
            next = null;
        }
        Node(int n,Node p){
            item = n;
            next = p;
        }
    }
    //Finding the length of a list
    public int length(Node p){
        if (p == null){   //no next nodes
            return 0;
        }else {           // next nodes
            return 1 + length(p.next);
        }
    }

    //Exercise 34
    public boolean contains(int k,Node p){

        //k is the number that we search for
        //p the node

        if (p == null){
            return false;   //Item not found
        }
        else if (k == p.item){
            return true;   // Item found
        }
        else {
            return contains(k,p.next);  // Go to next node
        }
    }

    // Exercise 35
    public void printList(Node p){
        if (p!=null){  //has nodes
            System.out.println(p.item);
            printList(p.next);  //printing elements recursively

        }
    }
    public void printReverseList(Node p){
        if (p != null){
            printReverseList(p.next);
            System.out.println(p.item);
        }
    }


    //Exercise 36:
    public Node insertInOrder(int k,Node p){
        if (p == null){   // no next nodes
            return new Node(k,null);
        }
        else if (p.item >= k){
            return new Node(k,p);
        }
        else {
            p.next = insertInOrder(k,p.next);
            return p;
        }
    }
}
