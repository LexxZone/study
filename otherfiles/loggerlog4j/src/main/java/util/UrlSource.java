package util;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * 06.09.2018
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */
public class UrlSource {
    public URI getUrl() {
        URI url = null;
        try {
            // указали где файл
            url = ClassLoader.getSystemResource("counter.txt").toURI();

            //secondLogger.info("Message from file have been gotten");
        } catch (URISyntaxException exxx) {
            exxx.printStackTrace();
        }

        return url;
    }
}
