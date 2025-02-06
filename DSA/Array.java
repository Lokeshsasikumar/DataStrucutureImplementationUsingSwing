package DSA;
import java.util.Arrays;

public class Array {
    private int[] array; // Array to hold elements
    private int size;    // Maximum size of the array
    private int count;   // Current number of elements

    // Constructor to initialize the array
    public Array(int size) {
        this.size = size; // Set the size
        this.array = new int[size]; // Create the array
        this.count = 0; // Initialize count
    }

    public void insert(int element) {
        if (count < size) { // Check if there is space
            array[count] = element; // Add element
            count++; // Increment count
            System.out.println("Inserted: " + element);
        } else {
            System.out.println("Array is full. Cannot insert " + element);
        }
    }

    // Method to delete an element by index
    public void delete(int index) {
        if (index < 0 || index >= count) { // Check for valid index
            System.out.println("Invalid index. Cannot delete.");
            return;
        }
        int deletedElement = array[index]; // Get the element to delete
        for (int i = index; i < count - 1; i++) { // Shift elements
            array[i] = array[i + 1];
        }
        count--; // Decrease count
        System.out.println("Deleted: " + deletedElement + " at index " + index);
    }

    // Method to display the array
    public String display() {
        return "Array contents: " + Arrays.toString(Arrays.copyOf(array, count)); // Display current elements
    }
}
