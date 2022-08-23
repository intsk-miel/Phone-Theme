package collections;

public class Node <T>{
    T data;
    Node next;

    Node(){}

    Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNextNode() {
        return next;
    }

    public void setNextNode(Node next) {
        this.next = next;
    }
}















//
//public class Node <N> {
//    N next;
//    N data;
//
//    Node(N data) {
//        this.data = data;
//    }
//
//    public N getValue() {
//        return data;
//    }
//    public void setValue(N value) {
//        this.data = value;
//    }
//
//    public N getNext() {
//        return next;
//    }
//    public void setNext(N next) {
//        this.next = next;
//    }
//}

