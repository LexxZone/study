package templates.factorymethod;

/**
 * 05.01.2019
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */
public class JavaScriptDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("JavaScript Developer is writing JavaScript code...");
    }
}
