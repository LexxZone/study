package templates.abstractfactory.website;

import templates.abstractfactory.Developer;
import templates.abstractfactory.ProjectManager;
import templates.abstractfactory.ProjectTeamFactory;
import templates.abstractfactory.Tester;

/**
 * 05.01.2019
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */
public class WebsteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
