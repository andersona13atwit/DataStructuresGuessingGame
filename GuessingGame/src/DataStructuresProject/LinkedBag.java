package DataStructuresProject;


import java.util.ArrayList;

public class LinkedBag<T> {
    private Node<T> head;
    private int size = 0;
    private int max = 100;

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
        if(size < max) {
            this.head = new Node<>(newData, this.head);
            size++;
        }
    }


    // Adds data to the end of the list
    public void add(T newData){
        if(size < max) {
            if(head != null) {
                Node<T> newNode = new Node<T>(newData, null);
                Node<T> temp = head;
                while (temp.getNext() != null) {
                    temp = temp.getNext();
                }
                temp.setNext(newNode);
                size++;
            }
            else{
                addFront(newData);
            }
        }

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
    public boolean contains(T targetData){
        Node<T> temp = this.head;
        while (temp != null){
            if(temp.getData() == targetData)
                return true;
            temp = temp.getNext();
        }
        return false;
    }

    public ArrayList<T> intersection(LinkedBag<T> toCompare) {
        Node<T> temp = this.head;
        ArrayList<T> toReturn = new ArrayList<>();
        while (temp != null){
            if(toCompare.contains(temp.getData())){
                toReturn.add(temp.getData());
            }
            temp = temp.getNext();
        }
            return toReturn;
    }

    public int getSize() {
        return size;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String toString() {
        System.out.println(head);
        return "";
    }

    public void clear() {
        this.head = null;
    }
}
