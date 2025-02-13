package laba9.example8;

public class RecursiveLinkedList {
    Node head;

    // Метод для создания списка от головы с рекурсией
    private Node createHeadRec(Node node, int value) {
        if (node == null) {
            return new Node(value, null);
        }
        return new Node(value, node);
    }

    public void createHeadRec() {
        head = createHeadRec(head, 3);
        head = createHeadRec(head, 2);
        head = createHeadRec(head, 1);
    }

    // Метод для создания списка от хвоста с рекурсией
    private Node createTailRec(int value) {
        return new Node(value, null);
    }

    public void createTailRec() {
        Node tail = createTailRec(3);
        Node middle = new Node(2, tail);
        head = new Node(1, middle);
    }

    // Метод для вывода списка, используя рекурсию
    private String toStringRec(Node node) {
        if (node == null) {
            return "";
        }
        return node.value + " " + toStringRec(node.next);
    }

    public String toStringRec() {
        return toStringRec(head).trim();
    }
}