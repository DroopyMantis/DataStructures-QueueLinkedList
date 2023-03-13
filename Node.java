public class Node {
    public String name;
    public Node next;

    public Node(){
        name = null;
        next = null;
    }

    public Node(String item){
        name = item;
        next = null;
    }

    public Node getNext() {
        return next;
    }

    public String getName(){
        return name;
    }
}