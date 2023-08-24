package staticinnerclassexample;

//Outer class
//can only have two access levels, one is public and other is default.
//LinkedList is top level class.


public class LinkedList {
    //this class has field head of type Node
    Node head;

    //constructor
    public LinkedList(Node head) {
        this.head = head;
    }

    //Creating Node as static class which is a higher of LinkedList class
    //Node is similar to top level class and is not part of object of LinkedList class
    //Node class which static inner class have all access levels.
    //private, protected, public, and default
    //Note - This node class id static inner class and hence it cannot access the fields/data members
    //from outer class directly because it is static.

    private static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    void printLL() {
        System.out.println("LinkedList is : ");
        Node temp = head;
        while (temp != null) {
            System.out.println("[" + temp.data + "]-->");
        }
        System.out.println("null\n");
    }

    void addNode(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Node " + newNode.data + " added successfully!");
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(null);
        //creating an object of Node class.
        LinkedList.Node newNode = new LinkedList.Node(10, null);
        linkedList.addNode(newNode);
        newNode = new LinkedList.Node(20, null);
        linkedList.addNode(newNode);
        newNode = new LinkedList.Node(30, null);
        linkedList.addNode(newNode);
    }
}
