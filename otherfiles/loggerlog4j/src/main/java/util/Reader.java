package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 06.09.2018
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */
public class Reader {
    private int counter;
    public int read(URI url) {
        // проверили пустой ли файл
        try {
            FileInputStream fis = new FileInputStream(new File("url"));
            int b = fis.read();
            if (b == -1)
            {
                System.out.println("!!File " + url + " emty!!");
                Files.write(Paths.get(url), String.valueOf(0).getBytes());
            }
        } catch (IOException exx) {
            exx.printStackTrace();
            System.out.println("эмпти + запись в файл");
        }
        try {
            // считали файл
            byte[] fileBytes = Files.readAllBytes(Paths.get(url));
            //secondLogger.info("Byte array from file have been gotten");

            counter = Integer.parseInt(new String(fileBytes));
            //secondLogger.info("Message from file have been gotten" + counter);
            this.counter = counter;
            System.out.println(counter);

        }

        catch (NullPointerException | IOException e) {
            //secondLogger.error("Something gone wrong...  " + e);
        }

        return counter;
    }

}
