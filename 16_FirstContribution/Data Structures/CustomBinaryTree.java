import java.util.Arrays;

/**
 * CustomBinaryTree is a simple implementation of a binary tree data structure in Java.
 */
public class CustomBinaryTree<T> {
    private Node<T> root;

    /**
     * A class representing a node in the binary tree.
     */
    private static class Node<T> {
        T data;
        Node<T> left;
        Node<T> right;

        Node(T data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    /**
     * Constructs an empty CustomBinaryTree.
     */
    public CustomBinaryTree() {
        root = null;
    }

    /**
     * Inserts a new node with the specified data into the binary tree.
     *
     * @param data the data to insert
     */
    public void insert(T data) {
        root = insertRecursive(root, data);
    }

    /**
     * Helper method to recursively insert a new node with the specified data into the binary tree.
     *
     * @param current the current node being considered
     * @param data    the data to insert
     * @return the updated node after insertion
     */
    private Node<T> insertRecursive(Node<T> current, T data) {
        if (current == null) {
            return new Node<>(data);
        }

        if (compare(data, current.data) < 0) {
            current.left = insertRecursive(current.left, data);
        } else if (compare(data, current.data) > 0) {
            current.right = insertRecursive(current.right, data);
        }

        return current;
    }

    /**
     * Searches for a node with the specified data in the binary tree.
     *
     * @param data the data to search for
     * @return true if the data is found in the tree, false otherwise
     */
    public boolean search(T data) {
        return searchRecursive(root, data);
    }

    /**
     * Helper method to recursively search for a node with the specified data in the binary tree.
     *
     * @param current the current node being considered
     * @param data    the data to search for
     * @return true if the data is found in the tree, false otherwise
     */
    private boolean searchRecursive(Node<T> current, T data) {
        if (current == null) {
            return false;
        }

        if (compare(data, current.data) == 0) {
            return true;
        }

        if (compare(data, current.data) < 0) {
            return searchRecursive(current.left, data);
        }

        return searchRecursive(current.right, data);
    }

    /**
     * Deletes a node with the specified data from the binary tree.
     *
     * @param data the data to delete
     */
    public void delete(T data) {
        root = deleteRecursive(root, data);
    }

    /**
     * Helper method to recursively delete a node with the specified data from the binary tree.
     *
     * @param current the current node being considered
     * @param data    the data to delete
     * @return the updated node after deletion
     */
    private Node<T> deleteRecursive(Node<T> current, T data) {
        if (current == null) {
            return null;
        }

        if (compare(data, current.data) < 0) {
            current.left = deleteRecursive(current.left, data);
        } else if (compare(data, current.data) > 0) {
            current.right = deleteRecursive(current.right, data);
        } else {
            if (current.left == null) {
                return current.right;
            } else if (current.right == null) {
                return current.left;
            }

            current.data = minValue(current.right);
            current.right = deleteRecursive(current.right, current.data);
        }

        return current;
    }

    /**
     * Finds the minimum value in the binary tree.
     *
     * @param node the root of the subtree to search
     * @return the minimum value in the tree
     */
    private T minValue(Node<T> node) {
        T minValue = node.data;
        while (node.left != null) {
            minValue = node.left.data;
            node = node.left;
        }
        return minValue;
    }

    /**
     * Compares two elements to determine their order in the tree.
     *
     * @param a the first element
     * @param b the second element
     * @return a negative integer if a < b, 0 if a == b, a positive integer if a > b
     */
    private int compare(T a, T b) {
        return ((Comparable<T>) a).compareTo(b);
    }

    /**
     * Performs an in-order traversal of the binary tree and returns the elements in sorted order.
     *
     * @return an array containing the sorted elements
     */
    public T[] inOrderTraversal() {
        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Object[size()];
        inOrderTraversalRecursive(root, result, 0);
        return result;
    }

    /**
     * Helper method to perform an in-order traversal of the binary tree and populate the sorted elements in an array.
     *
     * @param current the current node being considered
     * @param result  the array to store the sorted elements
     * @param index   the current index in the result array
     * @return the updated index
     */
    private int inOrderTraversalRecursive(Node<T> current, T[] result, int index) {
        if (current != null) {
            index = inOrderTraversalRecursive(current.left, result, index);
            result[index++] = current.data;
            index = inOrderTraversalRecursive(current.right, result, index);
        }
        return index;
    }

    /**
     * Returns the number of nodes in the binary tree.
     *
     * @return the number of nodes
     */
    public int size() {
        return sizeRecursive(root);
    }

    /**
     * Helper method to recursively calculate the number of nodes in the binary tree.
     *
     * @param current the current node being considered
     * @return the number of nodes in the tree
     */
    private int sizeRecursive(Node<T> current) {
        if (current == null) {
            return 0;
        }
        return 1 + sizeRecursive(current.left) + sizeRecursive(current.right);
    }

    /**
     * Clears all nodes from the binary tree, making it empty.
     */
    public void clear() {
        root = null;
    }

    public static void main(String[] args) {
        // Create a CustomBinaryTree of integers
        CustomBinaryTree<Integer> customBinaryTree = new CustomBinaryTree<>();

        // Insert elements into the tree
        customBinaryTree.insert(5);
        customBinaryTree.insert(2);
        customBinaryTree.insert(8);
        customBinaryTree.insert(1);
        customBinaryTree.insert(3);

        System.out.println("In-Order Traversal: " + Arrays.toString(customBinaryTree.inOrderTraversal()));

        // Search for elements in the tree
        System.out.println("Search for 2: " + customBinaryTree.search(2));
        System.out.println("Search for 6: " + customBinaryTree.search(6));

        // Delete an element from the tree
        customBinaryTree.delete(2);
        System.out.println("After deleting 2: " + Arrays.toString(customBinaryTree.inOrderTraversal()));

        System.out.println("Size of the tree: " + customBinaryTree.size());

        // Clear the tree
        customBinaryTree.clear();
        System.out.println("Is the tree empty? " + (customBinaryTree.size() == 0));
    }
}
