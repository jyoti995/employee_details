import com.sun.deploy.cache.BaseLocalApplicationProperties;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadJSON<integer> {

    public static void main(String[] args) {

        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader("employees.json")) {
            Object obj = jsonParser.parse(reader);

            JSONObject employeeJson = (JSONObject) obj;
            System.out.println(employeeJson);

            JSONArray employeeList = (JSONArray) employeeJson.get("employees");


            employeeList.forEach(emp -> parseEmployeeObject((JSONObject) emp));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void parseEmployeeObject(JSONObject employee) {

        String first_name = (String) employee.get("first_name");
        System.out.println(first_name);

        String last_name = (String) employee.get("last_name");
        System.out.println(last_name);



        Integer age = ((Long)employee.get("age")).intValue();
        System.out.println(age);


        Integer id =  ((Long) employee.get("id")).intValue();
        System.out.println(id);

        JSONArray dependents = (JSONArray) employee.get("dependents");
        System.out.println(dependents);
    }
}



















