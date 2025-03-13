package laba10.example2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class JsonCreatorEmployee {
    public static void main(String[] args) {
        JSONObject libary = new JSONObject();
        JSONArray employee = new JSONArray();

        JSONObject employee1 = new JSONObject();
        employee1.put("Name", "Иванов И.И.");
        employee1.put("Position", "Разработчик");
        employee1.put("Birthday", "01.01.1990");

        JSONObject employee2 = new JSONObject();
        employee2.put("Name", "Петров П.П.");
        employee2.put("Position", "Аналитик");
        employee2.put("Birthday", "02.02.1990");

        JSONObject employee3 = new JSONObject();
        employee3.put("Name", "Сидоров В.Н.");
        employee3.put("Position", "Аналитик");
        employee3.put("Birthday", "22.12.1967");

        employee.add(employee1);
        employee.add(employee2);
        employee.add(employee3);

        libary.put("employee", employee);

        try (FileWriter file = new FileWriter("src/laba10/example2/example-employee.json")) {
            file.write(libary.toJSONString());
            System.out.println("Json файл успешно создан");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
