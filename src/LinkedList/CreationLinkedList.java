package LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class CreationLinkedList {
    //Insert Node at the end
   public static Node insertNode(Node head, int data){
        Node newNode = new Node(data);
        if(head == null){
            return  newNode;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
   }
    //Insert Node at the beginning
    public static Node insertNodeAtBeginning(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    //Insert Node at the position
    public static Node insertNodeAtPosition(Node head, int data, int pos){
        Node newNode = new Node(data);
        Node temp = head;
        int index = 1;
        while(index < pos-1){
            temp = temp.next;
            index++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    //Delete Node at the start
    public static Node deleteNodeAtStart(Node head){
        head = head.next;
        return head;
    }

    //Delete Node at the end
    public static Node deleteNodeAtEnd(Node head){
       Node temp = head;
       while (temp.next.next != null){
           temp = temp.next;
       }
       temp.next=null;
       return head;
    }

    //Delete Node at the position
    public static Node deleteNodeAtPosition(Node head, int pos){
        Node temp = head;
        int index = 1;
        while (index < pos-1){
            temp = temp.next;
            index++;
        }
        temp.next=temp.next.next;
        return head;
    }

    //Search element in linked list
    public static boolean searchElement(Node head, int element){
        Node temp = head;
        if(head == null){
            return false;
        }
        while (temp != null) {
            if (temp.data == element) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Size of the Linked List

    public static int sizeOfLinkedList(Node head){
       Node temp = head;
       int count=0;
       if(head == null){
           return 0;
       }
       while (temp!=null){
           temp = temp.next;
           count++;
       }
       return count;
    }

    // Print Linked List
    public static void printLinkedList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+ "-> ");
            temp=temp.next;
        }
        System.out.println();
    }

    //Rotate linked list clockwise
    public static Node rotateClockwise(Node head){
       Node temp = head;
        if (head == null) {
            return head;
        }
        while (temp.next.next != null){
            temp = temp.next;
        }
        Node newHead = temp.next;
        temp.next=null;
        newHead.next=head;
        return  newHead;
    }

    //Rotate linked list anti-clockwise
    public static Node rotateAntiClockwise(Node head){
        Node newHead = head.next;
        //Node tmp = head;

        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        head.next = null;

        return  newHead;
    }
    public static void main(String[] args){
        Node head = new Node(5);
        insertNode(head, 10);
        insertNode(head, 15);
        insertNode(head, 20);
        head = insertNodeAtBeginning(head,25);
        insertNodeAtPosition(head,12, 2);
        //head = deleteNodeAtStart(head);
        //head = deleteNodeAtEnd(head);
        //head = deleteNodeAtPosition(head, 3);
        System.out.println("Linked List before rotate");
        printLinkedList(head);
        head = rotateClockwise(head);
        System.out.println("Linked List after rotate");
        printLinkedList(head);
        head = rotateAntiClockwise(head);
        System.out.println("Linked List after anti-rotate");
        printLinkedList(head);
        System.out.println("Size of the Linked List "+sizeOfLinkedList(head));
        System.out.println("Searching of element in the Linked List "+searchElement(head,10));
    }
}
