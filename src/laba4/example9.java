package laba4;

import java.util.Scanner;

public class example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Шаг 1: Определяем собственный алфавит
        String customAlphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя ,.!?";
        int alphabetLength = customAlphabet.length();

        // Шаг 2: Ввод текста
        System.out.println("Введите текст для шифрования:");
        String inputText = in.nextLine();

        // Шаг 3: Ввод ключа
        System.out.println("Введите ключ:");
        int key = in.nextInt();
        in.nextLine(); // Очистка буфера после ввода числа

        // Шифрование текста
        String encryptedText = caesarCipher(inputText, key, customAlphabet, alphabetLength);
        System.out.println("Текст после преобразования: " + encryptedText);

        // Шаг 4: Обратное преобразование
        while (true) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String answer = in.nextLine().trim().toLowerCase();

            if (answer.equals("y")) {
                String decryptedText = caesarCipher(encryptedText, -key, customAlphabet, alphabetLength);
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

    // Метод шифрования/дешифрования текста с использованием собственного алфавита
    public static String caesarCipher(String text, int shift, String alphabet, int alphabetLength) {
        StringBuilder result = new StringBuilder();

        for (char c : text.toCharArray()) {
            int index = alphabet.indexOf(c); // Находим индекс символа в алфавите
            if (index != -1) {
                // Вычисляем новый индекс с учетом сдвига
                int newIndex = (index + shift + alphabetLength) % alphabetLength;
                result.append(alphabet.charAt(newIndex));
            } else {
                // Если символ не найден в алфавите, оставляем его неизменным
                result.append(c);
            }
        }

        return result.toString();
    }
}
