public class LinkedList {
    //Linked lst has nodes
    //Each node has data and pointer to next node
    //At the bare minimum it needs a head that could be null
    //there should be an index to track the node location.
    //It needs to have a method to add a node by receiving data
    //It should have the ability to insert nodes at any location
    //It should have the ability search by node data

   // Defining the node
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // Defining the head of the Linked list as null
    public Node head;

    // adding node
    public String addNode(int data){
        if (head == null){
            Node newNode = new Node(data);
            head = newNode;

        }
        else{
            Node newNode = new Node(data);
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = newNode;
            return "Added a node";
        }
        return "Added a node";
    }

    // inserting a before data
    public String insertNode(int data1, int data2) {
        if (head == null){
            return "Head is null, so data not found";
        }

        if (head.data == data1) {
            Node newNode = new Node(data2);
            newNode.next = head;
            head = newNode;
            return "Inserted ahead of head";
        }
        Node newNode = new Node(data2);
        Node current = head;
        while(current.next !=null){
            if (current.next.data == data1){
                newNode.next =current.next;
                current.next = newNode;
                return "Inserted a node";
            }
            current = current.next;
        }
        return "Data not found";

    }

    // search for data
    public String seachNode(int data){
        if (head == null){
            return "Data not found";
        }
        else{
            Node current = head;
            int index = 0;
            boolean flag = false;
            while(current != null){
                if (current.data == data){
                    flag = true;
                    return "Data is found" + data + "at index" + index;
                }
                current = current.next;
                index++;
            }
        }
        return "Data not found";

    }

    // remove
    public String delNode(int data){
        if (head == null){
            return "Nothing to delete";
        }

        if (head.data == data){
            head = head.next;
            return "Made head null";
        }
        else{
            Node current = head;
            while (current.next != null){
                if (current.next.data == data){
                    current.next = current.next.next;
                    return "Deleted the node";
                }
                current = current.next;
            }

        }

        return "Nothing was deleted";
    }

    public static void main(String[] args) {
        // Will update after creating all classes and method
        LinkedList familyLinkedList = new LinkedList();
        System.out.println(familyLinkedList.addNode(6));
//        System.out.println(familyLinkedList.addNode(10));
//        System.out.println(familyLinkedList.addNode(11));
        System.out.println(familyLinkedList.seachNode(10));




    }

}


//import java.util.LinkedList;

//        LinkedList <String> names = new LinkedList<>();
//        names.add("roshan");
//        System.out.println(names);
//        names.add("deepa");
//        System.out.println(names);
//        names.add("vincent");
//        System.out.println(names);
//        names.add(1,"daniel");
//        System.out.println(names);
//        names.removeFirst();
//        System.out.println(names);
//        names.removeLast();
//        System.out.println(names);


