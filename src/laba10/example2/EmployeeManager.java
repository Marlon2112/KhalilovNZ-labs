package laba10.example2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class EmployeeManager {
    private JSONArray employees;
    private final String filePath;

    public EmployeeManager(String filePath) {
        this.filePath = filePath;
        loadEmployees();
    }

    // Загрузка данных из файла
    private void loadEmployees() {
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader(filePath)) {
            JSONObject libary = (JSONObject) parser.parse(reader);
            employees = (JSONArray) libary.get("employee");
        } catch (IOException | ParseException e) {
            e.printStackTrace();
            employees = new JSONArray();
        }
    }

    // Сохранение данных в файл
    private void saveChanges() {
        JSONObject libary = new JSONObject();
        libary.put("employee", employees);
        try (FileWriter file = new FileWriter(filePath)) {
            file.write(libary.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Преобразование JSONArray в Stream<JSONObject>
    private Stream<JSONObject> toStream(JSONArray array) {
        return StreamSupport.stream(array.spliterator(), false)
                .filter(obj -> obj instanceof JSONObject)
                .map(obj -> (JSONObject) obj);
    }

    // Поиск сотрудника по имени  Stream API
    public void searchEmployee(String name) {
        long count = toStream(employees)
                .filter(emp -> name.equals(emp.get("Name")))
                .peek(emp -> {
                    System.out.println("Найден сотрудник:");
                    System.out.println("Имя: " + emp.get("Name"));
                    System.out.println("Должность: " + emp.get("Position"));
                    System.out.println("День рождения: " + emp.get("Birthday"));
                })
                .count();

        if (count == 0) {
            System.out.println("Сотрудник с именем " + name + " не найден.");
        }
    }

    // Добавление сотрудника
    public void addEmployee(String name, String position, String birthday) {
        JSONObject newEmployee = new JSONObject();
        Object name1 = newEmployee.put("Name", name);
        newEmployee.put("Position", position);
        newEmployee.put("Birthday", birthday);
        employees.add(newEmployee);
        saveChanges();
        System.out.println("Сотрудник добавлен.");
    }

    // Удаление сотрудника по имени Iterator
    public void removeEmployee(String name) {
        Iterator iterator = employees.iterator();
        boolean removed = false;
        while (iterator.hasNext()) {
            JSONObject emp = (JSONObject) iterator.next();
            if (name.equals(emp.get("Name"))) {
                iterator.remove();
                removed = true;
            }
        }
        if (removed) {
            saveChanges();
            System.out.println("Сотрудник удален.");
        } else {
            System.out.println("Сотрудник не найден.");
        }
    }
}