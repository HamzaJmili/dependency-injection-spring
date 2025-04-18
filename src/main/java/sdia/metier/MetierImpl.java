package sdia.metier;
import sdia.dao.Daoimpl;
import sdia.dao.IDao ;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    private IDao dao  ;

    public MetierImpl() {
    }

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        return 20;
    }



    public void SetDao(IDao dao) {
        this.dao = dao;
    }

    public void setDao(Daoimpl dao) {
    }
}
