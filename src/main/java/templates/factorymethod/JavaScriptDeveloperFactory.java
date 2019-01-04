package templates.factorymethod;

/**
 * 05.01.2019
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */
public class JavaScriptDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaScriptDeveloper();
    }
}
