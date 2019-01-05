package templates.abstractfactory.website;

import templates.abstractfactory.ProjectManager;

/**
 * 05.01.2019
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */
public class WebsitePM implements ProjectManager {
    @Override
    public void manageProgect() {
        System.out.println("Website manager is managing website");
    }
}
