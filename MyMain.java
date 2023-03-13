public class MyMain {

    public static void main(String[] args){
        LinkedList sll = new LinkedList("First Node");

        sll.enqueue("Second Node");
        sll.enqueue("Third Node");
        System.out.println(sll.isEmpty());
        System.out.println(sll.first());
        System.out.println(sll.size());
        System.out.println(sll.dequeue());
        System.out.println(sll.size());
        System.out.println(sll.dequeue());
        System.out.println(sll.dequeue());
        System.out.println(sll.isEmpty());
    }
}
