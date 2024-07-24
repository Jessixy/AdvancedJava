package imagesPackage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagesMain {

    public static void main(String[] args) {
        System.out.println("Images");

        int width = 963;
        int height = 640;

        BufferedImage buffImage = null;

        // Read
        buffImage = readFromFile(width, height, buffImage);


        // Write
        writeToFile(buffImage);


    }


    private static BufferedImage readFromFile(
            int width,
            int height,
            BufferedImage buffImage)  {

        try {
            File sampleFile = new File("C:\\Users\\jessi\\Downloads\\bird1.jpg");
            buffImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            // Reading input file
            buffImage = ImageIO.read(sampleFile);
            System.out.println("Reading complete\n " + buffImage);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return buffImage;
    }

    private static void writeToFile(BufferedImage buffImage)  {

        try {
            File output = new File ("C:\\Users\\jessi\\IdeaProjects\\AdvancedJava\\Simplilearn\\src\\imagesPackage" +
                    "\\import.jpg");

            ImageIO.write(buffImage, "jpg", output);

            System.out.println("Writing complete");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
