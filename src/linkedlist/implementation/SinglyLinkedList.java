package linkedlist.implementation;

public class SinglyLinkedList {
    static Node head = null;
    private static void disply(Node head) {
        Node tmp = head;

        while (tmp != null) {
            tmp = tmp.next;
            System.out.print(tmp.data+" -> ");
        }
        System.out.print("-> null");
    }


    private static void insertBegin(int data) {
        Node newNode = new Node(10);
        newNode.next = head;
        head = newNode;
    }

    private static void insertEnd(int data) {
        if (head == null) {
            insertBegin(data);
            return;
        }
        Node newNode = new Node(20);
        Node tmp = head;

        while (tmp != null) {
            tmp = tmp.next;
        }
        tmp.next = newNode;
    }

    private static void deleteNode(int data) {

        Node tmp = head;

        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        while (tmp.next != null && tmp.data != data) {
            tmp = tmp.next;
        }
        if (tmp.next == null){
            System.out.println("Invalid data");
            return;
        }
        tmp.next = tmp.next.next;
    }

}

