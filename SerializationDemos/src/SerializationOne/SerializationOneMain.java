package SerializationOne;

import java.io.*;

public class SerializationOneMain {


    public static void main(String[] args) {
        System.out.println("Serialization Demo One");

        Employee emp1 = new Employee(20110,"John Doe");
        Employee emp2 = new Employee(20111,"Jane Doe");
        Employee emp3 = new Employee(20112,"James Bond");

        serializeEmployee(emp1);
        deserializeEmployee();
        
    }

    // Serialization Method
    static void serializeEmployee (Employee empToSerialize){
        try {
            FileOutputStream fileOut = new FileOutputStream("employeOut.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(empToSerialize);
            out.close();

            System.out.println("Serialization has been executed");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void deserializeEmployee () {

        try {
            FileInputStream fileIn = new FileInputStream("employeOut.txt");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);

            Employee empFromDeserialization = (Employee) objIn.readObject();
            System.out.println(empFromDeserialization.toString());

            fileIn.close();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }}
