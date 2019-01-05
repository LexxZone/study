package templates.abstractfactory.banking;

import templates.abstractfactory.Tester;

/**
 * 05.01.2019
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */
public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA Tester is testing banking code...");
    }
}
