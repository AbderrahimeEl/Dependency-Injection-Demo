package net.elm.metier;
import net.elm.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("metier")
public class MetierImpl implements IMetier{
    private IDao dao ;

    @Override
    public double calcule() {
        double result = dao.getData();
        return result*2;
    }

    // Injection by constructor
    @Autowired
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
