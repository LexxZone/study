package templates.factorymethod;

/**
 * 05.01.2019
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */
public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("jsd");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (
                speciality.equalsIgnoreCase("javascript") ||
                speciality.equalsIgnoreCase("js")) {
            return new JavaScriptDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " is unknown specialty");
        }
    }
}
