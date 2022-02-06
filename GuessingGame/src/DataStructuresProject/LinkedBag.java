package DataStructuresProject;



public class LinkedBag<T> {
    private Node<T> head;
    private int size = 0;

    // Default constructor
    public LinkedBag(){
        this.head = null;
    }

    // Constructor if there is already an existing node list
    public LinkedBag(Node<T> newHead){
        this.head = newHead;
    }

    // Adds data to the beginning of the list
    public void addFront(T newData){
        this.head = new Node<>(newData, this.head);
        size++;
    }


    // Adds data to the end of the list
    public void addBack(T newData){
        Node<T> newNode = new Node<T>(newData, null);
        Node<T> temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(newNode);
        size++;

    }

    public void removeDataWithData(T targetData){
        Node<T> temp = head;
        while (temp.getNext() != null){
            if(temp.getNext().getData() == targetData){
                temp.setNext(temp.getNext().getNext());
                size--;
                break;
            }
            else
                temp = temp.getNext();
        }
    }

    public T[] intersection(LinkedBag<T> toCompare) {
        if(toCompare.size != this.size)
            return null;
        Node<T> thisHead = this.head;
        Node<T> compareHead = toCompare.head;
//        T[] toReturn = new T[20];
        while (thisHead.getNext()!=null){
//            if()
            thisHead = thisHead.getNext();
        }
            return null;
    }

    @Override
    public String toString() {
        System.out.println(head);
        return "";
    }
}
