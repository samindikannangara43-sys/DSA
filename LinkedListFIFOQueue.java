class QueueNode {
    int data;
    QueueNode next;

    QueueNode(int data) {
        this.data = data;
        next = null;
    }
}

public class LinkedListFIFOQueue {
    QueueNode front = null;
    QueueNode rear = null;

    // Enqueue
    void enqueue(int data) {
        QueueNode newNode = new QueueNode(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue
    void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(front.data + " dequeued");
        front = front.next;

        if (front == null)
            rear = null;
    }

    // Display
    void display() {
        QueueNode temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListFIFOQueue queue = new LinkedListFIFOQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();

        queue.dequeue();
        queue.display();
    }
}