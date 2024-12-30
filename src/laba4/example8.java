package laba4;

import java.util.Scanner;

public class example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Шаг 1: Ввод текста
        System.out.println("Введите текст для шифрования:");
        String inputText = in.nextLine();

        // Шаг 2: Ввод ключа
        System.out.println("Введите ключ:");
        int key = in.nextInt();
        in.nextLine(); // Очистка буфера после ввода числа

        // Шифрование текста
        String encryptedText = caesarCipher(inputText, key);
        System.out.println("Текст после преобразования: " + encryptedText);

        // Шаг 3: Обратное преобразование
        while (true) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String answer = in.nextLine().trim().toLowerCase();

            if (answer.equals("y")) {
                String decryptedText = caesarCipher(encryptedText, -key);
                System.out.println("Обратное преобразование: " + decryptedText);
                break;
            } else if (answer.equals("n")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ.");
            }
        }

        in.close();
    }

    // Метод шифрования/дешифрования текста
    public static String caesarCipher(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            // Если символ буква (латиница или кириллица)
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a'; // Определяем базовый символ
                c = (char) ((c - base + shift + 26) % 26 + base); // Циклический сдвиг
            } else if (Character.UnicodeBlock.of(c).equals(Character.UnicodeBlock.CYRILLIC)) {
                // Поддержка кириллицы
                char base = Character.isUpperCase(c) ? 'А' : 'а';
                c = (char) ((c - base + shift + 32) % 32 + base);
            }
            result.append(c);
        }
        return result.toString();
    }
}
