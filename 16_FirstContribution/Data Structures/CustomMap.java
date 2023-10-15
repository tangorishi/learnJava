/**
 * CustomMap is a simple implementation of a map (key-value pairs) data structure in Java.
 */
public class CustomMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;  // Default initial capacity
    private final Entry<K, V>[] table; // Array of key-value pairs
    private int size;  // Current number of key-value pairs

    /**
     * An entry in the map containing a key and a value.
     */
    static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next; // For handling collisions

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    /**
     * Constructs a CustomMap with the default initial capacity.
     */
    public CustomMap() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Constructs a CustomMap with a specified initial capacity.
     *
     * @param initialCapacity the initial capacity of the map
     */
    public CustomMap(int initialCapacity) {
        table = new Entry[initialCapacity];
        size = 0;
    }

    /**
     * Associates the specified value with the specified key in the map.
     *
     * @param key   the key to associate with the value
     * @param value the value to be associated with the key
     */
    public void put(K key, V value) {
        int index = key.hashCode() % table.length;

        Entry<K, V> newEntry = new Entry<>(key, value);
        if (table[index] == null) {
            table[index] = newEntry;
        } else {
            // Handle collisions by adding to the linked list at the same index
            Entry<K, V> current = table[index];
            while (current.next != null) {
                if (current.key.equals(key)) {
                    current.value = value; // Update the value for an existing key
                    return;
                }
                current = current.next;
            }
            current.next = newEntry;
        }
        size++;
    }

    /**
     * Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
     *
     * @param key the key whose associated value is to be returned
     * @return the value to which the specified key is mapped, or null if the key is not found
     */
    public V get(K key) {
        int index = key.hashCode() % table.length;
        Entry<K, V> entry = table[index];

        while (entry != null) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
            entry = entry.next;
        }
        return null; // Key not found
    }

    /**
     * Removes the mapping for the specified key from this map if present.
     *
     * @param key the key whose mapping is to be removed from the map
     */
    public void remove(K key) {
        int index = key.hashCode() % table.length;
        Entry<K, V> current = table[index];
        Entry<K, V> previous = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (previous != null) {
                    previous.next = current.next;
                } else {
                    table[index] = current.next;
                }
                size--;
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    /**
     * Returns the number of key-value mappings in this map.
     *
     * @return the number of key-value mappings in this map
     */
    public int size() {
        return size;
    }

    /**
     * Checks if the map is empty.
     *
     * @return true if the map is empty, false otherwise
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Clears all key-value mappings from the map, making it empty.
     */
    public void clear() {
        for (int i = 0; i < table.length; i++) {
            table[i] = null;
        }
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        for (Entry<K, V> entry : table) {
            while (entry != null) {
                sb.append(entry.key).append("=").append(entry.value).append(", ");
                entry = entry.next;
            }
        }
        if (sb.length() > 2) {
            sb.setLength(sb.length() - 2); // Remove the trailing ", "
        }
        sb.append(" }");
        return sb.toString();
    }

    public static void main(String[] args) {
        CustomMap<String, Integer> customMap = new CustomMap<>();

        customMap.put("one", 1);
        customMap.put("two", 2);
        customMap.put("three", 3);

        System.out.println("Map: " + customMap);
        System.out.println("Size: " + customMap.size());

        customMap.remove("two");
        System.out.println("Map after removing 'two': " + customMap);
        System.out.println("Is the map empty? " + customMap.isEmpty());
    }
}
