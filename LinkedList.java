//https://www.geeksforgeeks.org/linked-list-set-1-introduction/
class LinkedList{
    Node head;

    public void printList(){  
        Node n = head; 
        while (n != null){ 
            System.out.print(n.data+" "); 
            n = n.next;
        }
    }  


    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }
}
