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
}
