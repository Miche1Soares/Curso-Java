package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {

        List<Employee> list = new ArrayList<>();

        String path = "/home/michel/Documentos/Programas/Java/Udemy/Aulas/a31/text/in.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader (path))) 
        {
            String employeeCsv = br.readLine(); 
            
            while (employeeCsv != null) 
            {
                String[] fields = employeeCsv.split(",");
                list.add(new Employee (fields[0], Double.parseDouble(fields[1]))); employeeCsv = br.readLine();
            }

            Collections.sort(list);

            for (Employee emp: list) 
            {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }
        } 
        catch (IOException e) 
        { 
            System.out.println("Error: " + e.getMessage());
        }

    }
}
