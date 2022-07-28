package EmployeeExampleForCustomizedSorting;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDTO {

    public static List<Employee> listOfEmployee(){

        List<Employee>  al =new ArrayList<Employee>();
        al.add(new Employee(1, "Ravi",500000));
        al.add(new Employee(2, "Raju",300000));
        al.add(new Employee(3, "Preeti",700000));
        return al;




    }
}
