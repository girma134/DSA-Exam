package Question3;
import java.util.Stack;

class QueueUsingStack {
    private Stack<Integer> inbox;
    private Stack<Integer> outbox;

    public QueueUsingStack() {
        inbox = new Stack<>();
        outbox = new Stack<>();
    }

    public void enqueue(int item) {
        inbox.push(item);
    }

    public int dequeue() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        if (outbox.isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return outbox.pop();
    }

    public int peek() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        if (outbox.isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return outbox.peek();
    }

    public boolean isEmpty() {
        return inbox.isEmpty() && outbox.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(6);
        queue.enqueue(53);
        queue.enqueue(33);

        System.out.println("Front element: " + queue.peek());

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());

        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
