package templates.abstractfactory.banking;

import templates.abstractfactory.ProjectManager;

/**
 * 05.01.2019
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */
public class BankingPM implements ProjectManager {
    @Override
    public void manageProgect() {
        System.out.println("Project manager is managing banking project...");
    }
}
