package templates.abstractfactory.banking;

import templates.abstractfactory.Developer;

/**
 * 05.01.2019
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */
public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer is writing Java code...");
    }
}
