package templates.abstractfactory.website;

import templates.abstractfactory.Tester;

/**
 * 05.01.2019
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */
public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester is testing website...");
    }
}
