import java.util.LinkedList;
import java.util.Queue;

public class Codelab3_LT2 {
    public static void main(String[] args) {
        Queue q = new LinkedList<>();

        q.add("Bebek");
        q.add("Angsa");
        q.add("Juan");
        q.add("Mamat");
        q.add("Koruptor");

        System.out.println("Peek: " + q.peek());
        System.out.println("Hewan: " + q);

        q.poll();
        q.poll();

        System.out.println("Hewan: " + q);
    }
}
