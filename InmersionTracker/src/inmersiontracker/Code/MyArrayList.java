/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inmersiontracker.Code;

/**
 *
 * @author felip
 */
import java.util.Arrays;

public class MyArrayList {
    private Object[] elements; // Array to store elements
    private int size = 0;      // Number of elements in the list
    private static final int DEFAULT_CAPACITY = 10; // Default initial capacity
    private int currentIndex = 0; // Index to track the current position

    // Constructor with default capacity
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // Constructor with specified initial capacity
    public MyArrayList(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Initial capacity must be greater than 0");
        }
        elements = new Object[initialCapacity];
    }

    // Add an element to the list
    public void add(Object element) {
        ensureCapacity();
        elements[size++] = element;
    }

    // Get an element at a specific index
    public Object get(int index) {
        checkIndex(index);
        return elements[index];
    }

    // Remove an element at a specific index
    public Object remove(int index) {
        checkIndex(index);
        Object removedElement = elements[index];
        // Shift elements to fill the gap
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null; // Avoid memory leak
        return removedElement;
    }

    // Get the size of the list
    public int size() {
        return size;
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Ensure sufficient capacity
    private void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2); // Double the capacity
        }
    }

    // Check if the index is valid
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
    
    // Custom method to check if there is a next element
    public boolean hasNext() {
        return currentIndex < size;
    }

    // Custom method to return the next element in the list
    public Object next() {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException("No more elements in the list.");
        }
        return elements[currentIndex++];
    }   

    // Override toString for better visualization
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size));
    }
}
