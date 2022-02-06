package DataStructuresProject;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!");
        LinkedBag<Integer> myBag = new LinkedBag<>();
        myBag.addFront(5);
        myBag.addBack(10);
        myBag.addBack(15);
        myBag.addBack(20);
        System.out.println(myBag);
        myBag.addFront(0);
        System.out.println(myBag);
        myBag.addBack(25);
        System.out.println(myBag);
        myBag.removeDataWithData(15);
        System.out.println(myBag);

    }
}
