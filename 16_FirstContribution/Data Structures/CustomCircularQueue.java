import java.util.Arrays;

/**
 * CustomCircularQueue is a simple implementation of a circular queue in Java.
 * It supports basic queue operations such as enqueue, dequeue, and checking if the queue is empty or full.
 */
public class CustomCircularQueue<T> {
    private final Object[] queue;
    private int front;  // Front of the queue
    private int rear;   // Rear of the queue
    private int size;   // Current size of the queue
    private final int capacity; // Maximum capacity of the queue

    /**
     * Constructs a circular queue with a specified capacity.
     *
     * @param capacity the maximum capacity of the circular queue
     */
    public CustomCircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new Object[capacity];
        this.front = this.rear = -1;
        this.size = 0;
    }

    /**
     * Adds an element to the rear of the circular queue.
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
        rear = (rear + 1) % capacity;
        queue[rear] = element;
        size++;
        return true;
    }

    /**
     * Removes and returns the element from the front of the circular queue.
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
            front = (front + 1) % capacity;
        }
        size--;
        return element;
    }

    /**
     * Checks if the circular queue is empty.
     *
     * @return true if the queue is empty, false if it contains elements
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Checks if the circular queue is full.
     *
     * @return true if the queue is full, false if it has room for more elements
     */
    public boolean isFull() {
        return size == capacity;
    }

    /**
     * Returns the current size of the circular queue.
     *
     * @return the size of the queue
     */
    public int size() {
        return size;
    }

    /**
     * Returns the elements in the circular queue as an array.
     *
     * @return an array containing the elements in the queue
     */
    public Object[] toArray() {
        Object[] result = new Object[size];
        if (isEmpty()) {
            return result;
        }
        int index = 0;
        for (int i = front; i != rear; i = (i + 1) % capacity) {
            result[index++] = queue[i];
        }
        result[index] = queue[rear];
        return result;
    }

    /**
     * Clears all elements from the circular queue, making it empty.
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
        // Create a CustomCircularQueue of integers with a capacity of 5
        CustomCircularQueue<Integer> circularQueue = new CustomCircularQueue<>(5);

        // Enqueue elements
        circularQueue.enqueue(1);
        circularQueue.enqueue(2);
        circularQueue.enqueue(3);

        System.out.println("Queue: " + circularQueue);

        // Dequeue elements
        Integer dequeued = circularQueue.dequeue();
        System.out.println("Dequeued: " + dequeued);

        System.out.println("Updated Queue: " + circularQueue);
        System.out.println("Is the queue empty? " + circularQueue.isEmpty());
    }
}
