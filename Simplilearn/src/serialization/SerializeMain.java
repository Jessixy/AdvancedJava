package serialization;

import java.io.*;

public class SerializeMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Serializable Objects");

        Student student = new Student("Jessi", 42);

        String filename = "C:\\Users\\jessi\\IdeaProjects\\AdvancedJava\\serialize.txt";
        FileOutputStream fileOut;
        ObjectOutputStream objOut;

        // Serialization - Writing Objects to a file
        try {
            fileOut = new FileOutputStream(filename);
            objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(student);

            System.out.println("Object has been serialized: \n");

            objOut.close();
            fileOut.close();



        } catch (FileNotFoundException e) {
            System.out.println("IO Exception caught");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Deseserialization
        FileInputStream fileIn;
        ObjectInputStream objIn;

        try {
            fileIn = new FileInputStream(filename);
            objIn = new ObjectInputStream(fileIn);

            Student obj = (Student) objIn.readObject();

            System.out.println("Deserializing the object...\n");

            objIn.close();
            fileIn.close();

        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }


    }


}
