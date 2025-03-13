package laba10.example2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager("src/laba10/example2/example-employee.json");
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Найти сотрудника");
            System.out.println("2. Добавить сотрудника");
            System.out.println("3. Удалить сотрудника");
            System.out.println("4. Выход");
            System.out.print("> ");
            int choice = in.nextInt();
            in.nextLine(); // Очистка буфера

            switch (choice) {
                case 1:
                    System.out.print("Введите имя для поиска: ");
                    String searchName = in.nextLine();
                    manager.searchEmployee(searchName);
                    break;
                case 2:
                    System.out.print("Введите имя: ");
                    String name = in.nextLine();
                    System.out.print("Введите должность: ");
                    String position = in.nextLine();
                    System.out.print("Введите дату рождения: ");
                    String birthday = in.nextLine();
                    manager.addEmployee(name, position, birthday);
                    break;
                case 3:
                    System.out.print("Введите имя для удаления: ");
                    String removeName = in.nextLine();
                    manager.removeEmployee(removeName);
                    break;
                case 4:
                    System.out.println("Выход...");
                    in.close();
                    return;
                default:
                    System.out.println("Неверный выбор!");
            }
        }
    }
}