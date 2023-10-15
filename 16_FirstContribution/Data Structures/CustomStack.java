/**
 * CustomStack is a simple implementation of a stack (Last-In, First-Out - LIFO) data structure in Java.
 */
public class CustomStack<T> {
    private final Object[] stack; // Array to store elements
    private int top; // Index of the top element
    private final int capacity; // Maximum capacity of the stack

    /**
     * Constructs a CustomStack with the specified initial capacity.
     *
     * @param capacity the initial capacity of the stack
     */
    public CustomStack(int capacity) {
        this.capacity = capacity;
        stack = new Object[capacity];
        top = -1;
    }

    /**
     * Pushes an element onto the stack.
     *
     * @param element the element to push
     */
    public void push(T element) {
        if (isFull()) {
            return; // Stack is full
        }
        top++;
        stack[top] = element;
    }

    /**
     * Pops and returns the top element from the stack.
     *
     * @return the top element, or null if the stack is empty
     */
    public T pop() {
        if (isEmpty()) {
            return null; // Stack is empty
        }
        T element = (T) stack[top];
        top--;
        return element;
    }

    /**
     * Retrieves the top element from the stack without removing it.
     *
     * @return the top element, or null if the stack is empty
     */
    public T peek() {
        if (isEmpty()) {
            return null; // Stack is empty
        }
        return (T) stack[top];
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false if it contains elements
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Checks if the stack is full.
     *
     * @return true if the stack is full, false if it has room for more elements
     */
    public boolean isFull() {
        return top == capacity - 1;
    }

    /**
     * Returns the current size of the stack.
     *
     * @return the size of the stack
     */
    public int size() {
        return top + 1;
    }

    /**
     * Clears all elements from the stack, making it empty.
     */
    public void clear() {
        top = -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i <= top; i++) {
            sb.append(stack[i]);
            if (i < top) {
                sb.append(", ");
            }
        }
        sb.append(" ]");
        return sb.toString();
    }

    public static void main(String[] args) {
        // Create a CustomStack of integers with a capacity of 5
        CustomStack<Integer> customStack = new CustomStack<>(5);

        // Push elements onto the stack
        customStack.push(1);
        customStack.push(2);
        customStack.push(3);

        System.out.println("Stack: " + customStack);

        // Pop elements
        Integer popped = customStack.pop();
        System.out.println("Popped: " + popped);

        System.out.println("Updated Stack: " + customStack);
        System.out.println("Is the stack empty? " + customStack.isEmpty());
    }
}
