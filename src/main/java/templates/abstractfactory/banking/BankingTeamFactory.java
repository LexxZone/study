package templates.abstractfactory.banking;

import templates.abstractfactory.Developer;
import templates.abstractfactory.ProjectManager;
import templates.abstractfactory.ProjectTeamFactory;
import templates.abstractfactory.Tester;

/**
 * 05.01.2019
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */
public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
