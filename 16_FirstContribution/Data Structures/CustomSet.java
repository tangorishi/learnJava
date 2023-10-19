import java.util.ArrayList;
import java.util.List;

/**
 * CustomSet is a simple implementation of a Set data structure in Java.
 * It stores a collection of unique elements without duplicates and provides basic Set operations.
 */
public class CustomSet<T> {
    private final List<T> elements;

    /**
     * Constructs an empty CustomSet.
     */
    public CustomSet() {
        elements = new ArrayList<>();
    }

    /**
     * Adds an element to the set if it is not already present.
     *
     * @param element the element to add
     * @return true if the element was added, false if it was already in the set
     */
    public boolean add(T element) {
        if (!contains(element)) {
            elements.add(element);
            return true;
        }
        return false;
    }

    /**
     * Removes an element from the set if it exists.
     *
     * @param element the element to remove
     * @return true if the element was removed, false if it was not in the set
     */
    public boolean remove(T element) {
        return elements.remove(element);
    }

    /**
     * Checks if the set contains a specific element.
     *
     * @param element the element to check for
     * @return true if the element is in the set, false otherwise
     */
    public boolean contains(T element) {
        return elements.contains(element);
    }

    /**
     * Returns the size (number of elements) of the set.
     *
     * @return the size of the set
     */
    public int size() {
        return elements.size();
    }

    /**
     * Checks if the set is empty.
     *
     * @return true if the set is empty, false if it contains elements
     */
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    /**
     * Returns the elements in the set as a List.
     *
     * @return a List of elements in the set
     */
    public List<T> toList() {
        return elements;
    }

    /**
     * Clears all elements from the set, making it empty.
     */
    public void clear() {
        elements.clear();
    }

    @Override
    public String toString() {
        return elements.toString();
    }

    public static void main(String[] args) {
        // Create a CustomSet of integers
        CustomSet<Integer> intSet = new CustomSet<>();

        // Add elements to the set
        intSet.add(5);
        intSet.add(10);
        intSet.add(5); // Adding a duplicate element

        System.out.println("Set: " + intSet);
        System.out.println("Size: " + intSet.size());

        // Remove an element
        intSet.remove(10);

        System.out.println("Set after removing 10: " + intSet);
        System.out.println("Is the set empty? " + intSet.isEmpty());
    }
}
