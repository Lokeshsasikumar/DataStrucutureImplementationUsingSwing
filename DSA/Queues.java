package DSA;

public class Queues {
    private Node front, rear;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void dequeue() {
        if (front == null) return;
        front = front.next;
        if (front == null) {
            rear = null;
        }
    }

    public String display() {
        if (front == null) return "Queue is empty";
        StringBuilder result = new StringBuilder();
        Node current = front;
        while (current != null) {
            result.append(current.data).append(" ");
            current = current.next;
        }
        return result.toString().trim();
    }
}
