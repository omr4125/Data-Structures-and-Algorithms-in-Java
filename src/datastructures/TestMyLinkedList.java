package datastructures;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> myList = new MyLinkedList<>();
        System.out.println(myList.isEmpty());
        System.out.println(myList.size());
        myList.addFirst("Ali");
        System.out.println(myList);
        myList.addFirst("Veli");
        System.out.println(myList);
        myList.addLast("Mahmut");
        System.out.println(myList);
    }
}
