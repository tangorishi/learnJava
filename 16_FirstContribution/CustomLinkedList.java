public class CustomLinkedList<T> {

    private Node<T> head;
    private int size;

    public CustomLinkedList() {
        head = null;
        size = 0;
    }

    public void add(T element) {
        Node<T> newNode = new Node<>(element);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }

    public void addFirst(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(T element) {
        Node<T> newNode = new Node<>(element);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }

    public T removeFirst() {
        if (head == null) {
            return null;
        }

        T element = head.data;
        head = head.next;
        size--;

        return element;
    }

    public T removeLast() {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            T element = head.data;
            head = null;
            size--;
            return element;
        }

        Node<T> currentNode = head;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }

        T element = currentNode.next.data;
        currentNode.next = null;
        size--;

        return element;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        if (index == 0) {
            return removeFirst();
        }

        Node<T> currentNode = head;
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }

        T element = currentNode.next.data;
        currentNode.next = currentNode.next.next;
        size--;

        return element;
    }

    public int size() {
        return size;
    }

    public void display() {
        Node<T> currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();

        // Test adding elements
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Expected: 1 2 3");
        System.out.print("Actual: ");
        list.display();
        System.out.println();

        // Test adding elements at the beginning
        list.addFirst(0);
        System.out.println("Expected: 0 1 2 3");
        System.out.print("Actual: ");
        list.display();
        System.out.println();

        // Test adding elements at the end
        list.addLast(4);
        System.out.println("Expected: 0 1 2 3 4");
        System.out.print("Actual: ");
        list.display();
        System.out.println();

        // Test removing elements
        int removed = list.removeFirst();
        System.out.println("Expected: Removed: 0");
        System.out.println("Actual: Removed: " + removed);
        System.out.println("Expected: 1 2 3 4");
        System.out.print("Actual: ");
        list.display();
        System.out.println();

        removed = list.removeLast();
        System.out.println("Expected: Removed: 4");
        System.out.println("Actual: Removed: " + removed);
        System.out.println("Expected: 1 2 3");
        System.out.print("Actual: ");
        list.display();
        System.out.println();

        // Test removing elements by index
        removed = list.remove(1);
        System.out.println("Expected: Removed: 2");
        System.out.println("Actual: Removed: " + removed);
        System.out.println("Expected: 1 3");
        System.out.print("Actual: ");
        list.display();
        System.out.println();

        // Test removing elements by invalid index
        removed = list.remove(3);
        System.out.println("Expected: Removed: null (Invalid index)");
        System.out.println("Actual: Removed: " + removed);
    }
}

