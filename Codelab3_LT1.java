import java.util.Stack;

public class Codelab3_LT1 {
    public static void main(String[] args) {
        Stack s = new Stack ();
        
        System.out.println(s.empty());

        s.push("Bebek");
        s.push("Angsa");
        s.push("Juan");
        s.push("Mamat");
        s.push("Koruptor");

        System.out.println(s.empty());

        System.out.println("peek: " + s.peek());
        System.out.println("Hewan:" + s);

        s.pop();
        s.pop();

        System.out.println("Hewan: " + s);
        System.out.println("Position dari Juan: " + s.search("Juan"));
    }
    
}