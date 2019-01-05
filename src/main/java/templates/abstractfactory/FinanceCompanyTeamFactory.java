package templates.abstractfactory;

import templates.abstractfactory.banking.BankingTeamFactory;

/**
 * 05.01.2019
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */
public class FinanceCompanyTeamFactory {

    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();
        developer.writeCode();
        tester.testCode();
        projectManager.manageProgect();
    }

}
