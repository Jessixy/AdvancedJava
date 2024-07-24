package ioStreams;

import java.io.*;

public class IOMain {

    public static void main(String[] args) throws IOException {

        System.out.println("IO");

        //byteDemo();
        charDemo();


    }

    static  void byteDemo () throws IOException {

        FileInputStream inStream = null;
        FileOutputStream outStream = null;

        try {
            inStream = new FileInputStream("C:\\Users\\jessi\\IdeaProjects\\AdvancedJava\\Simplilearn\\src\\ioStreams" +
                    "\\source.txt");
            outStream = new FileOutputStream("C:\\Users\\jessi\\IdeaProjects\\AdvancedJava\\Simplilearn\\src\\ioStreams" +
                    "\\dest.txt");

            // reads a bite at a time, if readche end of the file...
            int content;
            while ((content = inStream.read()) != -1) {
                outStream.write((byte) content);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (inStream!= null) inStream.close();
            if (outStream!= null) outStream.close();
        }


    }


    static void charDemo () throws IOException{
        FileReader readerStream = null;
        FileWriter writerStream = null;

        try {
            readerStream = new FileReader("C:\\Users\\jessi\\IdeaProjects\\AdvancedJava\\Simplilearn\\src\\ioStreams" +
                    "\\source.txt");
            writerStream = new FileWriter("C:\\Users\\jessi\\IdeaProjects\\AdvancedJava\\Simplilearn\\src\\ioStreams" +
                    "\\dest.txt");

            int content;
            while ((content = readerStream.read()) != -1) {
                writerStream.write((char) content);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (readerStream!= null) readerStream.close();
            if (writerStream!= null) writerStream.close();
        }







    }












}
