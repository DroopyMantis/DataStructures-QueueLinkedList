public class LinkedList implements Queue{

    private Node head;

    public LinkedList() {
        head = new Node();
    }

    public LinkedList(String item) {
        head = new Node(item);
    }

    @Override
    public void enqueue(String n) {
        if(isEmpty() == true){
            head = new Node(n);
        }else{
            Node x = head;
            while(x.next != null){
                x = x.getNext();
            }
            x.next = new Node(n);
        }

    }

    @Override
    public String dequeue() {
        if(isEmpty() == true){
            return null;
        }
        Node temp = head;
        head = temp.getNext();
        temp.next = null;
        return temp.getName();

    }

    @Override
    public String first() {
        if(isEmpty() == true){
            return null;
        }
        return head.getName();
    }

    @Override
    public int size() {
        if(isEmpty() == true){
            return 0;
        }
        Node x = head;
        int counter = 1;
        while(x.getNext() != null){
            counter++;
            x = x.getNext();
        }
        return counter;
    }

    @Override
    public boolean isEmpty() {
        if(head == null){
            return true;
        }
        return false;
    }
}
