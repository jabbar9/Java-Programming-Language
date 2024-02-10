public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //Methods
    public void addFirst(int data){
        //Step 1:- Create New Node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //Step 2:- new Node's Next = head
        newNode.next = head;

        //Step 3:- head = newNode
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //Step 2:- Point Your Tail 
        tail.next = newNode;

        //Step 3:- Shift your Tail Towards last Node
        tail = newNode;
    }
    //Print Linked List
    public void print(){
        if(head == null){
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;

        while(i < idx-1){
            temp = temp.next;
            i++;            
        }

        //i = idx-1;  temp --> prev
        newNode.next = temp.next; //Pointing the Previous Node to New Node
        temp.next = newNode; //Assigning the new Node to temp.next as its next node
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 9);
        ll.print();
        //System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
    }
}
