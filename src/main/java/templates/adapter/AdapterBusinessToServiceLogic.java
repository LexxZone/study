package templates.adapter;

/**
 * 05.01.2019
 *
 * @author Alexey Dvoryaninov  ( lexxzone@gmail.com )
 */
public class AdapterBusinessToServiceLogic extends BusinessLogic implements IService {

    @Override
    public void check() {
        checkResources();
    }

    @Override
    public void getStatus() {
        status();
    }

    @Override
    public void create() {
        createModel();
    }

    @Override
    public void update() {
        updateInfo();
    }
}
