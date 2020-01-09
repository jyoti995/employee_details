import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * @jyoti
 */
public class Program {
    public static void main(String[] args) {




        JSONObject employeesJson=new JSONObject();
        JSONArray employeesArray = new JSONArray();

        JSONObject employeeDetails=new JSONObject();
        employeeDetails.put("first_name","Jyoti");
        employeeDetails.put("last_name","Senapati");
        employeeDetails.put("age",new Integer(23));
        employeeDetails.put("id",new Integer(2));

        JSONArray dependencyArray=new JSONArray();

        JSONObject dependencyDetails=new JSONObject();
        dependencyDetails.put("first_name","Sanghamitra");
        dependencyDetails.put("last_name","Senapati");
        dependencyDetails.put("relation","mother");

        JSONObject dependencyDetails1=new JSONObject();
        dependencyDetails1.put("first_name","mitra");
        dependencyDetails1.put("last_name","Senapati");
        dependencyDetails1.put("relation","father");

        dependencyArray.add(dependencyDetails);
        dependencyArray.add(dependencyDetails1);

        employeeDetails.put("dependents", dependencyArray);

        employeesArray.add(employeeDetails);


        JSONObject employeeDetails1=new JSONObject();
        employeeDetails1.put("first_name","itishree");
        employeeDetails1.put("last_name","Seth");
        employeeDetails1.put("age",new Integer(23));
        employeeDetails1.put("id",new Integer(5));

        employeesArray.add(employeeDetails1);

        employeesJson.put("employees", employeesArray);
        try {
            FileWriter file=new FileWriter("employees.json");
            file.write(employeesJson.toJSONString());
            file.flush();
        }
        catch (IOException e)  {
            e.printStackTrace();
        }
        }



    }

