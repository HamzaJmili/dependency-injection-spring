package sdia.dao;
import org.springframework.stereotype.Component;

@Component("dao")
public class Daoimpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version de base de données");
        double t = 34 ;
        return t;
    }
}
