package DataStructuresProject;



public class LinkedBag<T> {
    private Node<T> head;

    // Default constructor
    public LinkedBag(){
        this.head = null;
    }
    // Constructor if there is already an existing node list
    public LinkedBag(Node<T> newHead){
        this.head = newHead;
    }
    public void add(T newData){
        Node<T> newNode = new Node<T>(newData, null);
        Node<T> temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }

    }
}
