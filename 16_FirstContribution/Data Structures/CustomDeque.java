import java.util.Arrays;

/**
 * CustomDeque is a simple implementation of a double-ended queue (Deque) data structure in Java.
 *
 * @param <T> the type of elements to be stored in the Deque
 */
public class CustomDeque<T> {
    private final Object[] deque; // Array to store elements
    private int front; // Front of the Deque
    private int rear; // Rear of the Deque
    private int size; // Current size of the Deque
    private final int capacity; // Maximum capacity of the Deque

    /**
     * Constructs a CustomDeque with the specified initial capacity.
     *
     * @param capacity the initial capacity of the Deque
     */
    public CustomDeque(int capacity) {
        this.capacity = capacity;
        deque = new Object[capacity];
        front = rear = -1;
        size = 0;
    }

    /**
     * Adds an element to the front of the Deque.
     *
     * @param element the element to add to the front
     * @return true if the element was added, false if the Deque is full
     */
    public boolean addToFront(T element) {
        if (isFull()) {
            return false; // Deque is full
        }
        if (isEmpty()) {
            front = rear = 0;
        } else if (front == 0) {
            front = capacity - 1;
        } else {
            front--;
        }
        deque[front] = element;
        size++;
        return true;
    }

    /**
     * Adds an element to the rear of the Deque.
     *
     * @param element the element to add to the rear
     * @return true if the element was added, false if the Deque is full
     */
    public boolean addToRear(T element) {
        if (isFull()) {
            return false; // Deque is full
        }
        if (isEmpty()) {
            front = rear = 0;
        } else if (rear == capacity - 1) {
            rear = 0;
        } else {
            rear++;
        }
        deque[rear] = element;
        size++;
        return true;
    }

    /**
     * Removes and returns the element from the front of the Deque.
     *
     * @return the element removed from the front, or null if the Deque is empty
     */
    public T removeFromFront() {
        if (isEmpty()) {
            return null; // Deque is empty
        }
        T element = (T) deque[front];
        if (front == rear) {
            front = rear = -1;
        } else if (front == capacity - 1) {
            front = 0;
        } else {
            front++;
        }
        size--;
        return element;
    }

    /**
     * Removes and returns the element from the rear of the Deque.
     *
     * @return the element removed from the rear, or null if the Deque is empty
     */
    public T removeFromRear() {
        if (isEmpty()) {
            return null; // Deque is empty
        }
        T element = (T) deque[rear];
        if (front == rear) {
            front = rear = -1;
        } else if (rear == 0) {
            rear = capacity - 1;
        } else {
            rear--;
        }
        size--;
        return element;
    }

    /**
     * Checks if the Deque is empty.
     *
     * @return true if the Deque is empty, false if it contains elements
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Checks if the Deque is full.
     *
     * @return true if the Deque is full, false if it has room for more elements
     */
    public boolean isFull() {
        return size == capacity;
    }

    /**
     * Returns the current size of the Deque.
     *
     * @return the size of the Deque
     */
    public int size() {
        return size;
    }

    /**
     * Returns the elements in the Deque as an array.
     *
     * @return an array containing the elements in the Deque
     */
    public Object[] toArray() {
        Object[] result = new Object[size];
        if (isEmpty()) {
            return result;
        }
        int index = 0;
        for (int i = front; index < size; i = (i + 1) % capacity) {
            result[index] = deque[i];
            index++;
        }
        return result;
    }

    /**
     * Clears all elements from the Deque, making it empty.
     */
    public void clear() {
        front = rear = -1;
        size = 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }

    public static void main(String[] args) {
        // Create a CustomDeque of integers with a capacity of 5
        CustomDeque<Integer> customDeque = new CustomDeque<>(5);

        // Add elements to the front and rear of the Deque
        customDeque.addToFront(1);
        customDeque.addToFront(2);
        customDeque.addToRear(3);

        System.out.println("Deque: " + customDeque);

        // Remove elements from the front and rear
        Integer removedFront = customDeque.removeFromFront();
        Integer removedRear = customDeque.removeFromRear();
        System.out.println("Removed from front: " + removedFront);
        System.out.println("Removed from rear: " + removedRear);

        System.out.println("Updated Deque: " + customDeque);
        System.out.println("Is the Deque empty? " + customDeque.isEmpty());
    }
}
