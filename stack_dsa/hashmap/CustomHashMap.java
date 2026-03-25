class CustomHashMap<K, V> {
    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int size = 10;
    private Node<K, V>[] buckets = new Node[size];

    private int hash(K key) {
        return Math.abs(key.hashCode() % size);
    }

    void put(K key, V value) {
        int index = hash(key);
        Node<K, V> head = buckets[index];

        for (Node<K, V> curr = head; curr != null; curr = curr.next) {
            if (curr.key.equals(key)) {
                curr.value = value;
                return;
            }
        }

        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = head;
        buckets[index] = newNode;
    }

    V get(K key) {
        int index = hash(key);
        Node<K, V> curr = buckets[index];

        while (curr != null) {
            if (curr.key.equals(key)) return curr.value;
            curr = curr.next;
        }
        return null;
    }
}
