package sdia.presentation;
import sdia.dao.Daoimpl;
import sdia.metier.MetierImpl ;



public class Pres1 {
    public static void main(String[] args) {
        Daoimpl d = new Daoimpl();
        MetierImpl metier = new MetierImpl(d);
      //  metier.SetDao(d);
        System.out.println("Résultat = "+metier.calcul());
    }
}
