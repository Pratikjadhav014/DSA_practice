
public class Basic1
{
    public static class Node//static → allows direct access without object
    //Node does not depend on object of outer class (Basic1)
    //A static inner class CAN have objects ✔️
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static void main(String []args)
    {
         Basic1 ll = new Basic1();
         ll.head = new Node(10);
         ll.head.next = new Node(20);

    }
}