package start;

import org.apache.log4j.Logger;

/**
 * 07.09.2018
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */
public class Application {
    private final static Logger logger = Logger.getLogger(Application.class);
    public static void main(String[] args) {
        logger.info("Старт приложения");
        logger.warn("Внимание!!!");
        logger.error("ErroR");
    }
}
