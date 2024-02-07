import model.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Employee> employeeList = new LinkedList<>();
//        Employee e1 = new Employee(1,"Eda", "Kalayci");
//        Employee e2 = new Employee(1,"Eda", "Kalayci");
//        Employee e3 = new Employee(2,"Yavuz", "Irmak");
//        Employee e4 = new Employee(2,"Yavuz", "Irmak");
//
//        employeeList.add(e1);
//        employeeList.add(e2);
//        employeeList.add(e3);
//        employeeList.add(e4);
//
//        Map<Integer, Employee> employeeMap = new HashMap<>();
//        List<Employee> removedEmployees = new ArrayList<>();
//
//        Iterator<Employee> iterator = employeeList.iterator();
//        while(iterator.hasNext()){
//            Employee employee = iterator.next();
//            if(employee == null){
//                System.out.println("null data");
//                continue;
//            }
//            if(employeeMap.containsKey(employee.getId())){
//                removedEmployees.add(employee);
//                //iterator.remove();
//            }
//            else{
//                employeeMap.put(employee.getId(), employee);
//            }
//        }
//        System.out.println(employeeList);
//        System.out.println(employeeMap);
//        System.out.println(removedEmployees);
          String text = "When the offensive resumed, the Turks received their first victory when the Greeks encountered stiff resistance in the battles of First and Second İnönü," + " due to İsmet Pasha's organization of an irregular militia into a regular army. " + " The two victories led to Allied proposals to amend the Treaty of Sèvres where both Ankara and Istanbul were represented, but Greece refused." + " With the conclusion of the Southern and Eastern fronts, Ankara was able to concentrate more forces on the West against the Greeks." + " They also began to receive support from Soviet Union, as well as France and Italy, who sought to check British influence in the Near East.\n" + " June–July 1921 saw heavy fighting in the Battle of Kütahya-Eskişehir. While it was an eventual Greek victory, the Turkish army withdrew in good order to the Sakarya river, their last line of defence." + " Mustafa Kemal Pasha replaced İsmet Pasha after the defeat as commander in chief as well as his political duties." + " The decision was made in the Greek military command to march on the nationalist capital of Ankara to force Mustafa Kemal to the negotiating table." + " For 21 days, the Turks and Greeks fought a pitched battle at the Sakarya river, which ended in Greek withdrawal." + " Almost of year of stalemate without much fighting followed, during which Greek moral and discipline faltered while Turkish strength increased." + " French and Italian forces evacuated from Anatolia. The Allies offered an armistice to the Turks, which Mustafa Kemal refused.";

          String[] words = text.toLowerCase().replaceAll("[,.!?]","").split("\\s");
          Map<String, Integer> counter = new HashMap<>();
          for (String word : words){
              if(counter.containsKey(word.toLowerCase())){
                  int count = counter.get(word.toLowerCase());
                  counter.put(word, count+1);
              }else{
                  counter.put(word,1);
              }
          }
          printMap(counter);



    }

    private static void printMap(Map<String, Integer> counter) {
        for(Map.Entry entry: counter.entrySet()){
            System.out.println("word: "+ entry.getKey() + " count: " +entry.getValue() );
        }
    }
}