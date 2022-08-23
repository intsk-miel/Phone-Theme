package collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LinkedList <T>{
    Logger logger = LogManager.getLogger(LinkedList.class);
    Node head;

    public void insert(T data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
        } else {
            Node temp = this.head;
            while (temp.next != null) {
                temp = (Node) temp.next;
            }
            temp.next = node;
        }
    }

    public void insertAtStart(T data){
        Node node = new Node(data);
        node.setNextNode(head);
        head = node;
    }

    public void insertAtLast(T data)
    {
        if (head == null) {
            head = new Node();
            head.data = data;
            head.next = null;
        } else {
            Node toAdd = new Node();
            toAdd.data = data;
            Node temp = head;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = toAdd;
        }
    }
    public void insertAt(int index, T data) {
        if(index == 0){
            insertAtStart(data);
        }else{
            Node node = new Node(data);

            Node temp = head;
            for(int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    public void deleteAt(int index) {
        if(index == 0) {
            head = head.next;
        }else{
            Node temp = head;
            for(int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public void print() {
        Node temp = head;
        if(temp == null){
            logger.info("It is empty");
        } else {
            while(temp != null) {
                logger.info(temp.data + " ");
                temp = (Node) temp.next;
            }
        }
    }
}








