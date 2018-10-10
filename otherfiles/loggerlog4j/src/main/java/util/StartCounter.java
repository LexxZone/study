package util;

import org.apache.log4j.Logger;
import java.net.URI;
import java.net.URISyntaxException;

public class StartCounter {
    final static org.apache.log4j.Logger secondLogger = Logger.getLogger("SecondLogger");
    private int counter;
    private URI url;
    public int count() {

        UrlSource urlSource = new UrlSource();
        this.url = urlSource.getUrl();
        //TODO Сделать Throw ex для вызова кетча, что нет файла

        Reader reader = new Reader();
        counter = reader.read(this.url);

        Writer writer = new Writer();
        writer.write(this.url, this.counter);

        return counter;
    }
}
