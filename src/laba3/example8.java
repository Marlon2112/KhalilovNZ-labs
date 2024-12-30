package laba3;

public class example8 {
    public static void main(String[] args) {
        // Массив для хранения 10 согласных букв
        char[] consonants = new char[10];

        // Начальные значения
        char character = 'B'; // Начинаем с первой согласной буквы
        int index = 0; // Индекс для массива

        // Заполнение массива согласными буквами
        while (index < 10) {
            // Если текущая буква согласная, добавляем её в массив
            if (character != 'A' && character != 'E' && character != 'I' && character != 'O' && character != 'U') {
                consonants[index] = character;
                index++;
            }
            // Переходим к следующей букве
            character++;
        }

        // Отображение содержимого массива
        System.out.println("Согласные буквы в массиве:");
        for (char consonant : consonants) {
            System.out.print(consonant + " ");
        }
    }
}
