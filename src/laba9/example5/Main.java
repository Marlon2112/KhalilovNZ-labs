package laba9.example5;

public class Main {
    public static void main(String[] args) {
        // Список от головы
        System.out.println("Список от головы:");
        Node head = createListFromHead();
        printList(head);

        // Список от хвоста
        System.out.println("Список от хвоста:");
        Node tail = createListFromTail();
        printList(tail);
    }

    // Метод создания списка от головы
    public static Node createListFromHead() {
        Node head = new Node(1, null);
        head = new Node(2, head);
        head = new Node(3, head);
        // head -> 3 -> 2 -> 1 -> null
        return head;
    }

    // Метод создания списка от хвоста
    public static Node createListFromTail() {
        Node tail = new Node(3, null);
        Node middle = new Node(2, tail);
        Node head = new Node(1, middle);
        // head -> 1 -> 2 -> 3 -> null
        return head;
    }

    // вывод в консоль
    public static void printList(Node head) {
        Node ref = head;
        while (ref != null) {
            System.out.print(ref.value + " ");
            ref = ref.next;
        }
        System.out.println();
    }
}