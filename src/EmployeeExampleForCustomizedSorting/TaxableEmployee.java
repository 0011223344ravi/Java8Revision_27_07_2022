package EmployeeExampleForCustomizedSorting;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static EmployeeExampleForCustomizedSorting.EmployeeDTO.listOfEmployee;

public class TaxableEmployee {

    public static List<Employee> taxableEmployeeList(){
   List <Employee> elist  = listOfEmployee();

        List <Employee> elist1 = elist.stream().filter(emp->emp.getSalary()>500000).collect(Collectors.toList());
   return elist1;

    }


    public static void  maxSalariedEmployee(){
        List <Employee> elist  = listOfEmployee();

        elist.stream().sorted((o1,o2)->o1.salary>o2.salary?-1:(o1.salary<o2.salary)?1:0).limit(1).forEach(System.out::println);

        elist.stream().sorted(Comparator.comparing(e->e.getSalary())).forEach(System.out::println);


    }

    public static int SumOfAllEmployeeSalary(){
        List <Employee> elist  = listOfEmployee();

        int sum  = elist.stream().mapToInt(emp->emp.getSalary()).reduce(0,(a,b)->a+b);
        return sum;

    }

    public static void main (String args []) {

        List <Employee> elist = taxableEmployeeList();
        System.out.println(elist);

        int n = SumOfAllEmployeeSalary();
        System.out.println(n);

        maxSalariedEmployee();
    }
}
