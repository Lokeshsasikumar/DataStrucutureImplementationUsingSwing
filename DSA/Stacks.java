package DSA;

public class Stacks {
    int[] stack; // Array to hold stack elements
    int top; // Index of the top element
    private int size; // Maximum size of the stack

    // Constructor to initialize the stack
    public Stacks(int size) {
        this.size = size; // Set the size
        this.stack = new int[size]; // Create the stack array
        this.top = -1; // Initialize top to -1 (indicating an empty stack)
    }

    // Method to push an item onto the stack
    public void push(int item) {
        if (top < size - 1) { // Check if stack is not full
            top++; // Increment top
            stack[top] = item; // Add item to the stack
        } else {
            System.out.println("Stack is full. Cannot push " + item);
        }
    }

    // Method to pop an item from the stack
    public Integer pop() {
        if (top >= 0) { // Check if stack is not empty
            int item = stack[top]; // Get the top item
            top--; // Decrement top
            return item; // Return the popped item
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return null; // Return null if stack is empty
        }
    }

    // Method to check if the stack is empty
     public void display() {
    	 for(int i=top;i>=0;i--) {
    		 System.out.println(stack[i]);
    	 }
     }
}
