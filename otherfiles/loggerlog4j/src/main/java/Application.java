import bl.FileReader;
import bl.Reader;
import org.apache.log4j.Logger;
import util.StartCounter;

public class Application {
    final static Logger firstLogger = Logger.getLogger(Application.class);
    //final static Logger secondLogger = Logger.getLogger("s2Appender");

    public static void main(String[] args) {

        StartCounter startCounter = new StartCounter();
        firstLogger.info("\n __________ Initializing # ");
        firstLogger.error("Something gone wrong... 1 " );
        //secondLogger.info("message 1");
        firstLogger.error("Something gone wrong... 2 " );
        /*Reader reader = new FileReader();
        String message = reader.read();
        System.out.println(message);*/
    }
}
