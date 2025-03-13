package laba10.example2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class JsonParserEmployee {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/laba10/example2/example-employee.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("employee");

            for (Object o : jsonArray) {
                JSONObject employee = (JSONObject) o;
                System.out.println("\nТекущий элемент: employee");
                System.out.println("Имя сотрудника: " + employee.get("Name"));
                System.out.println("Должность: " + employee.get("Position"));
                System.out.println("День рождения: " + employee.get("Birthday"));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
