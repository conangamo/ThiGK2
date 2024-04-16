package GK2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class FileManager {
    static void writeToFile(List<Employee> employees, String filename) {
        try (FileOutputStream fos = new FileOutputStream(filename);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(employees);
            System.out.println("Data has been written to the file: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static List<Employee> readFromFile(String filename) {
        List<Employee> employees = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(filename);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            employees = (List<Employee>) ois.readObject();
            System.out.println("Data has been read from the file: " + filename);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return employees;
    }
}



