package EmployeeExampleForCustomizedSorting;

import java.util.List;
import java.util.stream.Collectors;

public class MapVSFlatMap {

    public static void main(String[] args) {
        List<Employee> listOfCustomers = EmployeeDTO.listOfEmployee();

        List<String>  listOfName = listOfCustomers.stream().map(cust->cust.getName()).collect(Collectors.toList());
        System.out.println(listOfName);


        System.out.println(listOfCustomers.stream().map(cust->cust.getSalary()).collect(Collectors.toList()));
       //listOfCustomers.stream().flatMap(cust->cust.getSalary().stream()).collect(Collectors.toList()));//input stream of stream


        //int sum = listOfCustomers.stream().mapToInt(cust->cust.getId()).reduce(0, (a,b)->a+b);
        //System.out.println("sum  :- "+sum);  //using  reduce
    }
}
