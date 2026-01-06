class StackNode {
    int data;
    StackNode next;

    StackNode(int data) {
        this.data = data;
        next = null;
    }
}

public class LinkedListStack {
    StackNode top = null;

    // Push
    void push(int data) {
        StackNode newNode = new StackNode(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed");
    }

    // Pop
    void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(top.data + " popped");
        top = top.next;
    }

    // Display
    void display() {
        StackNode temp = top;
        System.out.print("Stack: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        stack.pop();
        stack.display();
    }
}