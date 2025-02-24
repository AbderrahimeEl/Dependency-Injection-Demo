package net.elm.metier;
import net.elm.dao.IDao;
public class MetierImpl implements IMetier{
    private IDao dao ;

    @Override
    public double calcule() {
        double result = dao.getData();
        return result*2;
    }

    // Injection by constructor
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    // Injection by setter
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }
}
