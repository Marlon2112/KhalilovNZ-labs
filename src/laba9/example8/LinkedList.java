package laba9.example8;

public class LinkedList {
    Node head;

    public void createHead() {
        head = new Node(1, null);
        head = new Node(2, head);
        head = new Node(3, head);
    }

    public void createTail() {
        Node tail = new Node(3, null);
        Node middle = new Node(2, tail);
        head = new Node(1, middle);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        Node ref = head;
        while (ref != null) {
            result.append(ref.value).append(" ");
            ref = ref.next;
        }
        return result.toString().trim();
    }

    public void addFirst(int value) {
        head = new Node(value, head);
    }

    public void addLast(int value) {
        if (head == null) {
            head = new Node(value, null);
        } else {
            Node ref = head;
            while (ref.next != null) {
                ref = ref.next;
            }
            ref.next = new Node(value, null);
        }
    }

    public void insert(int index, int value) {
        if (index == 0) {
            addFirst(value);
            return;
        }

        Node ref = head;
        for (int i = 0; i < index - 1 && ref != null; i++) {
            ref = ref.next;
        }

        if (ref != null) {
            ref.next = new Node(value, ref.next);
        }
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void removeLast() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
    }

    public void remove(int index) {
        if (head == null) return;
        if (index == 0) {
            removeFirst();
            return;
        }
        Node ref = head;
        for (int i = 0; i < index - 1 && ref != null; i++) {
            ref = ref.next;
        }
        if (ref != null && ref.next != null) {
            ref.next = ref.next.next;
        }
    }
}