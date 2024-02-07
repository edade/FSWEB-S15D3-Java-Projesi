import model.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new LinkedList<>();
        Employee e1 = new Employee(1,"Eda", "Kalayci");
        Employee e2 = new Employee(1,"Eda", "Kalayci");
        Employee e3 = new Employee(2,"Yavuz", "Irmak");
        Employee e4 = new Employee(2,"Yavuz", "Irmak");

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);

        Map<Integer, Employee> employeeMap = new HashMap<>();
        List<Employee> removedEmployees = new ArrayList<>();

        Iterator<Employee> iterator = employeeList.iterator();
        while(iterator.hasNext()){
            Employee employee = iterator.next();
            if(employee == null){
                System.out.println("null data");
                continue;
            }
            if(employeeMap.containsKey(employee.getId())){
                removedEmployees.add(employee);
                //iterator.remove();
            }
            else{
                employeeMap.put(employee.getId(), employee);
            }
        }
        System.out.println(employeeList);
        System.out.println(employeeMap);
        System.out.println(removedEmployees);


    }
}