// Main.java - everything in one file
public class Main1 {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        list.insertAt(2, 15);
        list.print();              // 5 -> 10 -> 15 -> 20 -> 30 -> null

        list.delete(20);
        list.print();              // 5 -> 10 -> 15 -> 30 -> null

        System.out.println(list.contains(15)); // true
        System.out.println(list.size());       // 4
    }
}

class MyLinkedList {

    // Node class
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    // Add to the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Add to the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Insert at a specific index
    public void insertAt(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        Node newNode = new Node(data);
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    // Delete first node with the given value
    public boolean delete(int data) {
        if (head == null) return false;

        if (head.data == data) {
            head = head.next;
            size--;
            return true;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next == null) return false;

        current.next = current.next.next;
        size--;
        return true;
    }

    // Search
    public boolean contains(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) return true;
            current = current.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}