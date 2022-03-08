package datastructures;

public class MyLinkedList <T>{

    private  static  class Node<T>{
        private T element;
        private  Node<T> next;

        public Node(T element, Node<T> next){
            this.element = element;
            this.next = next;
        }

        public T getElement() {
            return element;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next){
            this.next = next;
        }

        @Override
        public String toString() {
            return "[" +
                    element +
                    ']';
        }
    }
    //List implementation
    private Node<T> head = null;
    private  Node<T> tail = null;
    private int size = 0;

    public MyLinkedList(){}

    public int size(){
        return  size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public T first(){
        if (isEmpty())
            return  null;
        return head.getElement();
    }

    public  T last(){
        if (isEmpty())
            return null;
        return  tail.getElement();
    }

    public  void addFirst(T element){
        head = new Node<>(element, head);
        if (size == 0)
            tail = head;
        size++;
        System.out.println("Added first head");
    }

    public void addLast(T element){
        Node<T> newNode = new Node<>(element, null);
        if (isEmpty())
            head = newNode;
        else
            tail.setNext(newNode);
        tail = newNode;
        size++;
        System.out.println("Added last head");
    }

    @Override
    public String toString() {
        return "datastructures.MyLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }
}