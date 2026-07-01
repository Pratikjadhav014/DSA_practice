
public class Methods {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    //size of list
    public static int size;//by default java gives 0 

    //Add First
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    //Add Last 
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;

    }
    
    //add node middle in list by index
    public void addAtMiddle(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    //remove first node 
    public int removeFirst()
    {
        if(size == 0)
        {
            System.err.println("list is empty");
            return Integer.MIN_VALUE;//to send default value as response
        }
        else if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val;
        val = head.data;
        head = head.next;
        size--;
        return val;

    }

    //remove last node 
    public int removeLast()
    {
        if(size == 0)
        {
            System.err.println("list is empty");
            return Integer.MIN_VALUE;//to send default value as response
        }
        else if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        
        int i=0;
        Node temp = head;
        while(i<size-2)
        {
            temp = temp.next;
            i++;
        }
        int val = temp.next.data;
        temp.next = null;
        size--;
        tail = temp;
        return val;
    }

    //search value return index of this value
    public int search(int value)
    {
        Node temp = head;
        int i=0;
        while(temp!=null)
        {
            if(temp.data==value)
            {
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    //display(traverse)
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.err.println("null");
    }

    public static void main(String[] args) {

        Methods m = new Methods();


        //add first
        m.addFirst(20);
        m.addFirst(10);
        //m.display();

        //add last
        m.addLast(30);
        m.addLast(40);
        //m.display();

        // //add in middle
        // System.out.println("before add at middle of list:");
        // m.display();
        // int index = 0;
        // m.addAtMiddle(index, 25);
        // System.out.println("after add at middle of list:");
        // m.display();

        // //for getting size of list
        // System.out.println("size of list:" + size);

        // //remove first
        // System.out.println("before remove first node:");
        // m.display();
        // int x = m.removeFirst();
        // System.out.println("removing node data is :"+x);
        // System.out.println("after remove first node:");
        // m.display();

        // //remove last
        // System.out.println("before remove last node:"+"    size :"+size);
        // m.display();
        // int x = m.removeLast();
        // System.out.println("removing node data is :"+x);
        // System.out.println("after remove last node:"+"     size :"+size);
        // m.display();

        //search value and return index
        int value = 30;
        int idx = m.search(value);
        m.display();
        System.out.println("index of "+ value +" is :"+idx);

    }
}
