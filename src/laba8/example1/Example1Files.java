package laba8.example1;
import java.io.*;

public class Example1Files {
    private static final String BASE_PATH = "src/laba8/example1/exampletests/";
    public static void main(String[] args) {
        new File(BASE_PATH).mkdirs(); // Создаем базовую папку, если она отсутствует
        example1();
        example2();
        example3();
        example4();
        example5();
        example6();
        example7();
        example8();
        example9();
        example10();
    }

    public static void example1() {
        try {
            File file = new File(BASE_PATH + "example1.txt");
            file.createNewFile();
            System.out.println("Файл создан: " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void example2() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(BASE_PATH +"example2.txt"))) {
            writer.write("Пример записи в файл");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void example3() {
        try (BufferedReader reader = new BufferedReader(new FileReader(BASE_PATH +"example2.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void example4() {
        File dir = new File(BASE_PATH +"exampleDir");
        if (dir.mkdir()) {
            System.out.println("Каталог создан: " + dir.getAbsolutePath());
        }
    }

    public static void example5() {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(BASE_PATH +"example5.dat"))) {
            dos.writeInt(123);
            dos.writeDouble(45.67);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void example6() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(BASE_PATH +"example5.dat"))) {
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void example7() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(BASE_PATH + "example7.txt"), "UTF-8"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void example8() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(BASE_PATH + "example8.txt"), "UTF-8"))) {
            writer.write("Тестовая строка");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void example9() {
        try (PrintWriter writer = new PrintWriter(BASE_PATH + "example9.txt", "UTF-8")) {
            writer.println("Первая строка");
            writer.println("Вторая строка");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void example10() {
        File file = new File(BASE_PATH + "example9.txt");
        if (file.delete()) {
            System.out.println("Файл удален: " + file.getAbsolutePath());
        }
    }
}
