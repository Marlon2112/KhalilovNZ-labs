package laba10.example1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        EmployeeXmlManager manager = new EmployeeXmlManager();
        while (true) {
            System.out.println("Выберите действие: 1 - Добавить, 2 - Найти, 3 - Удалить, 4 - Выйти");
            int choice = in.nextInt();
            in.nextLine(); // очистка буфера

            switch (choice) {
                case 1:
                    System.out.print("Введите имя: ");
                    String name = in.nextLine();
                    System.out.print("Введите должность: ");
                    String position = in.nextLine();
                    System.out.print("Введите дату рождения (дд.мм.гггг): ");
                    String birthday = in.nextLine();
                    manager.addEmployee(name, position, birthday);
                    break;
                case 2:
                    System.out.print("Введите имя или год рождения для поиска: ");
                    String query = in.nextLine();
                    manager.searchEmployee(query);
                    break;
                case 3:
                    System.out.print("Введите имя сотрудника для удаления: ");
                    String nameToDelete = in.nextLine();
                    manager.deleteEmployee(nameToDelete);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Неверный выбор");
            }
        }
    }
}