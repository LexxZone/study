package util;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 06.09.2018
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */
public class Writer {
    //private int counter;
    //private URI url;

    public void write(URI url, int counter) {
        try{
            System.out.println(url + " url");
            System.out.println(counter + " counter");
            Files.write(Paths.get(url), String.valueOf(++counter).getBytes());
        }
        catch(IOException ex){

            //secondLogger.error("IO...  " + ex);
        }
        catch(NullPointerException ex){

           // secondLogger.error("NullPointerEx...  " + ex);
        }
    }
}
