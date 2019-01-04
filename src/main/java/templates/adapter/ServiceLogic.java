package templates.adapter;

/**
 * 05.01.2019
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */
public class ServiceLogic {
    public static void main(String[] args) {
        IService businessService = new AdapterBusinessToServiceLogic();
        businessService.check();
        businessService.create();
        businessService.update();
        businessService.getStatus();
    }
}
