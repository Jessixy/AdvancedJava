package nonBlocking;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

public class NonBlockingNIO {

    public static void main(String[] args) throws Exception {
        System.out.println("NIO - Non Blocking ");

        // Write
        writingExample();

        // Read
        readingExample();





    }

    static void readingExample() throws IOException {

        FileInputStream fin = null;

        try {
            fin = new FileInputStream("C:\\Users\\jessi\\IdeaProjects\\AdvancedJava\\Simplilearn\\src" +
                    "\\nonBlocking\\dest.txt");

            FileChannel readChannel = fin.getChannel();
            ByteBuffer readBuffer = ByteBuffer.allocate(1024);

            int result = readChannel.read(readBuffer);

            System.out.println("File read successfully");
            System.out.println(readChannel.size());

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (fin != null) {
                fin.close();
            }

        }


    }

    static void writingExample() throws Exception {
        // Lock the file for writing
            FileOutputStream fout = new FileOutputStream("C:\\Users\\jessi\\IdeaProjects\\AdvancedJava\\Simplilearn\\src" +
                    "\\nonBlocking\\dest.txt");

            FileChannel writeChannel = fout.getChannel();
            ByteBuffer writeBuffer = ByteBuffer.allocate(1024);

            String message = "This is a Test String";
            writeBuffer.put(message.getBytes());
            writeBuffer.flip(); // Reset the index
            writeChannel.write(writeBuffer);
            System.out.println("File written successfully");



    }
}
