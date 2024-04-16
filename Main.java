package GK2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>();
        employees.add(new Experience(1, "Duy", "1991-02-01", "0905093492", "duy@gmail.com",
                "Experience", 7, "Data"));
        employees.add(new Fresher(2, "Huy", "1992-06-05", "0905992344", "huy@gmail.com",
                "Fresher", "2023-02-01", "Good", "Computer Science"));
        employees.add(new Intern(3, "Dat", "2000-11-10", "0905920139", "dat@gmail.com",
                "Intern", "Computer Science", "2024", "VKU"));
        
        System.out.println("Total number of employees: " + Employee.getEmployeeCount());

        String filename = "quanLyNhanVien.txt"; 
        FileManager.writeToFile(employees, filename);
        System.out.println("Employee data has been written to file: " + filename);

        List<Employee> employeesFromFile = FileManager.readFromFile(filename);

        System.out.println("Employee Information from file:");
        for (Employee employee : employeesFromFile) {
            employee.showInfo();
            System.out.println();
        }
    }
}

