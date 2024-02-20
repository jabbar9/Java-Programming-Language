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
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        //Prev: i = size - 2
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;            
        }
        int val = prev.next.data;  //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int itrSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){ //Key Found
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head, int key){
        //Base Case
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void deleteNthFromEnd(int n){
        //Calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if(n == sz){
            head = head.next;
            return;            
        }

        //sz-n
        int i = 1;
        int itoFind = sz-n;
        Node prev = head;
        while(i < itoFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    //Slow Fast Approach
    public Node findMid(Node head){ //Helper Function
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next; //+2
        }
        return slow; //slow is my midnode
    }
    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //Step 1- Find Mid
        Node midNode = findMid(head);

        //Step 2- Reverse 2nd Half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;  //Right Half Head
        Node left = head;

        //Step 3- Check left & Right are equal or not
        if(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next; //Slow+1
            fast = fast.next.next; //Fast+2
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        //Detct Cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        //Find Meeting Point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //remove cycle ->last.next = null
        prev.next = null;
    }

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;  //MidNode
    }

    public Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (head1 != null && head2 != null) {
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;                            
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }
    public Node mergeSort(Node head){
        //Base Case
        if(head == null || head.next == null){
            return head;
        }
        //Find Mid
        Node mid = getMid(head);
        //left & Right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);  //Left Half
        Node newRight = mergeSort(rightHead);  //Right Half
        //Merge
        return merge(newLeft, newRight);
    }

    public void zigZag(){
        //Find Mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //Reverse 2nd Half
        Node curr = mid.next;
        mid.next = null; //Left half tail points to null now
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;            
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        //Alternate - merge -zig zag merge
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }
    public static void main(String[] args){
        //LinkedList ll = new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2, 3);
        // ll.print();
        //System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);
        // System.out.println(ll.itrSearch(3));
        // System.out.println(ll.itrSearch(10));
        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(10));
        // ll.reverse();
        // ll.print();
        // ll.deleteNthFromEnd(3);
        // ll.print();        
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.print();
        // System.out.println(ll.checkPalindrome());

        //For isCycle
        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = head;
        // System.out.println(isCycle());

        //For removing Cycle
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;

        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

        //Merge Sort
        // LinkedList ll = new LinkedList();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(4);
        // ll.addFirst(5);
        // ll.print();
        // ll.head = ll.mergeSort(ll.head);
        // ll.print();

        //Zig Zag LL
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.zigZag();
        ll.print();
    }
}
