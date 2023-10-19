import java.util.Arrays;

/**
 * CustomLinearQueue is a simple implementation of a linear queue (FIFO) data structure in Java.
 */
public class CustomLinearQueue<T> {
    private final Object[] queue; // Array to store elements
    private int front; // Front of the queue
    private int rear; // Rear of the queue
    private int size; // Current size of the queue
    private final int capacity; // Maximum capacity of the queue

    /**
     * Constructs a CustomLinearQueue with the specified initial capacity.
     *
     * @param capacity the initial capacity of the queue
     */
    public CustomLinearQueue(int capacity) {
        this.capacity = capacity;
        queue = new Object[capacity];
        front = rear = -1;
        size = 0;
    }

    /**
     * Adds an element to the rear of the queue.
     *
     * @param element the element to enqueue
     * @return true if the element was enqueued, false if the queue is full
     */
    public boolean enqueue(T element) {
        if (isFull()) {
            return false; // Queue is full
        }
        if (isEmpty()) {
            front = 0;
        }
        rear++;
        queue[rear] = element;
        size++;
        return true;
    }

    /**
     * Removes and returns the element from the front of the queue.
     *
     * @return the element dequeued, or null if the queue is empty
     */
    public T dequeue() {
        if (isEmpty()) {
            return null; // Queue is empty
        }
        T element = (T) queue[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
        size--;
        return element;
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue is empty, false if it contains elements
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Checks if the queue is full.
     *
     * @return true if the queue is full, false if it has room for more elements
     */
    public boolean isFull() {
        return size == capacity;
    }

    /**
     * Returns the current size of the queue.
     *
     * @return the size of the queue
     */
    public int size() {
        return size;
    }

    /**
     * Returns the elements in the queue as an array.
     *
     * @return an array containing the elements in the queue
     */
    public Object[] toArray() {
        Object[] result = new Object[size];
        if (isEmpty()) {
            return result;
        }
        for (int i = 0; i < size; i++) {
            result[i] = queue[front + i];
        }
        return result;
    }

    /**
     * Clears all elements from the queue, making it empty.
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
        // Create a CustomLinearQueue of integers with a capacity of 5
        CustomLinearQueue<Integer> linearQueue = new CustomLinearQueue<>(5);

        // Enqueue elements
        linearQueue.enqueue(1);
        linearQueue.enqueue(2);
        linearQueue.enqueue(3);

        System.out.println("Queue: " + linearQueue);

        // Dequeue elements
        Integer dequeued = linearQueue.dequeue();
        System.out.println("Dequeued: " + dequeued);

        System.out.println("Updated Queue: " + linearQueue);
        System.out.println("Is the queue empty? " + linearQueue.isEmpty());
    }
}