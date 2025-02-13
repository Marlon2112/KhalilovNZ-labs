package laba9.example8;

public class Main {
    public static void main(String[] args) {
        // Работаем с обычным списком
        LinkedList list = new LinkedList();
        list.createHead();
        System.out.println("Список после ввода с головы: " + list.toString());

        list.createTail();
        System.out.println("Список после ввода с хвоста: " + list.toString());

        list.addFirst(0);
        System.out.println("Список после добавления 0 в начало: " + list.toString());

        list.addLast(4);
        System.out.println("Список после добавления 4 в конец: " + list.toString());

        list.insert(2, 5);
        System.out.println("Список после вставки 5 на позицию 2: " + list.toString());

        list.removeFirst();
        System.out.println("Список после удаления первого элемента: " + list.toString());

        list.removeLast();
        System.out.println("Список после удаления последнего элемента: " + list.toString());

        list.remove(1);
        System.out.println("Список после удаления элемента с индекса 1: " + list.toString());

        // Работаем с рекурсивным списком
        RecursiveLinkedList recursiveList = new RecursiveLinkedList();
        recursiveList.createHeadRec();
        System.out.println("Рекурсивный список после ввода с головы: " + recursiveList.toStringRec());

        recursiveList.createTailRec();
        System.out.println("Рекурсивный список после ввода с хвоста: " + recursiveList.toStringRec());
    }
}

