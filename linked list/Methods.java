
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

    //Add First
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;

        head = newNode;
    }

    //Add Last 
    public void addLast(int data)
    {
        Node newNode = new Node(data);

        if(tail == null)
        {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        
        tail = newNode;

    }

    //display(traverse)
    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Methods m = new Methods();

        m.addFirst(10);
        m.addFirst(20);
        //m.display();

        m.addLast(30);
        m.addLast(40);
        m.display();
    }
}
