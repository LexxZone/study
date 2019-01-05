package templates.abstractfactory.website;

import templates.abstractfactory.Developer;

/**
 * 05.01.2019
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */
public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer is writing PHP code...");
    }
}
